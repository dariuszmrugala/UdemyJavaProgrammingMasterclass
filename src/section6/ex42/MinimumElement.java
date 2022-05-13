package section6.ex42;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        return new Scanner(System.in).nextInt();
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for(int i = 0 ; i < count ; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }
}
