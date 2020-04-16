package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicArray<T>{
     int count = 0;
     T mainElem;
     T [] massive;


    DynamicArray(T mainElem, Class TClass){
        this.mainElem = mainElem;
        System.out.println("Main element: " + mainElem);
        massive = (T[])Array.newInstance(TClass,0);
    }
    void setLength(int length){
        this.massive = Arrays.copyOf(this.massive, length);
    }
    void setMassive(T [] massive){
        this.massive = massive;
    }
    void add(T elem){
        this.massive  = Arrays.copyOf(massive, massive.length+1);
        this.massive[massive.length-1] = elem;
    }

    void compareElem(){
     for (int i = 0; i< massive.length -1;i++){

         if (this.mainElem == massive[i] ){
             count++;
         }
     }
    if(count>0){
        System.out.println("Дублирующихся элементов: "+count);
    } else {
        System.out.println("Дубликатов нет");
    }
    }
}
