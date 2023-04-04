package com.bridgelabz.ArrayExamples;


//4) Java Program to print the smallest element in an array
public class ArrayExample4 {
    public static void main(String[] args) {
        int arrayData[] = {100,12,13,9,16,51,10};
        int minValue = arrayData[0];

        //why i=1 is i=0 already assingned maxvalue
        for(int i=1; i<arrayData.length; i++){
            if(minValue > arrayData[i]){
                minValue = arrayData[i];
            }
        }

        System.out.println("Smallest element in the array is : " + minValue);
    }
}
