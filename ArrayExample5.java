package com.bridgelabz.ArrayExamples;


//5) Java Program to print the elements of an array present on an even position
public class ArrayExample5 {
    public static void main(String[] args) {
        int arrayData[] = {100,12,13,9,16,51,10,8};

        System.out.println("printing elements from even position");
        for(int i=0; i<arrayData.length; i=(i+2)){
            System.out.println(i + " - " + arrayData[i]);
        }
    }
}
