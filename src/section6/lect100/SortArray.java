package section6.lect100;

import java.util.Scanner;

public class SortArray {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int count) {
        int[] myArray = new int[count];
        for(int i = 0; i < count; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static int[] sortIntegers(int[] array) {

        for (int out = 0; out < array.length - 1 ; out++) {
            for (int i = 0; i < array.length - 1 - out; i++) {
                if (array[i] < array[i + 1]) {
                    swap(array, i);
//                    printArray(array);
                }
            }
        }

        return array;
    }

    private static void swap(int[] array, int i) {
        int temp = array[i +1];
        array[i +1] = array[i];
        array[i] = temp;
    }


}
