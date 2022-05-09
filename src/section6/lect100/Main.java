package section6.lect100;

public class Main {
    public static void main(String[] args) {
        final int size = 5;
        int[] array = SortArray.getIntegers(size);
        SortArray.printArray(array);
        array = SortArray.sortIntegers(array);
        SortArray.printArray(array);
    }
}
