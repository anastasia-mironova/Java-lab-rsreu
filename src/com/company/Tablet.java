package com.company;

public class Tablet extends Medicine{
    String activeSubstance;
    int code;
    String color;
     Tablet(){

     }
    Tablet(String name, String size, int cost,String activeSubstance, int code, String color) {
        super(name,size,cost);
        this.activeSubstance = activeSubstance;
        this.code = code;
        this.color = color;
    }
    void setInformation(String activeSubstance, int code, String color){
        this.activeSubstance = activeSubstance;
        this.code = code;
        this.color = color;
    }
    String getInformation(){
        return "Info about Branch: "+color+" "+code+" "+activeSubstance;
    }
    void printInformation(){
        System.out.println("Info about Branch: "+color+" "+code+" "+activeSubstance);
    }
}
