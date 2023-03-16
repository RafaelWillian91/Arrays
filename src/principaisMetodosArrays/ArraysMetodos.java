package principaisMetodosArrays;


import java.util.Arrays;

public class ArraysMetodos {

    public static void main(String[] args) {

        String [] array = new String[4];
        //A classe Array tem alguns métodos uteis para manipular arrays com o fill que em uma de suas sobrecargas
        //Ela recebe o array e o nome que voce quer colocar dentro de cada posicao do array
        //Como tambem pode receber um indice inicial e final
        Arrays.fill(array, 0, 3, "RAFAEL");
        System.out.println(Arrays.toString(array));

        System.out.println("---------------------------------");
        array[0] = "C";
        array[1] = "B";
        array[2] = "A";
        array[3] = "D";
        //Metodo que ordena um array
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        //Metodo que faz uma buca dentro de um array ordenado (sort)
        System.out.println(Arrays.binarySearch(array, "A"));

        //Arrays não podem ter seu tamanho expandido. Existe um metodo no java que copia o array
        //Ele retorna o array de acordo com o copiado
        String[] array2 = Arrays.copyOf(array, 9);
        //Arrays.fill(array2, 0, array2.length, null); Forma de limpar o array com metodo fill
        System.out.println(Arrays.toString(array2));

    }

}
