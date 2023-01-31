/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

public class DataDisplayClass {
    private String fName;

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getDr_name() {
        return dr_name;
    }

    public String getB_group() {
        return b_group;
    }

    public String getAddress() {
        return address;
    }

    public String getDate() {
        return date;
    }

    public String getGender() {
        return gender;
    }

    public String getContact() {
        return contact;
    }
    private  String lName;
    private  String age;
    private  String id;
    private  String dr_name;
    private String b_group;
    private  String address;
     private  String date;
    private  String gender;
  public  String contact; 
  
  // constructor for initializing variables
  
  public  DataDisplayClass(String id,String fName,String lName,String gender,String age,String dr_name,String b_group,String address,String contact,String date)
  {  
  this.id=id;
   this.fName=fName;
    this.lName=lName;
     this.gender=gender;
      this.age=age;
       this.dr_name=dr_name;
        this.b_group=b_group;
         this.address=address;
          this.contact=contact;
           this.date=date;
  
  
  
  }
}

