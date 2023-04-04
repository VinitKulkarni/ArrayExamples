package com.bridgelabz.ArrayExamples;

//3) Java Program to print the largest element in an array
public class ArrayExample3 {
    public static void main(String[] args) {
        int arrayData[] = {100,2,33,9,6,51};
        int maxValue = arrayData[0];

        //why i=1 is i=0 already assingned maxvalue
        for(int i=1; i<arrayData.length; i++){
            if(maxValue < arrayData[i]){
                maxValue = arrayData[i];
            }
        }

        System.out.println("Largest element in the array is : " + maxValue);
    }
}
