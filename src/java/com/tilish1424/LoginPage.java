
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
   public String diplayeName(){
       return "loginpage";
   }
//        public void pateintInsert() {
//        Statement st;
//        try {
//            
//            
//            DBConnection dbcon = new DBConnection();
//            Connection con = dbcon.get_connection();
//           st = con.createStatement();
//            String sql = "Insert into PASSWORD(PASSWORD,USERNAME)"
//                    + " values('"+pwd+"','"+name+"')";
//            st.executeQuery(sql);
////            PreparedStatement ps = con.prepareStatement(sql);
////            ps.setString(1, pwd);
////            ps.setString(2, name);
////         
////            ps.executeUpdate();
//             System.err.println("success");
//          
//        } catch ( SQLException e) {
//             System.err.println(e);
//        }
//    }
//    public test() {
//    }
    
    
    
    
     public String validateMethod() throws SQLException, ClassNotFoundException {
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
            } else {
                return "LoginPage";
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
            return "ManuPage";
        }
    }

}
