/*
 * Created on 2025-03-20 ( 10:03:17 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import java.io.Serializable;
import java.util.Objects;  import javax.persistence.*;

/**
 * JPA entity class for "Store"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Store", schema="public", catalog="clothes_store_db" )
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Store_ID", nullable=false)
    private int        storeId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="Address", nullable=false, length=255)
    private String     address ;

    @Column(name="Email", nullable=false, length=255)
    private String     email ;

    @Column(name="Min_Stock", nullable=false)
    private int        minStock ;


    //--- ENTITY LINKS ( RELATIONSHIP )

    /**
     * Constructor
     */
    public Store() {
        super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setStoreId( int storeId ) {
        this.storeId = storeId ;
    }
    public int getStoreId() {
        return this.storeId;
    }

    public void setAddress( String address ) {
        this.address = address ;
    }
    public String getAddress() {
        return this.address;
    }

    public void setEmail( String email ) {
        this.email = email ;
    }
    public String getEmail() {
        return this.email;
    }

    public void setMinStock( int minStock ) {
        this.minStock = minStock ;
    }
    public int getMinStock() {
        return this.minStock;
    }

    //--- GETTERS FOR LINKS
    //--- toString specific method
    @Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("Store[");
		sb.append("storeId=").append(storeId);
		sb.append(separator).append("address=").append(address);
		sb.append(separator).append("email=").append(email);
		sb.append(separator).append("minStock=").append(minStock);
		sb.append("]");
		return sb.toString();
	}

    //--- equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store that = (Store) o;
        return storeId == that.storeId#elseObjects.equals(storeId, that.storeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId);
    }
}