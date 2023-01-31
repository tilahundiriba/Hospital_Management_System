
package com.tilish1424;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LoginPage  {
     
    
private String pwd;
public void setPwd(String pwd){
this.pwd = pwd;
}
public String getPwd(){
return pwd;
}
   private String name;
    
     
   public void setName(String name){
       this.name=name;
   }
   public String getName(){
   
   return name;
   }
 

    
    
    
    
     public String validateMethod() throws SQLException, ClassNotFoundException { //starting of method for validation of password and username
        boolean status = ValidateClass.validate(name, pwd);
        if (status) {
              DBConnection dbcon = new DBConnection();
            Connection con = dbcon.get_connection();
            PreparedStatement ps = con.prepareStatement("select USERTYPE from LOGINVARIFY where USERTYPE=?");
            ps.setString(1, name);   
          
            ResultSet rs = ps.executeQuery();
            rs.next();
            String UserName =rs.getString(1);
            if ("Admin".equals(UserName)) {
                return "Manu_page";
            } if ("Staff".equals(UserName)) {
                return "StaffWorkChoosePage";
            } else {
                return "LoginPage";
            }
            
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,// giving information wether validation is successfull or not.
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
            return "ManuPage";
        }
    }

}
