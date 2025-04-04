/*
 * Created on 2025-03-20 ( 10:03:17 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import static junit.framework.TestCase.assertNotNull;

import org.demo.entities.tooling.JpaTest;
import org.junit.Test;

public class StoreJpaTest extends JpaTest {

    public static Store getInitEntity() {
    	Store entity = new Store();
		// storeId is auto-incremented => do not set
		entity.setAddress( "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" ) ;
		entity.setEmail( "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" ) ;
		entity.setMinStock( 100 ) ;
    	return entity;
	}
	
    private Store createEntity() {
    	Store entity = new Store();
		// storeId is auto-incremented => do not set
		entity.setAddress( "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" ) ;
		entity.setEmail( "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" ) ;
		entity.setMinStock( 200 ) ;
    	return entity;
    }


    private Object getEntityKey(Store entity) {
    	return entity.getStoreId();
    }

    @Test
    public void testFind() {
		// NB: this entity has an GENERATED PRIMARY KEY
		// Cannot use a generic test with this kind of PK
		// Create a specific test for this case
    }
    
    @Test
    public void testPersistFind() {
		// NB: this entity has an GENERATED PRIMARY KEY
		// Cannot use a generic test with this kind of PK
		// Create a specific test for this case
    }

    @Test
    public void testMergeFind() {
		// NB: this entity has an GENERATED PRIMARY KEY
		// Cannot use a generic test with this kind of PK
		// Create a specific test for this case
    }

}
