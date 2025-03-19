/*
 * Created on 2025-03-19 ( 17:24:35 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * JPA entity class for "Employee"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Employee", schema="public", catalog="clothes_store_db" )
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Employee_ID", nullable=false)
    private int        employeeId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="Store_ID", nullable=false)
    private int        storeId ;

    @Column(name="Storage_No")
    private Integer    storageNo ;

    @Column(name="F_Name", nullable=false, length=50)
    private String     fName ;

    @Column(name="M_Name", length=50)
    private String     mName ;

    @Column(name="L_Name", nullable=false, length=50)
    private String     lName ;

    @Column(name="Email", nullable=false, length=255)
    private String     email ;

    @Column(name="Gender", nullable=false, length=1)
    private String     gender ;

    @Column(name="Role", nullable=false, length=50)
    private String     role ;

    @Column(name="Supervisor")
    private Integer    supervisor ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="Storage_No", referencedColumnName="Storage_No", insertable=false, updatable=false)
    private Storage    storage ; 

    @ManyToOne
    @JoinColumn(name="Store_ID", referencedColumnName="Store_ID", insertable=false, updatable=false)
    private Store      store ; 

    @ManyToOne
    @JoinColumn(name="Supervisor", referencedColumnName="Employee_ID", insertable=false, updatable=false)
    private Employee   employee ; 


    /**
     * Constructor
     */
    public Employee() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setEmployeeId( int employeeId ) {
        this.employeeId = employeeId ;
    }
    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setStoreId( int storeId ) {
        this.storeId = storeId ;
    }
    public int getStoreId() {
        return this.storeId;
    }

    public void setStorageNo( Integer storageNo ) {
        this.storageNo = storageNo ;
    }
    public Integer getStorageNo() {
        return this.storageNo;
    }

    public void setFName( String fName ) {
        this.fName = fName ;
    }
    public String getFName() {
        return this.fName;
    }

    public void setMName( String mName ) {
        this.mName = mName ;
    }
    public String getMName() {
        return this.mName;
    }

    public void setLName( String lName ) {
        this.lName = lName ;
    }
    public String getLName() {
        return this.lName;
    }

    public void setEmail( String email ) {
        this.email = email ;
    }
    public String getEmail() {
        return this.email;
    }

    public void setGender( String gender ) {
        this.gender = gender ;
    }
    public String getGender() {
        return this.gender;
    }

    public void setRole( String role ) {
        this.role = role ;
    }
    public String getRole() {
        return this.role;
    }

    public void setSupervisor( Integer supervisor ) {
        this.supervisor = supervisor ;
    }
    public Integer getSupervisor() {
        return this.supervisor;
    }

    //--- GETTERS FOR LINKS
    public Storage getStorage() {
        return this.storage;
    } 

    public Store getStore() {
        return this.store;
    } 

    public Employee getEmployee() {
        return this.employee;
    } 

    //--- toString specific method
	@Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("Employee[");
		sb.append("employeeId=").append(employeeId);
		sb.append(separator).append("storeId=").append(storeId);
		sb.append(separator).append("storageNo=").append(storageNo);
		sb.append(separator).append("fName=").append(fName);
		sb.append(separator).append("mName=").append(mName);
		sb.append(separator).append("lName=").append(lName);
		sb.append(separator).append("email=").append(email);
		sb.append(separator).append("gender=").append(gender);
		sb.append(separator).append("role=").append(role);
		sb.append(separator).append("supervisor=").append(supervisor);
		sb.append("]");
		return sb.toString();
	}
}
