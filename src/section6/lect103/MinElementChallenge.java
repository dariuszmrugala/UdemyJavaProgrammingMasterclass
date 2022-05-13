package section6.lect103;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        int[] myArray = readIntegers(count);
        Arrays.toString(myArray);
        System.out.println("minimum is " + findMin(myArray));
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for(int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minimum = Integer.MAX_VALUE;
        for(int i : array){
            if(i < minimum) {
                minimum = i;
            }
        }
        return minimum;
    }

}
