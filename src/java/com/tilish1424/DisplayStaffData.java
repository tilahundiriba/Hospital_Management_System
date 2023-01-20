/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tilish1424;

public class DisplayStaffData {

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getProff() {
        return proff;
    }

    public String getPhonee() {
        return phonee;
    }

    public String getAddresss() {
        return addresss;
    }



    public String getDate() {
        return date;
    }


    private  String name;
    private  String age;
    private  String id;
    private  String gender;
    private  String proff;
    private  String phonee;
    private  String addresss;
    private  String date;
    
    
    public  DisplayStaffData( String name, String age, String id, String gender, String proff, String phonee, String addresss, String date)
    {
    this.name=name;
    this.age=age;
     this.id=id;
    this.gender=gender;
    this.proff=proff;
    this.phonee=phonee;
   
    this.addresss=addresss;
    this.date=date;
    }
}
