/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class BillPayPage {
   

//    public int getB_no() {
//        return B_no;
//    }
//
//    public void setB_no(int B_no) {
//        this.B_no = B_no;
//    }
//
//    public int getR_no() {
//        return R_no;
//    }
//
//    public void setR_no(int R_no) {
//        this.R_no = R_no;
//    }
//
//    public int getN_days() {
//        return N_days;
//    }
//
//    public void setN_days(int N_days) {
//        this.N_days = N_days;
//    }
   
    public String getDisease() {
        return Disease;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

    public String getA_date() {
        return A_date;
    }

    public void setA_date(String A_date) {
        this.A_date = A_date;
    }

  

    public String getP_id() {
        return P_id;
    }

    public void setP_id(String P_id) {
        this.P_id = P_id;
    }

 

    public String getD_date() {
        return D_date;
    }

    public void setD_date(String D_date) {
        this.D_date = D_date;
    }

    public String getR_charge() {
        return R_charge;
    }

    public void setR_charge(String R_charge) {
        this.R_charge = R_charge;
    }

    public String getS_charge() {
        return S_charge;
    }

    public void setS_charge(String S_charge) {
        this.S_charge = S_charge;
    }

 
    public String getB_date() {
        return B_date;
    }

    public void setB_date(String B_date) {
        this.B_date = B_date;
    }

    public String getT_charge() {
        return T_charge;
    }

    public void setT_charge(String T_charge) {
        this.T_charge = T_charge;
    }

    public String getP_mode() {
        return P_mode;
    }

    public void setP_mode(String P_mode) {
        this.P_mode = P_mode;
    }

    public String getTotal_r_charge() {
        return Total_r_charge;
    }

    public void setTotal_r_charge(String Total_r_charge) {
        this.Total_r_charge = Total_r_charge;
    }
     private String Disease;
     private String A_date;
   // private int B_no;
      private String B_no;
     private String P_id;
  //  private int R_no;
     private String R_no;
    private String D_date;
    private String R_charge;
     private String S_charge;
   // private int N_days; 
     private String N_days;
     private String B_date; 
     private String T_charge;
     private String P_mode;
      private String Total_r_charge;
   public void BillMothed(){
   
     //  Statement s5;
        try {
            
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
//             s5 = con.createStatement();
//           String sql = "Insert into ADDPATEINT(ID,FRISTNAME,LASTNAME,AGE,DR_NAME,BLOODGROUP,ADDRESS,CONTACT,DATES)"
//                    + " values('"+id+"','"+fName+"','"+lName+"','"+age+"','"+dr_name+"','"+b_group+"','"+address+"','"+contact+"','"+date+"')";
//             String sql = "Insert into ADDPATEINT(ID,FRISTNAME,LASTNAME,AGE,DR_NAME,BLOODGROUP,ADDRESS,CONTACT,DATES)"
//                    + " values(?,?,?,?,?,?,?,?,?,?)";
           
           // s5.executeQuery(sql);
           PreparedStatement ps = con.prepareStatement("Insert into ADDPATEINT(ID,FRISTNAME,LASTNAME,GENDER,AGE,DR_NAME,BLOODGROUP,ADDRESS,CONTACT,DATES)values(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, P_id);
            ps.setString(2, Disease);
           ps.setString(3, A_date);
           ps.setString(4, R_no);
            ps.setString(5, N_days);
           ps.setString(6, D_date);
              ps.setString(7, R_charge);
                ps.setString(8, S_charge);
                  ps.setString(9, Total_r_charge);
                    ps.setString(10, T_charge);
                       ps.setString(11, P_mode);
                        ps.setString(12, B_no);
                         ps.setString(13, B_date);
            ps.executeUpdate();
       
             System.err.println("success");
          
        } catch (  SQLException e) {
             System.err.println(e);
        }
   
   
   }
}
