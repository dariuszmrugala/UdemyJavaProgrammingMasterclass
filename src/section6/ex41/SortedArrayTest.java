package section6.ex41;

public class SortedArrayTest {
    public static void main(String[] args) {
        int[] myArray = SortedArray.getIntegers(5);
        SortedArray.printArray(myArray);
        myArray = SortedArray.sortIntegers(myArray);
        SortedArray.printArray(myArray);
    }
}
