package com.company;

public class Pharmacology extends Tablet {
    String utility;
    int quantity;
    String pharmacist;

    Pharmacology(String name, String size, int cost,String activeSubstance, int code, String color,String utility, int quantity, String pharmacist) {
        super(name,size,cost,activeSubstance,code,color);
        this.utility = utility;
        this.quantity = quantity;
        this.pharmacist = pharmacist;
    }
    void setInformation(String utility, int quantity, String pharmacist){
        this.utility = utility;
        this.quantity = quantity;
        this.pharmacist = pharmacist;

    }
    String getInformation(){
        return "Info about Pharmacology: "+utility+" "+ quantity +" "+pharmacist;
    }
    void printInformation(){
        System.out.println("Info about Pharmacology: "+utility+" "+ quantity +" "+pharmacist);
    }
    void printFullInformation(){
        System.out.println("Info about: "+name+" "+size+" "+cost);
        System.out.println("Info about Tablet: "+activeSubstance+" "+code+" "+color);
       System.out.println("Info about Pharmacology: "+utility+" "+ quantity +" "+pharmacist);
    }
}
