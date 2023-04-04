package com.bridgelabz.ArrayExamples;


//9) Java Program to sort the elements of an array in ascending order
public class ArrayExample9 {
    public static void main(String[] args) {
        int arrayData[] = {100,12,13,9,16,51,10,8};

        System.out.println("Before sorting:");
        for(int i=0; i<arrayData.length; i++){
            System.out.println(arrayData[i]);
        }

        //ascending order sorting
        for(int i=0; i<arrayData.length; i++){
            for(int j=0; j<i; j++){
                if(arrayData[i] < arrayData[j]){
                    int temp = arrayData[i];
                    arrayData[i] = arrayData[j];
                    arrayData[j] = temp;
                }
            }
        }

        System.out.println("After sorting:");
        for(int i=0; i<arrayData.length; i++){
            System.out.println(arrayData[i]);
        }
    }
}
