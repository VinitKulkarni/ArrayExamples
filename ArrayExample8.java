package com.bridgelabz.ArrayExamples;


//8) Java Program to print the duplicate elements of an array
public class ArrayExample8 {
    public static void main(String[] args) {
        int arrayData[] = {100,10,1,2,3,100,10,4,4,100};
        int distinctElements [] = new int[arrayData.length];

        for(int i=0; i<arrayData.length; i++){
            boolean flag = false;
            if(i == 0){
                distinctElements[i] = arrayData[i];
            }
            int temp = arrayData[i];
            for(int j=0; j<distinctElements.length; j++){
                if (temp != distinctElements[j]){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                distinctElements[i] = temp;
            }
        }
        for (int value:distinctElements) {
            if(value > 0)
                System.out.println(value);
        }
    }
}
