package arrays;

import java.util.Arrays;

public class Arraysapp2 {

    public static void main(String[] args) {

        int[] array = new int[5];

        System.out.println(array);

        //A classe Arrays tem um método que já foi criado para varrer um array

        System.out.println(Arrays.toString(array));//saída: 0, 0, 0, 0, 0
        //Sempre que voce inicializa um array os elementos são inicializados com algo

        //Com tipo var nao precisa []
        var array2 = new boolean[5];
        System.out.println(Arrays.toString(array2));//tudo false

        var array4 = new String[5];
        System.out.println(Arrays.toString(array4));//No caso de arrays de classes é tudo null a inicializacao


        var array5 = new int[] {1, 5, 4, 6, 10};//Nessa forma nao preciso colocar o tamanho, a partir da inicilizacao
        //o java sabe o tamanho que deve ser o array

        System.out.println(Arrays.toString(array5));

        //Uma outra forma de criar e inicializar
        int[] array6 = {2, 3, 4, 3};//Dessa forma não pode ser o tipo var, pq o java a fortemente tipado
        System.out.println(Arrays.toString(array6));

    }
}
