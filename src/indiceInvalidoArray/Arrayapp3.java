package indiceInvalidoArray;

import java.util.Arrays;

public class Arrayapp3 {


    public static void main(String[] args) {

        String[] arrayString = new String[2];

        arrayString[0] = "A";
        arrayString[1] = "B";

        System.out.println(Arrays.toString(arrayString));

        //O java implementa um mecanismo em tempo de execucao para impedir que voce acesse elementos fora do array
        System.out.println(arrayString[2]);//É lançada uma excecao ArrayIndexOutOfBoundsException por nao existir o indice 2




    }
}
