/*
 * Created on 2025-03-20 ( 10:03:13 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 4.2.0
 */
package org.demo.entities;

import java.io.Serializable;
import java.util.Objects;  import java.time.LocalDateTime;
import javax.persistence.*;

/**
 * JPA entity class for "AuditLog"
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="Audit_Log", schema="public", catalog="clothes_store_db" )
public class AuditLog implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Log_ID", nullable=false)
    private int        logId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="User_ID")
    private Integer    userId ;

    @Column(name="Employee_ID")
    private Integer    employeeId ;

    @Column(name="Action", nullable=false, length=50)
    private String     action ;

    @Column(name="Table_Name", length=50)
    private String     tableName ;

    @Column(name="Record_ID")
    private Integer    recordId ;

    @Column(name="Timestamp", nullable=false)
    private LocalDateTime timestamp ;


    //--- ENTITY LINKS ( RELATIONSHIP )
    @ManyToOne
    @JoinColumn(name="Employee_ID", referencedColumnName="Employee_ID", insertable=false, updatable=false)
    private Employee   employee ; 

    @ManyToOne
    @JoinColumn(name="User_ID", referencedColumnName="User_ID", insertable=false, updatable=false)
    private Users      users ; 


    /**
     * Constructor
     */
    public AuditLog() {
        super();
    }
    
    //--- GETTERS & SETTERS FOR FIELDS
    public void setLogId( int logId ) {
        this.logId = logId ;
    }
    public int getLogId() {
        return this.logId;
    }

    public void setUserId( Integer userId ) {
        this.userId = userId ;
    }
    public Integer getUserId() {
        return this.userId;
    }

    public void setEmployeeId( Integer employeeId ) {
        this.employeeId = employeeId ;
    }
    public Integer getEmployeeId() {
        return this.employeeId;
    }

    public void setAction( String action ) {
        this.action = action ;
    }
    public String getAction() {
        return this.action;
    }

    public void setTableName( String tableName ) {
        this.tableName = tableName ;
    }
    public String getTableName() {
        return this.tableName;
    }

    public void setRecordId( Integer recordId ) {
        this.recordId = recordId ;
    }
    public Integer getRecordId() {
        return this.recordId;
    }

    public void setTimestamp( LocalDateTime timestamp ) {
        this.timestamp = timestamp ;
    }
    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    //--- GETTERS FOR LINKS
    public Employee getEmployee() {
        return this.employee;
    } 

    public Users getUsers() {
        return this.users;
    } 

    //--- toString specific method
    @Override
	public String toString() { 
		String separator = "|";
		StringBuilder sb = new StringBuilder();
		sb.append("AuditLog[");
		sb.append("logId=").append(logId);
		sb.append(separator).append("userId=").append(userId);
		sb.append(separator).append("employeeId=").append(employeeId);
		sb.append(separator).append("action=").append(action);
		sb.append(separator).append("tableName=").append(tableName);
		sb.append(separator).append("recordId=").append(recordId);
		sb.append(separator).append("timestamp=").append(timestamp);
		sb.append("]");
		return sb.toString();
	}

    //--- equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuditLog that = (AuditLog) o;
        return logId == that.logId#elseObjects.equals(logId, that.logId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logId);
    }
}