/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.touch.point.jaxws.service;


import com.touch.point.bean.Branch;
import com.touch.point.dbconnection.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.jws.WebService;




/**
 *
 * @author reswaran
 */

@WebService(serviceName="TouchPointService")
public class TouchPointService {
    
    public ArrayList<Branch> getBranch(String bankId) throws SQLException {
    	
    	
    	ArrayList<Branch>  branchList = new ArrayList<Branch>();
           
                Connection connection=DataBaseConnection.getConnection();
                
        		String bankSqlQuery="select * from branch2 where Bank_code= ?";
        		PreparedStatement ps=null;
        		ResultSet rs;
        		try
        		{
        				ps=connection.prepareStatement(bankSqlQuery);
        				ps.setString(1, bankId);
        				rs=ps.executeQuery();
        				
        				while(rs.next())
        				{
        					Branch  branch = new Branch();
        				
        					String bankName=rs.getString("Bank_name");
        					String bankCode=rs.getString("Bank_code");
        					String branchName=rs.getString("Branch_name");
        					String branchCode=rs.getString("Branch_code");
        					String branchAddr=rs.getString("Branch_addr");
        					String city=rs.getString("city");
        					String state=rs.getString("state");
        					String country=rs.getString("country");
        					String createdBy=rs.getString("CreatedBy");
        					
        					branch.setBankName(bankName);
        					branch.setBankCode(bankCode);
        					branch.setBranchName(branchName);
        					branch.setBranchCode(branchCode);
        					branch.setBranchAddr(branchAddr);
        					branch.setCity(city);
        					branch.setState(state);
        					branch.setCountry(country);
        					branch.setCreatedBy(createdBy);
        				
        					branchList.add(branch);
        					
        				}
        				
        			
        				ps.close();
        				connection.close();
        			return branchList;  				 
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();	
        		}
        		finally
        		{
        			
        			ps.close();
        			connection.close();
        		}
        		return branchList;            
    	}
    
    
    }
 

