
package com.tilish1424;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="billPage")
@RequestScoped
public class DisplayPateintBillInfoClass {
    
public DisplayPateintBillInfoClass(){}
    public String getDisease() {
        return disease;
    }

    public String getA_date() {
        return a_date;
    }

    public String getB_no() {
        return b_no;
    }

    public String getP_id() {
        return p_id;
    }

    public String getR_no() {
        return r_no;
    }

    public String getD_date() {
        return d_date;
    }

    public String getR_charge() {
        return r_charge;
    }

    public String getS_charge() {
        return s_charge;
    }

    public String getN_days() {
        return n_days;
    }

    public String getB_date() {
        return b_date;
    }

    public String getT_charge() {
        return t_charge;
    }

    public String getP_mode() {
        return p_mode;
    }

    public String getTotal_r_charge() {
        return total_r_charge;
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
                                     // constructor for initializing of variables
 public DisplayPateintBillInfoClass(String disease,String a_date,String b_no,String p_id,String r_no,String d_date,String r_charge,String s_charge,String n_days,String b_date,String t_charge,String p_mode,String total_r_charge)
 {
 this.disease=disease;
 this.a_date=a_date;
 this.b_no=b_no;
 this.p_id=p_id;
 this.r_no=r_no;
 this.d_date=d_date;
 this.r_charge=r_charge;
 this.n_days=n_days;
 this.b_date=b_date;
 this.t_charge=t_charge;
 this.p_mode=p_mode;
 this.total_r_charge=total_r_charge;
 this.s_charge=s_charge;
 
 }
 
}
