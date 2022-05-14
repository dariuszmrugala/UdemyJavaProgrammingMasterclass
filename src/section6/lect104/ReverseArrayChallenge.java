package section6.lect104;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array) {
//        System.out.println(array.length/2);
        for(int i = 0; i < array.length/2; i++) {
//            System.out.println(i + ":");
            int temp = array[array.length-i-1];
            array[array.length-i-1] = array[i];
            array[i] = temp;

        }
    }


}
