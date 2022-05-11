package section6.lect102;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] myArray = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(myArray));
        changeArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static void changeArray(int[] array) {
        array = new int[] {3,3,3,3};
    }
}
