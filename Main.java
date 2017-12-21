package com.allanwilson;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[25];

        for (int i=0; i<myIntArray.length; i++){
            myIntArray[i]=(i*10)+10;
        }

        for (int i=0; i<myIntArray.length; i++){
            System.out.println(myIntArray[i]);
        }

        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};
        printArray(myIntArray2);
        }

        public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
            }
        }

        int[] myIntegers = getIntegers(5);

        public static int[] getIntegers(int number){
            System.out.println("Enter " + number + " integer values.\r");
            int[] values = new int[number];

            for (int i=0; i<values.length; i++){
                values[i] = scanner.nextInt();
            }

            return values;
        }
}