package com.company;

import java.util.List;

public class ConsumerArbidol implements Runnable {
    List<Tablet> pharmacyWarehouse;
    Thread t;

    ConsumerArbidol( List<Tablet> pharmacyWarehouse) {
        this.pharmacyWarehouse=pharmacyWarehouse;
        t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i<4;i++) {
            count = i + 1;


            this.pharmacyWarehouse.remove(pharmacyWarehouse.size() - 1);
            System.out.println("Продана пачка: Число пачек на складе: " + pharmacyWarehouse.size());
            System.out.println("Всего продано пачек: " + count);
            System.out.println(" ");
            try {
                if (this.pharmacyWarehouse.size() == 0) {
                    System.out.println("Склад пуст, купить нельзя");
                    Thread.sleep(10000);
                }

            } catch (InterruptedException e) {

            }
        }
    }
    List<Tablet> copyList(){
        return this.pharmacyWarehouse;
    }
}
