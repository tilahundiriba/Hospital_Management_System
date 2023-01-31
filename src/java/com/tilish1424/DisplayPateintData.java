/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="addPateint")
@RequestScoped

public class DisplayPateintData {
  public List <DataDisplayClass> arrayList;
    public List <DataDisplayClass> getpateintlist(){ // starting of method for displaying pateint information 
    arrayList = new ArrayList<>();
    try{
        
           DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
             ResultSet rs = con.createStatement().executeQuery("select * from ADDPATEINT");
                 while (rs.next()) {
             
              String p_id = rs.getString("ID");
                String f_name = rs.getString("FRISTNAME");
               String  l_name = rs.getString("LASTNAME");
                String  sex = rs.getString("GENDER");
               String  age1 = rs.getString("AGE");
               String dr_name1 = rs.getString("DR_NAME");
              String b_group1 = rs.getString("BLOODGROUP");
               String  address1 = rs.getString("ADDRESS");
                 String  phone = rs.getString("CONTACT");
                  String  dates = rs.getString("DATES");
              
                arrayList.add(new DataDisplayClass(p_id,f_name,l_name,sex,age1,dr_name1,b_group1,address1,phone,dates));
            } 
             
    }catch( SQLException e)
    {
    
    System.out.print(e);
    }
    
    return arrayList;
    } //ending of method for displaying pateint information 
    
    
    private int pateintId;

    public int getPateintId() { 
        return pateintId;
    }

    public void setPateintId(int pateintId) {
        this.pateintId = pateintId;
    }
     public List <Addpateint> singleList;
    public List <Addpateint> getsinglelist(){// starting of method for displaying single  pateint information 
    singleList = new ArrayList<>();
    try{
        
           DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
          
             PreparedStatement ps = con.prepareStatement("select * from ADDPATEINT where ID=?");
               ps.setInt(1, pateintId);
             ResultSet rs = ps.executeQuery();
          
                 while (rs.next()) {
             Addpateint add = new Addpateint();
                add.setId(rs.getInt("ID"));
              add.setfName(rs.getString("FRISTNAME"));
                add.setlName(rs.getString("LASTNAME"));
                 add.setGender(rs.getString("GENDER"));
                  add.setAge(rs.getInt("AGE"));
                   add.setDr_name(rs.getString("DR_NAME"));
                    add.setB_group(rs.getString("BLOODGROUP"));
                     add.setAddress(rs.getString("ADDRESS"));
                      add.setContact(rs.getString("CONTACT"));
                       add.setDate(rs.getString("DATES"));
          
          
                singleList.add(add);
            } 
             
    }catch( SQLException e)
    {
    
     System.out.print(e);
    }
    
    return singleList;
    }  //ending of method for displaying single  pateint information 
    
    
    
    
    
    
    
    private int staffid;

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }
    
     public List <AddStaff> staffList;
    public List <AddStaff> getsinglestafflist(){ // starting of method for displaying single  staff information 
    staffList = new ArrayList<>();
    try{
        
           DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
          
             PreparedStatement ps = con.prepareStatement("select * from STAFFINFORMATION where ID=?");
               ps.setInt(1, staffid);
             ResultSet rs = ps.executeQuery();
          
                 while (rs.next()) {
             AddStaff add = new AddStaff();
                add.setId(rs.getInt("ID"));
              add.setName(rs.getString("NAME"));
                add.setProf(rs.getString("PROFFESSION"));
                 add.setGender(rs.getString("GENDER"));
                  add.setAge(rs.getInt("AGE"));
                   add.setPhone(rs.getString("PHONE"));
                     add.setAddress(rs.getString("ADDRRESS"));
                       add.setDate(rs.getString("DATES"));
          
          
                staffList.add(add);
            } 
             
    }catch( SQLException e)
    {
    
     System.out.print(e);
    }
    
    return staffList;
    } //ending of method for displaying single  pateint information 
    
    private int billno;

    public int getBillno() {
        return billno;
    }

    public void setBillno(int billno) {
        this.billno = billno;
    }
    
         public List <BillPayPage> billList;
    public List <BillPayPage> getsinglebilllist() //starting of method for displaying single  pateint bill information 
    {  
    billList = new ArrayList<>();
    try{
        
           DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
          
             PreparedStatement ps = con.prepareStatement("select * from BILLTABLE where BILL_NO=?");
               ps.setInt(1, billno);
             ResultSet rs = ps.executeQuery();
          
                 while (rs.next()) {
             BillPayPage add = new BillPayPage();
                add.setDisease(rs.getString("DISEASE"));
              add.setA_date(rs.getString("ADMIT_DATE"));
                add.setB_no(rs.getInt("BILL_NO"));
                 add.setP_id(rs.getInt("PATEINT_ID"));
                  add.setR_no(rs.getInt("ROOM_NO"));
                   add.setD_date(rs.getString("DISCHARGE_DATE"));
                 add.setR_charge(rs.getInt("ROOM_CHARGE"));
                 add.setS_charge(rs.getInt("SERVICE_CHARGE"));
                 add.setN_days(rs.getInt("NO_OF_DAYS"));
                  add.setB_date(rs.getString("BILL_DATE"));
                    add.setT_charge(rs.getInt("TOTAL_CHARGE"));
                    add.setP_mode(rs.getString("PAYEMENT_MODE"));
                     add.setTotal_r_charge(rs.getInt("TOTAL_ROOM_CHARGE"));
          
          
                billList.add(add);
            } 
                }catch( SQLException e)
    {
    
     System.out.print(e);
    }
    
   return billList;
   }//ending of method for displaying single  pateint bill information 
}
