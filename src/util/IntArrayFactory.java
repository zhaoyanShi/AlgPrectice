package util;

public class IntArrayFactory {

    public static int[] buildIntArray(int arraySize) {
        int[] intArray = new int[arraySize];

        long factor = 123456789L;
        int divisor = 6547;

        for (int i = 0; i < arraySize; i++) {
            double randomNum = Math.random();

            intArray[i] = (int) ((randomNum * factor) / divisor);
        }

        return intArray;
    }

    public static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }

}
