/*
 * Created on 2025-03-20 ( 10:03:15 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import java.io.Serializable;
import java.util.Objects;  import java.time.LocalDate;
import javax.persistence.*;

/**
 * JPA entity class for "Notification"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Notification", schema="public", catalog="clothes_store_db" )
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Notification_ID", nullable=false)
    private int        notificationId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="Customer_ID")
    private Integer    customerId ;

    @Column(name="Store_ID")
    private Integer    storeId ;

    @Column(name="Product_ID")
    private Integer    productId ;

    @Column(name="Employee_ID")
    private Integer    employeeId ;

    @Column(name="Message", nullable=false, length=255)
    private String     message ;

    @Column(name="Sent_Date", nullable=false)
    private LocalDate  sentDate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="Customer_ID", referencedColumnName="Customer_ID", insertable=false, updatable=false)
    private Customer   customer ; 

    @ManyToOne
    @JoinColumn(name="Employee_ID", referencedColumnName="Employee_ID", insertable=false, updatable=false)
    private Employee   employee ; 

    @ManyToOne
    @JoinColumn(name="Product_ID", referencedColumnName="Product_ID", insertable=false, updatable=false)
    private Product    product ; 

    @ManyToOne
    @JoinColumn(name="Store_ID", referencedColumnName="Store_ID", insertable=false, updatable=false)
    private Store      store ; 


    /**
     * Constructor
     */
    public Notification() {
        super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setNotificationId( int notificationId ) {
        this.notificationId = notificationId ;
    }
    public int getNotificationId() {
        return this.notificationId;
    }

    public void setCustomerId( Integer customerId ) {
        this.customerId = customerId ;
    }
    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setStoreId( Integer storeId ) {
        this.storeId = storeId ;
    }
    public Integer getStoreId() {
        return this.storeId;
    }

    public void setProductId( Integer productId ) {
        this.productId = productId ;
    }
    public Integer getProductId() {
        return this.productId;
    }

    public void setEmployeeId( Integer employeeId ) {
        this.employeeId = employeeId ;
    }
    public Integer getEmployeeId() {
        return this.employeeId;
    }

    public void setMessage( String message ) {
        this.message = message ;
    }
    public String getMessage() {
        return this.message;
    }

    public void setSentDate( LocalDate sentDate ) {
        this.sentDate = sentDate ;
    }
    public LocalDate getSentDate() {
        return this.sentDate;
    }

    //--- GETTERS FOR LINKS
    public Customer getCustomer() {
        return this.customer;
    } 

    public Employee getEmployee() {
        return this.employee;
    } 

    public Product getProduct() {
        return this.product;
    } 

    public Store getStore() {
        return this.store;
    } 

    //--- toString specific method
    @Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("Notification[");
		sb.append("notificationId=").append(notificationId);
		sb.append(separator).append("customerId=").append(customerId);
		sb.append(separator).append("storeId=").append(storeId);
		sb.append(separator).append("productId=").append(productId);
		sb.append(separator).append("employeeId=").append(employeeId);
		sb.append(separator).append("message=").append(message);
		sb.append(separator).append("sentDate=").append(sentDate);
		sb.append("]");
		return sb.toString();
	}

    //--- equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return notificationId == that.notificationId#elseObjects.equals(notificationId, that.notificationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationId);
    }
}