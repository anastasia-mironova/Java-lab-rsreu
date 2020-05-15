package com.company;

import static org.junit.Assert.*;

public class AbsFactoryTest {
    public static void main(String[] args) {
        String country = "RU";
        InteAbsFactory ifactory = null;
        if(country.equals("UA")) {
            ifactory = new UaTabletDoseAbsFactory();
        } else if(country.equals("RU")) {
            ifactory = new AbsFactory();
        }
        IbuprofenTab ibuprofen = ifactory.getIbuprofen();
        System.out.println(ibuprofen.getIbuprofenDose());
    }

}