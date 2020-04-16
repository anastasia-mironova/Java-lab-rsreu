package com.company;

public class Factory {

    public PrescriptionTablet getCurrentTablets(String currentTablet) {
        PrescriptionTablet myTablet = null;
        if (currentTablet.equals("aspirin")) {
            myTablet = new Aspirin();         }
        else if (currentTablet.equals("paracetamol")) {
            myTablet = new Paracetamol();         }
        else if (currentTablet.equals("ibuprofen")) {
            myTablet = new Ibuprofen();         }
        return myTablet;     }
}
interface PrescriptionTablet {
    String getTablet();
    float getDose();
}
class Aspirin implements PrescriptionTablet {
    public String getTablet () {
        return "Выписан аспирин";
    }
   public float getDose(){
        return 1;
   }
}
class Paracetamol implements PrescriptionTablet {
    public String getTablet () {
        return "Выписан парацетамол";
    }
    public float getDose(){
        return 2;
    }
}
class Ibuprofen implements PrescriptionTablet {
    public String getTablet () {
        return "Выписан Ибупрофен";
    }
    public float getDose(){
        return 3;
    }
}
