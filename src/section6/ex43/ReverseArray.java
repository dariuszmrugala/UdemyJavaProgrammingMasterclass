package section6.ex43;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        for(int i = 0; i < array.length/2; i++) {
//            System.out.println(i + ":");
            int temp = array[array.length-i-1];
            array[array.length-i-1] = array[i];
            array[i] = temp;

        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
