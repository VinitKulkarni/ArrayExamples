package com.bridgelabz.ArrayExamples;


//7) Java Program to print the elements of an array present on odd position
public class ArrayExample7 {
    public static void main(String[] args) {
        int arrayData[] = {100,12,13,9,16,51,10,8};

        System.out.println("printing elements from odd position");
        for(int i=1; i<arrayData.length; i=(i+2)){
            System.out.println(i + " - " + arrayData[i]);
        }
    }
}
