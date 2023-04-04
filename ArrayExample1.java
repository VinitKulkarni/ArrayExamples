package com.bridgelabz.ArrayExamples;

//1) Java Program to print the elements of an array
public class ArrayExample1 {
    public static void main(String[] args) {
        int arrayData[] = {1,2,3,9,6,5};

        for(int i=0; i<arrayData.length; i++){
            System.out.println(i+"th location : " + arrayData[i]);
        }
    }
}
