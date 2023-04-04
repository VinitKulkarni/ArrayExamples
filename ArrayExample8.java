package com.bridgelabz.ArrayExamples;


//8) Java Program to print the duplicate elements of an array
public class ArrayExample8 {
    public static void main(String[] args) {
        int arrayData[] = {100,10,1,2,3,100,10,4,4,100};


        for(int i=0; i<arrayData.length; i++){
            for(int j=i+1; j<arrayData.length; j++){
                if (arrayData[i] == arrayData[j]){
                    System.out.println(arrayData[i]);
                }
            }
        }
    }
}
