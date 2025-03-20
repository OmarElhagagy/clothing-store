/*
 * Created on 2025-03-20 ( 10:03:18 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities.tooling;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * Generic abstract class for JPA JUnit test cases
 *  
 * @author Telosys
 */
public abstract class JpaTest {
	
	/**
	 * JPA Persistence Unit name for unit tests 
	 * Must be the same as in "src/test/resources/META-INF/persistence.xml"
	 */
	private static final String PERSISTENCE_UNIT_NAME = "h2-test";
	
	private static final boolean LOG_FLAG = true;

	protected static EntityManagerFactory emf;

	/**
	 * Prints a log message
	 * @param msg
	 */
	protected static void log(String msg) {
		if (LOG_FLAG) {
			System.out.println("[LOG-TEST] " + msg);
			System.out.flush();
		}
	}
	
	private EntityManager createEntityManager()  {
		log("  createEntityManager()...");
		return emf.createEntityManager();
	}

	private void closeEntityManager(EntityManager em)  {
		log("  closeEntityManager(em)...");
		em.clear();
		em.close();
	}
	
	@BeforeClass
	public static void setUpBeforeClass() {
		log("----- BeforeClass : Initializing JPA env...");
		// All database tables are created before each test case class 
		// thanks to 'persistence.xml' property "hibernate.hbm2ddl.auto" set to "create"
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		log("----- AfterClass : Closing JPA env...");
		if ( emf != null ) {
	        emf.close();
		}
	}

	@Before
	public void setUpBeforeTest() throws Exception {
		log("--- Before test : setUpBeforeTest()...");
		EntityManager em = createEntityManager();
		log("  DatabaseInit.init(em)...");
		DatabaseInit.initializeTablesData(em);
		closeEntityManager(em); 
		log("  Database initialized and ready for test.");
	}

	@After
	public void tearDownAfterTest() throws Exception {
		log("--- After test : tearDownAfterTest()...");
	}

    /**
     * Call em.find(entityClass, pk)
     * @param <T>
     * @param entityClass
     * @param pk
     * @return
     */
    protected <T> T find(Class<T> entityClass, Object pk) {
    	log("find(" + entityClass.getSimpleName() + ", " + pk +")");
    	return findAndPossiblyRefresh(entityClass, pk, false);
    }
    
    /**
     * Call em.find(entityClass, pk) and call em.refresh(entity) if entity found
     * @param <T>
     * @param entityClass
     * @param pk
     * @return
     */
    protected <T> T findAndRefresh(Class<T> entityClass, Object pk) {
    	log("findAndRefresh(" + entityClass.getSimpleName() + ", " + pk +")");
    	return findAndPossiblyRefresh(entityClass, pk, true);
    }

    /**
     * Calls find then call refresh if flag is true
     * @param <T>
     * @param entityClass
     * @param pk
     * @param refreshFlag
     * @return
     */
    private <T> T findAndPossiblyRefresh(Class<T> entityClass, Object pk, boolean refreshFlag) {
		EntityManager em = createEntityManager();
    	T entity = em.find(entityClass, pk);
    	if ( entity != null ) {
        	log("  em.find(entity,pk) : found ");
        	if ( refreshFlag ) {
            	log("  em.refresh(entity)");
            	em.refresh(entity); // Useful to refresh links => SQL SELECT 
        	}
    	} else {
        	log("  em.find(entity,pk) : not found ");
    	}
		closeEntityManager(em); 
    	return entity ;
    }
	
    /**
     * Call em.persist(entity) in a transaction
     * @param entity
     */
    protected void persist(Object entity) {
    	log("persist("+entity+")");
    	persistAndPossiblyRefresh(entity, false);
    }
    
    /**
     * Call em.persist(entity) in a transaction then call em.refresh(entity)
     * @param entity
     */
    protected void persistAndRefresh(Object entity) {
    	log("persistAndRefresh("+entity+")");
    	persistAndPossiblyRefresh(entity, true);
    }
    
    /**
     * Calls persist then call refresh if flag is true
     * @param entity
     * @param refreshFlag
     */
    private void persistAndPossiblyRefresh(Object entity, boolean refreshFlag) {
    	log("persistAndRefresh("+entity+")");
		EntityManager em = createEntityManager();
    	log("  em.getTransaction().begin()");
    	em.getTransaction().begin();
    	log("  em.persist(entity)");
    	em.persist(entity);
    	log("  em.getTransaction().commit()");
    	em.getTransaction().commit();
    	// Refresh ?
    	if ( refreshFlag ) {
        	log("  em.refresh("+entity+")");
        	em.refresh(entity); // Useful to refresh links => SQL SELECT 
    	}
		closeEntityManager(em); 
    }

    /**
     * Calls em.merge(entity) in a transaction 
     * @param entity
     * @return the managed entity (object returned by JPA merge)
     */
    protected Object merge(Object entity) {
    	log("merge("+entity+")");
    	return mergeAndPossiblyRefresh(entity, false);
    }
    
    /**
     * Calls em.merge(entity) in a transaction and refresh the managed entity
     * @param entity
     * @return the managed entity (object returned by JPA merge and refreshed)
     */
    protected Object mergeAndRefresh(Object entity) {
    	log("mergeAndRefresh("+entity+")");
    	return mergeAndPossiblyRefresh(entity, false);
    }
    
    /**
     * Call merge then call refresh if flag is true
     * @param entity
     * @param refreshFlag
     * @return
     */
    private Object mergeAndPossiblyRefresh(Object entity, boolean refreshFlag) {
		EntityManager em = createEntityManager();
    	// Merge
    	log("  em.getTransaction().begin()");
    	em.getTransaction().begin();
    	log("  em.merge("+entity+")");
    	Object managedEntity = em.merge(entity);
    	log("  em.getTransaction().commit()");
    	em.getTransaction().commit();
    	// Refresh ?
    	if ( refreshFlag ) {
        	log("  em.refresh("+managedEntity+")");
        	em.refresh(managedEntity); // Useful to refresh links => SQL SELECT 
    	}
		closeEntityManager(em); 
    	return managedEntity;
    }

    /**
     * Try to find an entity and call em.remove(entity) in a transaction 
     * @param <T>
     * @param entityClass
     * @param pk
     * @return true if found and removed, else false
     */
    protected <T> boolean findAndRemove(Class<T> entityClass, Object pk) {
    	boolean removed = false;
    	log("findAndRemove(" + entityClass.getSimpleName() + ", " + pk +")");
		EntityManager em = createEntityManager();
    	log("  em.find(entity,pk) ");
		T entity = em.find(entityClass, pk);
		if ( entity != null ) {
        	log("  found ");
        	log("  em.getTransaction().begin()");
        	em.getTransaction().begin();
        	log("  em.remove(entity)");
        	em.remove(entity);
        	log("  em.getTransaction().commit()");
        	em.getTransaction().commit();
        	removed = true;
		}
		else {
        	log("  not found ");
        	removed = false;
		}
		closeEntityManager(em); 
		return removed;
    }

}
