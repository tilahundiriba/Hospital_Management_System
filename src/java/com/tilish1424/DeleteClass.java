/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DeleteClass {
   private String id;
      public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   public void DeletePateintInfoMethod(){
   
   try{
     DBConnection dbcon = new DBConnection();
      Connection con = dbcon.get_connection();

        PreparedStatement ps = con.prepareStatement("Delete from ADDPATEINT where ID=?");
         ps.setString(1, id);   
       
           ps.executeUpdate();
   }
   catch(Exception e){
   
   System.out.print(e);
   }
   
   }
   
   
     private String idOfSt;

    public String getIdOfSt() {
        return idOfSt;
    }

    public void setIdOfSt(String idOfSt) {
        this.idOfSt = idOfSt;
    }
    
    public void DeleteStaffInfoMethod(){
    
    
      try{
     DBConnection dbcon = new DBConnection();
     Connection con = dbcon.get_connection();

        PreparedStatement ps = con.prepareStatement("Delete from STAFFINFORMATION where ID=?");
         ps.setString(1, idOfSt);   
       
           ps.executeUpdate();
   }
   catch(Exception e){
   
   System.out.print(e);
   }
    
    }
    
    private String billNo;

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }
    
        public void DeleteBillInfoMethod(){
    
    
      try{
     DBConnection dbcon = new DBConnection();
     Connection con = dbcon.get_connection();

        PreparedStatement ps = con.prepareStatement("Delete from BILLTABLE where 	BILL_NO=?");
         ps.setString(1, billNo);   
       
           ps.executeUpdate();
   }
   catch(Exception e){
   
   System.out.print(e);
   }
    
    }

 
}
