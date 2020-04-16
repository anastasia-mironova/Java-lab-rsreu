package com.company;

public class Syrup extends Medicine {
    String type;
    int milliltres;
    String typeOfBottle;

    Syrup(String name, String size, int cost, String type, int milliltres, String typeOfBottle) {
        super(name,size,cost);
        this.type = type;
        this.milliltres = milliltres;
        this.typeOfBottle = typeOfBottle;
    }
    void setInformation(String type, int milliltres, String typeOfBottle){
            this.type = type;
            this.milliltres = milliltres;
            this.typeOfBottle = typeOfBottle;

    }
    String getInformation(){
        return "Info about Adminisrtation: "+typeOfBottle+" "+ type +" "+ milliltres;
    }
    void printInformation(){
        System.out.println("Info about Adminisrtation: "+typeOfBottle+" "+ type +" "+ milliltres);
    }
}
