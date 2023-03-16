package arraysStackHeap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App6 {

    public static void main(String[] args) {

        int []x = {10};

        sum2(x);
        System.out.println(x);
        System.out.println(Arrays.toString(x));

    }

    //Aqui só a copia da referencia, então o valor não é mudado.
    private static void sum(int f){

        f++;
    }

    private static void sum2(int[] f){

        f[0]++;
    }



}
