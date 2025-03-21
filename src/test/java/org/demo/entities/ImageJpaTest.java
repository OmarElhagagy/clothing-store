/*
 * Created on 2025-03-20 ( 10:03:14 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import static junit.framework.TestCase.assertNotNull;

import org.demo.entities.tooling.JpaTest;
import org.junit.Test;

public class ImageJpaTest extends JpaTest {

    public static Image getInitEntity() {
    	Image entity = new Image();
		// imageId is auto-incremented => do not set
		entity.setProductId( ProductJpaTest.getInitEntity().getProductId() ) ;
		entity.setImageUrl( "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" ) ;
    	return entity;
	}
	
    private Image createEntity() {
    	Image entity = new Image();
		// imageId is auto-incremented => do not set
		entity.setProductId( ProductJpaTest.getInitEntity().getProductId() ) ;
		entity.setImageUrl( "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB" ) ;
    	return entity;
    }


    private Object getEntityKey(Image entity) {
    	return entity.getImageId();
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
