/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SignUpPage {
  private String fName;  
   private String lName; 
    private String eMail; 
     private String setPassword; 
       List<String>singUpTypeList;
          private String userType; 

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public List<String> getSingUpTypeList() {
        return singUpTypeList;
    }

    public void setSingUpTypeList(List<String> singUpTypeList) {
        this.singUpTypeList = singUpTypeList;
    }

   
public SignUpPage(){
  singUpTypeList = new ArrayList<>();
    singUpTypeList.add("Admin");
    singUpTypeList.add("Staff");
}
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSetPassword() {
        return setPassword;
    }

    public void setSetPassword(String setPassword) {
        this.setPassword = setPassword;
    }

//    public String getConPassword() {
//        return conPassword;
//   }
//
//   public void setConPassword(String conPassword) {
//      this.conPassword = conPassword;
//   }
//    private String conPassword; 
     
     Statement s5;
     
     public void registrationMethod(){
     try{
         SignUpPage ccc = new SignUpPage();
       DBConnection obj = new DBConnection();
       Connection connection = obj.get_connection();
                  
                     s5 = connection.createStatement();
           String sql = "Insert into LOGINVARIFY(FRIST_NAME,LASTNAME,EMAIL,PASSWORD,USERTYPE)"
                    + " values('"+fName+"','"+lName+"','"+eMail+"','"+setPassword+"','"+userType+"')";
            s5.executeQuery(sql);
//     PreparedStatement pr = connection.prepareStatement("Insert into LOGINVARIFY(FRIST_NAME,LASTNAME,EMAIL,PASSWORD,USERTYPE)VALUES(?,?,?,?,?)");
//     pr.setString(1, fName);
//      pr.setString(2, lName);
//         pr.setString(3, eMail);
//           pr.setString(4, setPassword);
//            pr.setString(5, userType);
     }
     catch(Exception e){
         
         System.out.print(e);
     }

     }
}
