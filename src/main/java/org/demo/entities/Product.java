/*
 * Created on 2025-03-20 ( 10:03:16 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import java.io.Serializable;
import java.util.Objects;  import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * JPA entity class for "Product"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Product", schema="public", catalog="clothes_store_db" )
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Product_ID", nullable=false)
    private int        productId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="Supplier_ID")
    private Integer    supplierId ;

    @Column(name="Product_Name", nullable=false, length=100)
    private String     productName ;

    @Column(name="Size", nullable=false, length=10)
    private String     size ;

    @Column(name="Brand", nullable=false, length=50)
    private String     brand ;

    @Column(name="Price", nullable=false)
    private BigDecimal price ;

    @Column(name="Color", nullable=false, length=30)
    private String     color ;

    @Column(name="Launch_Date", nullable=false)
    private LocalDate  launchDate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="Supplier_ID", referencedColumnName="Supplier_ID", insertable=false, updatable=false)
    private Supplier   supplier ; 


    /**
     * Constructor
     */
    public Product() {
        super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setProductId( int productId ) {
        this.productId = productId ;
    }
    public int getProductId() {
        return this.productId;
    }

    public void setSupplierId( Integer supplierId ) {
        this.supplierId = supplierId ;
    }
    public Integer getSupplierId() {
        return this.supplierId;
    }

    public void setProductName( String productName ) {
        this.productName = productName ;
    }
    public String getProductName() {
        return this.productName;
    }

    public void setSize( String size ) {
        this.size = size ;
    }
    public String getSize() {
        return this.size;
    }

    public void setBrand( String brand ) {
        this.brand = brand ;
    }
    public String getBrand() {
        return this.brand;
    }

    public void setPrice( BigDecimal price ) {
        this.price = price ;
    }
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setColor( String color ) {
        this.color = color ;
    }
    public String getColor() {
        return this.color;
    }

    public void setLaunchDate( LocalDate launchDate ) {
        this.launchDate = launchDate ;
    }
    public LocalDate getLaunchDate() {
        return this.launchDate;
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
		sb.append("Product[");
		sb.append("productId=").append(productId);
		sb.append(separator).append("supplierId=").append(supplierId);
		sb.append(separator).append("productName=").append(productName);
		sb.append(separator).append("size=").append(size);
		sb.append(separator).append("brand=").append(brand);
		sb.append(separator).append("price=").append(price);
		sb.append(separator).append("color=").append(color);
		sb.append(separator).append("launchDate=").append(launchDate);
		sb.append("]");
		return sb.toString();
	}

    //--- equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return productId == that.productId#elseObjects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}