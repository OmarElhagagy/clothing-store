/*
 * Created on 2025-03-19 ( 17:24:34 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * JPA entity class for "Categories"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Categories", schema="public", catalog="clothes_store_db" )
public class Categories implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Category_ID", nullable=false)
    private int        categoryId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="Category_Name", nullable=false, length=50)
    private String     categoryName ;


    //--- ENTITY LINKS ( RELATIONSHIP )

    /**
     * Constructor
     */
    public Categories() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setCategoryId( int categoryId ) {
        this.categoryId = categoryId ;
    }
    public int getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryName( String categoryName ) {
        this.categoryName = categoryName ;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    //--- GETTERS FOR LINKS
    //--- toString specific method
	@Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("Categories[");
		sb.append("categoryId=").append(categoryId);
		sb.append(separator).append("categoryName=").append(categoryName);
		sb.append("]");
		return sb.toString();
	}
}
