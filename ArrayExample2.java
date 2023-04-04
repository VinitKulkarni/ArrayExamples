package com.bridgelabz.ArrayExamples;

//2) Java Program to find the frequency of each element in the array
public class ArrayExample2 {
    public static void main(String[] args) {
        int arrayData[] = {1,2,3,1,2,3,10,10};
        int countStoreArray[] = new int[arrayData.length];
        int visited = -1;

        for(int i=0; i<arrayData.length; i++){
            int elementCount = 1;
            for(int j=i+1; j<arrayData.length; j++){
                if (arrayData[i] == arrayData[j]){
                    elementCount++;
                    countStoreArray[j] = visited;
                }
            }
            if(countStoreArray[i] != visited){
                countStoreArray[i] = elementCount;
            }
        }


        for(int i=0; i<arrayData.length; i++){
            if(countStoreArray[i] != visited){
                System.out.println(arrayData[i] + " repeated " + countStoreArray[i] + " times");
            }
        }

    }
}
