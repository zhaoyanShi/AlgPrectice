package zshi.alg.sort;

import util.IntArrayFactory;

public class BubbleSort {

    public static void main(String[] args) {

        int arraySize;

        if (args.length == 0) {
            arraySize = 50; // default size
        } else {
            arraySize = Integer.valueOf(args[0]);
        }

        int[] intArray = IntArrayFactory.buildIntArray(arraySize);

        // bubble Sort
        sort(intArray);

        IntArrayFactory.outputArray(intArray);

    }

    public static void sort(int[] a) {
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
