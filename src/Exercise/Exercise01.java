package Exercise;

import java.util.Arrays;

public class Exercise01 {

    public static void main(String[] args) {

        int[] array2 = new int[] {2,3,6,5,8,9};
        potentiation(array2);
        System.out.println(Arrays.toString(array2));

        String a = "A";
        String b = null;

        System.out.print(a + b.toString());

    }


    private static void potentiation(int[] array){

        for (int i = 0; i < array.length; i++) {
             array[i] = Math.multiplyExact(array[i], array[i]);
        }
    }
}
