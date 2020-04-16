package com.company;


import org.junit.Test;

public class MedicineTest {

    @Test
    public void dosageCalculation() {
        Medicine actualInfo = new Medicine("aspirin","120 tablet",15);
        int ageOfPerson = 50;
        float weightOfPerson = 75;
        float koefficent = 1/weightOfPerson*3;
        float dose = ageOfPerson*weightOfPerson*koefficent;

        assert(actualInfo.dosageCalculation(weightOfPerson,ageOfPerson,koefficent)== dose);
    }


    @Test
    public void discount() {
        Medicine actualInfo = new Medicine("aspirin","120 tablet",15);
        int ageOfPerson = 51;
        assert(actualInfo.discount(ageOfPerson)== actualInfo.cost*0.5);
    }
}