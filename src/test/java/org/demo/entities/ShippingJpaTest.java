/*
 * Created on 2025-03-20 ( 10:03:17 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import static junit.framework.TestCase.assertNotNull;

import org.demo.entities.tooling.JpaTest;
import org.junit.Test;

public class ShippingJpaTest extends JpaTest {

    public static Shipping getInitEntity() {
    	Shipping entity = new Shipping();
		// shippingId is auto-incremented => do not set
		entity.setOrderId( CustomerOrderJpaTest.getInitEntity().getOrderId() ) ;
		entity.setTrackingNumber( "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" ) ;
		entity.setShippingProvider( "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" ) ;
		entity.setShippedDate( java.time.LocalDateTime.parse("2001-05-21T01:46:52") ) ;
		entity.setDeliveredDate( java.time.LocalDateTime.parse("2001-05-21T01:46:52") ) ;
    	return entity;
	}
	
    private Shipping createEntity() {
    	Shipping entity = new Shipping();
		// shippingId is auto-incremented => do not set
		entity.setOrderId( CustomerOrderJpaTest.getInitEntity().getOrderId() ) ;
		entity.setTrackingNumber( "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" ) ;
		entity.setShippingProvider( "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" ) ;
		entity.setShippedDate( java.time.LocalDateTime.parse("2002-05-21T02:46:52") ) ;
		entity.setDeliveredDate( java.time.LocalDateTime.parse("2002-05-21T02:46:52") ) ;
    	return entity;
    }


    private Object getEntityKey(Shipping entity) {
    	return entity.getShippingId();
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
