/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean

        
public class BillPayPage {
   
public BillPayPage(){

}

   
    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getA_date() {
        return a_date;
    }

    public void setA_date(String a_date) {
        this.a_date = a_date;
    }

  

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

 

    public String getD_date() {
        return d_date;
    }

    public void setD_date(String d_date) {
        this.d_date = d_date;
    }

    public String getR_charge() {
        return r_charge;
    }

    public void setR_charge(String r_charge) {
        this.r_charge = r_charge;
    }

    public String getS_charge() {
        return s_charge;
    }

    public void setS_charge(String s_charge) {
        this.s_charge = s_charge;
    }

 
    public String getB_date() {
        return b_date;
    }

    public void setB_date(String b_date) {
        this.b_date = b_date;
    }

    public String getT_charge() {
        return t_charge;
    }

    public void setT_charge(String t_charge) {
        this.t_charge = t_charge;
    }

    public String getP_mode() {
        return p_mode;
    }

    public void setP_mode(String p_mode) {
        this.p_mode = p_mode;
    }

    public String getTotal_r_charge() {
        return total_r_charge;
    }

    public void setTotal_r_charge(String total_r_charge) {
        this.total_r_charge = total_r_charge;
    }
    

    public String getB_no() {
        return b_no;
    }

    public void setB_no(String b_no) {
        this.b_no = b_no;
    }

    public String getR_no() {
        return r_no;
    }

    public void setR_no(String r_no) {
        this.r_no = r_no;
    }

    public String getN_days() {
        return n_days;
    }

    public void setN_days(String n_days) {
        this.n_days = n_days;
    }
     private String disease;
     private String a_date;
   
      private String b_no;
     private String p_id;

     private String r_no;
    private String d_date;
    private String r_charge;
     private String s_charge;
 
     private String n_days;
     private String b_date; 
     private String t_charge;
     private String p_mode;
      private String total_r_charge;
   public void billMothed(){
   
     //  Statement s5;
        try {
            BillPayPage obj = new BillPayPage();
            
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
//             s5 = con.createStatement();
//           String sql = "Insert into ADDPATEINT(ID,FRISTNAME,LASTNAME,AGE,DR_NAME,BLOODGROUP,ADDRESS,CONTACT,DATES)"
//                    + " values('"+id+"','"+fName+"','"+lName+"','"+age+"','"+dr_name+"','"+b_group+"','"+address+"','"+contact+"','"+date+"')";
//             String sql = "Insert into ADDPATEINT(ID,FRISTNAME,LASTNAME,AGE,DR_NAME,BLOODGROUP,ADDRESS,CONTACT,DATES)"
//                    + " values(?,?,?,?,?,?,?,?,?,?)";
           
           // s5.executeQuery(sql);
           PreparedStatement ps = con.prepareStatement("Insert into BILLTABLE(BILL_NO,PATEINT_ID,"
                   + "ADMIT_DATE,DISEASE,ROOM_NO,NO_OF_DAYS,DISCHARGE_DATE,SERVICE_CHARGE,ROOM_CHARGE,"
                   + "TOTAL_ROOM_CHARGE,TOTAL_CHARGE,PAYEMENT_MODE,BILL_DATE)"
                   + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, p_id);
            ps.setString(2, disease);
           ps.setString(3, a_date);
           ps.setString(4, r_no);
            ps.setString(5, n_days);
           ps.setString(6, d_date);
              ps.setString(7, r_charge);
                ps.setString(8, s_charge);
                  ps.setString(9, total_r_charge);
                    ps.setString(10, t_charge);
                       ps.setString(11, p_mode);
                        ps.setString(12, b_no);
                         ps.setString(13, b_date);
            ps.executeUpdate();
       
        
        } catch (  SQLException e) {
             System.err.println(e);
              
        }
   
   
   }
}
