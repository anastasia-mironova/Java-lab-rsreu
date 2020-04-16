package com.company;

import java.util.List;

public class ProducerArbidol implements Runnable {
    List<Tablet> pharmacyWarehouse;
    Thread t;

    ProducerArbidol( List<Tablet> pharmacyWarehouse) {
        this.pharmacyWarehouse = pharmacyWarehouse;
        t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i<4;i++){
            Tablet arbidol = new Tablet("arbidol","120",300,"poroshok",23432,"blue");
            this.pharmacyWarehouse.add(arbidol);
            System.out.println("Закуплена пачка арбидола");
            System.out.println("Число пачек на складе " + this.pharmacyWarehouse.size());
            System.out.println(" ");
        }
        try {
            System.out.println("Склад заполнен");
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
    }
    List<Tablet> copyList(){
        return this.pharmacyWarehouse;
    }
}
