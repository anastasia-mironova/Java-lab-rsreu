package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTest {

    @Test
    public void getCurrentTablets() {
        String tablet = "aspirin";
        Factory factory = new Factory();
     PrescriptionTablet myTablet = factory.getCurrentTablets(tablet);
     assert(myTablet.getTablet().equals("Выписан аспирин"));
     assert (myTablet.getDose()==1);
    }
}