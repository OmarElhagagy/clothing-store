/*
 * Created on 2025-03-19 ( 17:24:39 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import static junit.framework.TestCase.assertNotNull;

import org.demo.entities.tooling.JpaTest;
import org.junit.Test;

public class WishlistJpaTest extends JpaTest {

    public static Wishlist getInitEntity() {
    	Wishlist entity = new Wishlist();
		// wishlistId is auto-incremented => do not set
		entity.setCustomerId( CustomerJpaTest.getInitEntity().getCustomerId() ) ;
		entity.setProductId( ProductJpaTest.getInitEntity().getProductId() ) ;
		entity.setAddedDate( java.time.LocalDate.parse("2001-06-22") ) ;
    	return entity;
	}
	
    private Wishlist createEntity() {
    	Wishlist entity = new Wishlist();
		// wishlistId is auto-incremented => do not set
		entity.setCustomerId( CustomerJpaTest.getInitEntity().getCustomerId() ) ;
		entity.setProductId( ProductJpaTest.getInitEntity().getProductId() ) ;
		entity.setAddedDate( java.time.LocalDate.parse("2002-06-22") ) ;
    	return entity;
    }


    private Object getEntityKey(Wishlist entity) {
    	return entity.getWishlistId();
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
