/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.touch.point.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author reswaran
 */
@XmlRootElement(name ="BranchTesting")
public class Branch {
	
		private String bankName;
	    private String bankCode;
	    private String branchName;
	    private String branchCode;
		private String branchAddr;
	    private String city;
	    private String state;
	    private String country;
	    private String createdBy;
     
      
      public String getBankName()
      {
        return this.bankName;
      }
      public void setBankName(String bankName) 
      {
        this.bankName = bankName;
      }
      public String getBankCode() 
      {
        return this.bankCode;
      }
      public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
      public String getBranchName() {
        return this.branchName;
    }
      public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
      
     public String getBranchCode() {
        return this.branchCode;
    }
      public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
      
      public String getBranchAddr() {
        return this.branchAddr;
    }
      public void setBranchAddr(String branchAddr) {
        this.branchAddr = branchAddr;
    } 
      
       public String getCity() {
        return this.city;
    }
      public void setCity(String city) {
        this.city = city;
    } 
    public String getState() {
        return this.state;
    }
      public void setState(String state) {
        this.state = state;
    } 
      public String getCountry() {
        return this.country;
    }
      public void setCountry(String country) {
        this.country = country;
    } 
     public String getCreatedBy() {
        return this.createdBy;
    }
      public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
      }
    
}
