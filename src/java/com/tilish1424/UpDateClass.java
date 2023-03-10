/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class UpDateClass {
       
public  UpDateClass(){ // empty constructor 

}
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

 
    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
  
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String dr_name;
   
    private String address;
     private String date;
  private String phone;
  private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
 
  
  public void upDateMethod(){ // starting of method for update of pateint information.
      try{
      
       DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
       
          String sql = "UPDATE ADDPATEINT SET AGE=?, DR_NAME=?, ADDRESS=?, CONTACT=?, DATES=? WHERE ID=?";
           
             PreparedStatement ps = con.prepareStatement(sql);
         
            if(age > 0 && age < 180)
        {
         ps.setInt(1, age);
        }
        else{
       FacesContext.getCurrentInstance().addMessage( // restricting that age cannot be zeroo or above 180 years.
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Age can't be Zero/Above 180!!!",
                            ""));
        }
         
           ps.setString(2, dr_name);
          
                ps.setString(3, address);
                  ps.setString(4, phone);
                    ps.setString(5, date);
                    ps.setString(6, id);
                      
            ps.executeUpdate();
             FacesContext.getCurrentInstance().addMessage( // giving information wether updation successfull or not.
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Successfully updated",
                            ""));
          
      
      }
      catch(SQLException e )
      
      {
      
      System.out.print(e);
      
      }
       
  }// ending of method for update of pateint information


    public String getIdageOfSt() {
        return idageOfSt;
    }

    public void setIdageOfSt(String idageOfSt) {
        this.idageOfSt = idageOfSt;
    }
    public String getProfageOfSt() {
        return profageOfSt;
    }

    public void setProfageOfSt(String profageOfSt) {
        this.profageOfSt = profageOfSt;
    }

    public String getPhoneageOfSt() {
        return phoneageOfSt;
    }

    public void setPhoneageOfSt(String phoneageOfSt) {
        this.phoneageOfSt = phoneageOfSt;
    }

    public String getAddressageOfSt() {
        return addressageOfSt;
    }

    public void setAddressageOfSt(String addressageOfSt) {
        this.addressageOfSt = addressageOfSt;
    }

    public String getDateageOfSt() {
        return dateageOfSt;
    }

    public void setDateageOfSt(String dateageOfSt) {
        this.dateageOfSt = dateageOfSt;
    }
   private int ageOfSt;

    public int getAgeOfSt() {
        return ageOfSt;
    }

    public void setAgeOfSt(int ageOfSt) {
        this.ageOfSt = ageOfSt;
    }
    private String idageOfSt;
    private String profageOfSt;
    private String phoneageOfSt;
    private String addressageOfSt;
    private String dateageOfSt;
  
  
    public void upDateStaffMethod(){ // starting of method for update of staff information.
      try{
      
       DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
       
           
           
             PreparedStatement ps = con.prepareStatement("UPDATE STAFFINFORMATION SET AGE=?,PROFFESSION=?,ADDRRESS=?, PHONE=?, DATES=? WHERE ID=?");
                 if(age > 0&& age < 180)
        {
         ps.setInt(1, ageOfSt);
        }
        else{
       FacesContext.getCurrentInstance().addMessage( // restricting that age cannot be zeroo or above 180 years.
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Age can't be Zero/Above 180!!!",
                            ""));
        }
            
            ps.setString(2, profageOfSt);
            ps.setString(3, addressageOfSt);
             ps.setString(4, phoneageOfSt);
               ps.setString(5, dateageOfSt);
              ps.setString(6, idageOfSt);  
                      
            ps.executeUpdate();
             FacesContext.getCurrentInstance().addMessage( // giving information wether updation successfull or not.
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Successfully updated",
                            ""));
          
      
      }
      catch(SQLException e )
      
      {
      
      System.out.print(e);
      
      }
       
  } // ending of method for update of staff information 

     
}
