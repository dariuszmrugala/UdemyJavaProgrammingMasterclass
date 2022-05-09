package section6.ex41;

import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[size];
        for(int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray(int[] myArray) {
        for(int i = 0 ; i < myArray.length ; i++) {
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
    }

    public static int[] sortIntegers(int[] arrayToSort) {

        int[] sortedArray = new int[arrayToSort.length];
        for(int i = 0 ; i < arrayToSort.length; i++) {
            sortedArray[i] = arrayToSort[i];
        }

        for(int i = 0; i < sortedArray.length; i++) {
            for(int j = 0; j < sortedArray.length - i - 1; j++) {
                if(sortedArray[ j ] < sortedArray[ j+1 ]) {
                    int temp = sortedArray[ j+1 ];
                    sortedArray[ j+1 ] = sortedArray [ j ];
                    sortedArray[ j ] = temp;
                }
            }
        }

        return sortedArray;
    }
}
