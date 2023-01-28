/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UpDateClass {
       
public  UpDateClass(){

}
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
  
    private String age;

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
 
  
  public void upDateMethod(){
      try{
      
       DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
       
          String sql = "UPDATE ADDPATEINT SET AGE=?, DR_NAME=?, ADDRESS=?, CONTACT=?, DATES=? WHERE ID=?";
           
             PreparedStatement ps = con.prepareStatement(sql);
          
            ps.setString(1, age);
           ps.setString(2, dr_name);
          
                ps.setString(3, address);
                  ps.setString(4, phone);
                    ps.setString(5, date);
                    ps.setString(6, id);
                      
            ps.executeUpdate();
          
      
      }
      catch(SQLException e )
      
      {
      
      System.out.print(e);
      
      }
       
  }

    public String getAgeOfSt() {
        return ageOfSt;
    }

    public void setAgeOfSt(String ageOfSt) {
        this.ageOfSt = ageOfSt;
    }

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
   private String ageOfSt;
    private String idageOfSt;
    private String profageOfSt;
    private String phoneageOfSt;
    private String addressageOfSt;
    private String dateageOfSt;
  
  
    public void upDateStaffMethod(){
      try{
      
       DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
       
           
           
             PreparedStatement ps = con.prepareStatement("UPDATE STAFFINFORMATION SET AGE=?,PROFFESSION=?,ADDRRESS=?, PHONE=?, DATES=? WHERE ID=?");
          
            ps.setString(1, ageOfSt);
            ps.setString(2, profageOfSt);
            ps.setString(3, addressageOfSt);
             ps.setString(4, phoneageOfSt);
               ps.setString(5, dateageOfSt);
              ps.setString(6, idageOfSt);  
                      
            ps.executeUpdate();
          
      
      }
      catch(SQLException e )
      
      {
      
      System.out.print(e);
      
      }
       
  }

     
}
