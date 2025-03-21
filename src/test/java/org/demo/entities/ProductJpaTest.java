/*
 * Created on 2025-03-20 ( 10:03:16 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import static junit.framework.TestCase.assertNotNull;

import org.demo.entities.tooling.JpaTest;
import org.junit.Test;

public class ProductJpaTest extends JpaTest {

    public static Product getInitEntity() {
    	Product entity = new Product();
		// productId is auto-incremented => do not set
		entity.setSupplierId( SupplierJpaTest.getInitEntity().getSupplierId() ) ;
		entity.setProductName( "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" ) ;
		entity.setSize( "AAAAAAAAAA" ) ;
		entity.setBrand( "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" ) ;
		entity.setPrice( java.math.BigDecimal.valueOf(10000.77) ) ;
		entity.setColor( "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" ) ;
		entity.setLaunchDate( java.time.LocalDate.parse("2001-06-22") ) ;
    	return entity;
	}
	
    private Product createEntity() {
    	Product entity = new Product();
		// productId is auto-incremented => do not set
		entity.setSupplierId( SupplierJpaTest.getInitEntity().getSupplierId() ) ;
		entity.setProductName( "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" ) ;
		entity.setSize( "BBBBBBBBBB" ) ;
		entity.setBrand( "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" ) ;
		entity.setPrice( java.math.BigDecimal.valueOf(20000.77) ) ;
		entity.setColor( "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" ) ;
		entity.setLaunchDate( java.time.LocalDate.parse("2002-06-22") ) ;
    	return entity;
    }


    private Object getEntityKey(Product entity) {
    	return entity.getProductId();
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
