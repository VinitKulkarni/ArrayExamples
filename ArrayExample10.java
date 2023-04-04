package com.bridgelabz.ArrayExamples;

public class ArrayExample10 {
    public static void main(String[] args) {
        int arrayData[] = {9,8,7,1,2,3,5};
        int max1 = arrayData[0];
        int max2 = 0;

        for(int i=1; i<arrayData.length; i++){
            if(arrayData[i] > max1){
                max2 = max1;
                max1 = arrayData[i];
            }
            if(max2 < arrayData[i] && arrayData[i] < max1){
                max2 = arrayData[i];
            }
        }

        System.out.println("First Maximum Value = " + max1);
        System.out.println("Second Maximum Value = " + max2);
    }
}
