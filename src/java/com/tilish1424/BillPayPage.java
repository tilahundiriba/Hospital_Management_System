
package com.tilish1424;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


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

    public String getD_date() {
        return d_date;
    }

    public void setD_date(String d_date) {
        this.d_date = d_date;
    }
public String getB_date() {
        return b_date;
    }

    public void setB_date(String b_date) {
        this.b_date = b_date;
    }
    public String getP_mode() {
        return p_mode;
    }
    public void setP_mode(String p_mode) {
        this.p_mode = p_mode;
    }

   
     private String disease;
     private String a_date;
   
      private int b_no;
     private int p_id;

     private int r_no;
    private String d_date;
    private int r_charge;
     private int s_charge;
 
     private int n_days;
     private String b_date; 
     private int t_charge;
     private String p_mode;
      private int total_r_charge;

    public int getB_no() {
        return b_no;
    }

    public void setB_no(int b_no) {
        this.b_no = b_no;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getR_no() {
        return r_no;
    }

    public void setR_no(int r_no) {
        this.r_no = r_no;
    }

    public int getR_charge() {
        return r_charge;
    }

    public void setR_charge(int r_charge) {
        this.r_charge = r_charge;
    }

    public int getS_charge() {
        return s_charge;
    }

    public void setS_charge(int s_charge) {
        this.s_charge = s_charge;
    }

    public int getN_days() {
        return n_days;
    }

    public void setN_days(int n_days) {
        this.n_days = n_days;
    }
   
    public int getT_charge() {
        return t_charge;
    }

    public void setT_charge(int t_charge) {
        this.t_charge = t_charge;
    }

    public int getTotal_r_charge() {
        return total_r_charge;
    }

    public void setTotal_r_charge(int total_r_charge) {
        this.total_r_charge = total_r_charge;
    }
   public void billMothed(){
   
    
        try {
            BillPayPage obj = new BillPayPage();
            
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();

         
           PreparedStatement ps = con.prepareStatement("Insert into BILLTABLE(BILL_NO,PATEINT_ID,"
                   + "ADMIT_DATE,DISEASE,ROOM_NO,NO_OF_DAYS,DISCHARGE_DATE,SERVICE_CHARGE,ROOM_CHARGE,"
                   + "TOTAL_ROOM_CHARGE,TOTAL_CHARGE,PAYEMENT_MODE,BILL_DATE)"
                   + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
           ps.setInt(1, b_no);
            ps.setInt(2, p_id);
            ps.setString(3, disease);
           ps.setString(4, a_date);
           ps.setInt(5, r_no);
            ps.setInt(6, n_days);
           ps.setString(7, d_date);
            ps.setInt(8, r_charge);
            ps.setInt(9, s_charge);
            ps.setInt(10, total_r_charge);
             ps.setInt(11, t_charge);
               ps.setString(12, p_mode);
              ps.setString(13, b_date);
              ps.executeUpdate();
       
        FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Successfully Inesrted",
                            ""));
        } catch (  SQLException e) {
             System.err.println(e);
              
        }
   
   
   }
}
