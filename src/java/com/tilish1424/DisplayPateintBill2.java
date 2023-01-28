/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DisplayPateintBill2 {
  public DisplayPateintBill2(){}
     public List <DisplayPateintBillInfoClass> billList;
    public List <DisplayPateintBillInfoClass> getbillList(){
    billList = new ArrayList<>(); 
    
      try{
        
           DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
             ResultSet rs = con.createStatement().executeQuery("select * from BILLTABLE");
                 while (rs.next()) {
             
              String p_disease = rs.getString("DISEASE");
                String dateOfad = rs.getString("ADMIT_DATE");
               String  no_bill = rs.getString("BILL_NO");
                String  no_rom = rs.getString("ROOM_NO");
               String  dsteOfDis = rs.getString("DISCHARGE_DATE");
               String ch_room = rs.getString("ROOM_CHARGE");
              String ch_serv = rs.getString("SERVICE_CHARGE");
               String  pm = rs.getString("PAYEMENT_MODE");
                 String  daysofNo = rs.getString("NO_OF_DAYS");
                  String  pid = rs.getString("PATEINT_ID");
                  String  trch = rs.getString("TOTAL_ROOM_CHARGE");
                  String  tch = rs.getString("TOTAL_CHARGE");
                 String  bdate = rs.getString("BILL_DATE");
              
              
                billList.add(new DisplayPateintBillInfoClass(p_disease,dateOfad,no_bill,pid,no_rom,dsteOfDis,ch_room,ch_serv,daysofNo,bdate,tch,pm,trch));
            } 
             
    }catch( SQLException e)
    {
    
    
    }
    
    return billList;
    }
    
    
    
    
}
