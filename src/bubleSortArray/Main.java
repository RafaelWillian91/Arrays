package bubleSortArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,4,9,8,6,5,7,2,3,0};
        System.out.println(Arrays.toString(array));

        orderNumber(array);

        System.out.println(Arrays.toString(array));

    }

    private static void orderNumber(int [] array){

        for (int i = 0; i < array.length -1; i++) {

            for (int j = i + 1; j < array.length ; j++) {
                while (array[i] > array[j]){
                    int a = array[j];
                    array[j] = array[i];
                    array[i] = a;
                }

            }


        }

    }

}
