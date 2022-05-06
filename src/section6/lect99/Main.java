package section6.lect99;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int intArray[] = getIntegers(3);

//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = i;
//        }

        System.out.println("Aver: " + getAverage(intArray));
    }

    private static int[] getIntegers(int count) {
        int[] array = new int[count];

        for(int i = 0 ; i < count ; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double)  sum / (double) array.length;
    }
}
