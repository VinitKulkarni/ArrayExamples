package com.bridgelabz.ArrayExamples;


//6) Java Program to print the elements of an array in reverse order
public class ArrayExample6 {
    public static void main(String[] args) {
        int arrayData[] = {100,12,13,9,16,51,10,8};

        //-1 bcz of count
        int arrayDataLength = arrayData.length - 1;
        for(int i=arrayDataLength; i>=0; i--){
            System.out.println(arrayData[i]);
        }
    }
}
