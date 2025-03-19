/*
 * Created on 2025-03-19 ( 17:24:37 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

/**
 * JPA entity class for "PriceHistory"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Price_History", schema="public", catalog="clothes_store_db" )
public class PriceHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="History_ID", nullable=false)
    private int        historyId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="Product_ID", nullable=false)
    private int        productId ;

    @Column(name="Price", nullable=false)
    private BigDecimal price ;

    @Column(name="Change_Date", nullable=false)
    private LocalDate  changeDate ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="Product_ID", referencedColumnName="Product_ID", insertable=false, updatable=false)
    private Product    product ; 


    /**
     * Constructor
     */
    public PriceHistory() {
		super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setHistoryId( int historyId ) {
        this.historyId = historyId ;
    }
    public int getHistoryId() {
        return this.historyId;
    }

    public void setProductId( int productId ) {
        this.productId = productId ;
    }
    public int getProductId() {
        return this.productId;
    }

    public void setPrice( BigDecimal price ) {
        this.price = price ;
    }
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setChangeDate( LocalDate changeDate ) {
        this.changeDate = changeDate ;
    }
    public LocalDate getChangeDate() {
        return this.changeDate;
    }

    //--- GETTERS FOR LINKS
    public Product getProduct() {
        return this.product;
    } 

    //--- toString specific method
	@Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("PriceHistory[");
		sb.append("historyId=").append(historyId);
		sb.append(separator).append("productId=").append(productId);
		sb.append(separator).append("price=").append(price);
		sb.append(separator).append("changeDate=").append(changeDate);
		sb.append("]");
		return sb.toString();
	}
}
