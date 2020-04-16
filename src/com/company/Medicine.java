package com.company;

import org.junit.jupiter.api.Test;
public class Medicine implements Doctor{
    String name;
    String size;
    int cost;
    Medicine(){

}
    Medicine(String name, String size, int cost) {
        this.name = name;
        this.size = size;
        this.cost = cost;
    }
    Medicine(String name){
        this.name = name;
        this.size = "empty";
        this.cost =  1;
    }
    void setInformation(String name, String size, int cost){
        this.name = name;
        this.size = size;
        this.cost = cost;
    }
     String getInformation(){
        return "Info about thing: "+name+" "+size+" "+cost;
    }
    void printInformation(){
        System.out.println( "Info about thing: "+name+" "+size+" "+cost);
    }

    public float dosageCalculation(float weight, int age, float koef){
        return koef*weight*age;
    }

    public String getDischarge(){
        return "Выписано леарство: " + name;
    }
    public double discount(int age) {
        try {
            if (age > 100) throw new Exception("Error!Age is very large");

            if (age > 50) {
                return 0.5 * cost;
            }

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        }
        return 0;
    }

}

