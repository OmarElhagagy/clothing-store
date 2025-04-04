/*
 * Created on 2025-03-20 ( 10:03:16 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import static junit.framework.TestCase.assertNotNull;

import org.demo.entities.tooling.JpaTest;
import org.junit.Test;

public class ReviewsJpaTest extends JpaTest {

    public static Reviews getInitEntity() {
    	Reviews entity = new Reviews();
		// reviewId is auto-incremented => do not set
		entity.setProductId( ProductJpaTest.getInitEntity().getProductId() ) ;
		entity.setCustomerId( CustomerJpaTest.getInitEntity().getCustomerId() ) ;
		entity.setRating( 100 ) ;
		entity.setComment( "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" ) ;
		entity.setReviewDate( java.time.LocalDateTime.parse("2001-05-21T01:46:52") ) ;
    	return entity;
	}
	
    private Reviews createEntity() {
    	Reviews entity = new Reviews();
		// reviewId is auto-incremented => do not set
		entity.setProductId( ProductJpaTest.getInitEntity().getProductId() ) ;
		entity.setCustomerId( CustomerJpaTest.getInitEntity().getCustomerId() ) ;
		entity.setRating( 200 ) ;
		entity.setComment( "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" ) ;
		entity.setReviewDate( java.time.LocalDateTime.parse("2002-05-21T02:46:52") ) ;
    	return entity;
    }


    private Object getEntityKey(Reviews entity) {
    	return entity.getReviewId();
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
