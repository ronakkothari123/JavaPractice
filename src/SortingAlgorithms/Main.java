package SortingAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{5, 1, 4, 2, 8, 14, 2, 27, 6})));
        System.out.println(Arrays.toString(bubbleSort(new int[]{5, 1, 4, 2, 8, 14, 2, 27, 6})));
        System.out.println(Arrays.toString(insertionSort(new int[]{5, 1, 4, 2, 8, 14, 2, 27, 6})));
    }

    public static int[] selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int minimumIndex = i;
            int elementSelected = array[i];

            for(int j = i; j < array.length; j++) if(array[j] < array[minimumIndex]) minimumIndex = j;

            array[i] = array[minimumIndex];
            array[minimumIndex] = elementSelected;
        }

        return array;
    }

    public static int[] bubbleSort(int[] array){
        while(true){
            boolean swapped = false;

            for(int i = 0; i < array.length - 1; i++) if(array[i] > array[i + 1]){
                swapped = true;
                int swapInt = array[i];

                array[i] = array[i + 1];
                array[i + 1] = swapInt;
            }

            if(!swapped) break;
        }

        return array;
    }

    public static int[] insertionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++) if(array[i] > array[i + 1]){
            int swapInt = array[i];
            array[i] = array[i + 1];
            array[i + 1] = swapInt;
            if(i != 0) i -= 2;
        }

        return array;
    }
}
