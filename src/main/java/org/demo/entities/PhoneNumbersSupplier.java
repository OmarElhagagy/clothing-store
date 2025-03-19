/*
 * Created on 2025-03-19 ( 17:24:36 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * JPA entity class for "PhoneNumbersSupplier"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Phone_Numbers_Supplier", schema="public", catalog="clothes_store_db" )
public class PhoneNumbersSupplier implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="Phone_Number", nullable=false, length=20)
    private String     phoneNumber ;

    //--- ENTITY DATA FIELDS 
    @Column(name="Supplier_ID", nullable=false)
    private int        supplierId ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="Supplier_ID", referencedColumnName="Supplier_ID", insertable=false, updatable=false)
    private Supplier   supplier ; 


    /**
     * Constructor
     */
    public PhoneNumbersSupplier() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setPhoneNumber( String phoneNumber ) {
        this.phoneNumber = phoneNumber ;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setSupplierId( int supplierId ) {
        this.supplierId = supplierId ;
    }
    public int getSupplierId() {
        return this.supplierId;
    }

    //--- GETTERS FOR LINKS
    public Supplier getSupplier() {
        return this.supplier;
    } 

    //--- toString specific method
	@Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("PhoneNumbersSupplier[");
		sb.append("phoneNumber=").append(phoneNumber);
		sb.append(separator).append("supplierId=").append(supplierId);
		sb.append("]");
		return sb.toString();
	}
}
