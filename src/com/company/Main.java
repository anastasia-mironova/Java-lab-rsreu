package com.company;
import javafx.scene.control.Tab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Main {

    public static void main(String[] args) {
//        List<Tablet> pharmacyWarehouse = new ArrayList<Tablet>();
//    ProducerArbidol p = new ProducerArbidol(pharmacyWarehouse);
//
//        ConsumerArbidol c = new ConsumerArbidol(pharmacyWarehouse);

//        Medicine m = new Medicine("jk","jk",78);
//       Class cl = m.getClass();
//       MedicineTest med = (MedicineTest) cl.getAnnotation(MedicineTest.class);
//       System.out.println("Age: " + med.age());
//        System.out.println("Weight: "+med.weight());
//        Tablet ibuprofen = new Tablet();
//        ibuprofen.name = "Ибупрофен";
//        ibuprofen.cost= 30;
//        ibuprofen.size = "50 таблеток";
//        ibuprofen.activeSubstance = "Ibuprofen*";
//        ibuprofen.code= 3453;
//        ibuprofen.color= "белый";
//        Tablet aspirin = new Tablet();
//        aspirin.name = "Аспирин";
//        aspirin.cost= 15;
//        aspirin.size = "10 таблеток";
//        aspirin.activeSubstance = "aspirin*";
//        aspirin.code= 3454;
//        aspirin.color= "белый";
//
//
//        Tablet tablets[] = {aspirin,ibuprofen};
//        DynamicArray<String> tabletDynamyc = new DynamicArray<String>("aspirin", String.class);
//        tabletDynamyc.add(aspirin.name);
//        tabletDynamyc.add(ibuprofen.name);
//        tabletDynamyc.compareElem();
//        System.out.println("");
//        DynamicArray<String> tabletDynamycColor = new DynamicArray<String>("белый", String.class);
//        tabletDynamycColor.add(aspirin.color);
//        tabletDynamycColor.add(ibuprofen.color);
//        tabletDynamycColor.compareElem();
//        System.out.println("");
//        DynamicArray<Integer> tabletDynamycCost = new DynamicArray<Integer>(30, Integer.class);
//        tabletDynamycCost.add(aspirin.cost);
//        tabletDynamycCost.add(ibuprofen.cost);
//        tabletDynamycCost.compareElem();
//
//
//        Medicine jdj = new Medicine("aerfn","df",94949);
//        jdj.discount(101);


        //        WriteTabletInFile("E:\\6_sircle_of hell\\java\\out.txt", ibuprofen);
//
//        Tablet paracetamol = new Tablet();
//        ReadTabletFromFile("E:\\6_sircle_of hell\\java\\in.txt", paracetamol);

        Tablet tablets [] = new Tablet[4];
        tablets[0] = new Tablet("arbidol","30 tabl",300,"arbidol*",3493,"yellow");
        tablets[1] = new Tablet("paracetamol","10 tabl",15,"paracetamol*",9580,"white");
        tablets[2] = new Tablet("ibuprofen","20 tabl",50,"ibuprofen*",3453,"light pink");
        tablets[3] = new Tablet("aspirin","10 tabl",40,"aspirin*",3473,"green");
       CostCount counter = (Tablet tabletsArray[])->{
           int count = 0;
           for(int i = 0;i< tabletsArray.length; i++){
               if (tabletsArray[i].cost<100){
                   count++;
               }
           }
           return count;
       };
      System.out.println("Таблеток стоимость меньше 100 рублей: "+ counter.getCount(tablets));
    }

    static void ReadTabletFromFile(String fileName, Tablet tablet){
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
            tablet.name = lines.get(0);
            tablet.cost = Integer.parseInt(lines.get(1));
            tablet.size = lines.get(2);
            tablet.activeSubstance = lines.get(3);
            tablet.code = Integer.parseInt(lines.get(4));
            tablet.color= lines.get(5);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    static void WriteTabletInFile(String fileName, Tablet tablet){
        try(FileWriter writer = new FileWriter(fileName, false))
        {
            String text = tablet.name+"\n"+tablet.cost+"\n"+tablet.size+"\n"+
                    tablet.activeSubstance+"\n"+tablet.code+"\n"+tablet.color;
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }


}
