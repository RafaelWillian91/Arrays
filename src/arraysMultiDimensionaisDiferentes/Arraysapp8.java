package arraysMultiDimensionaisDiferentes;

public class Arraysapp8 {

    public static void main(String[] args) {

        //O java permite criar arrays MultiDimensionais com o segundo dimenssão vazia para ser declarada depois
        int [][] array = new int[4][];
        
        array[0] = new int[2];
        array[1] = new int[3];
        array[2] = new int[3];
        array[3] = new int[5];

//foreach interacao:
//        for (int[] d1: array) {
//
//            for (int d2 : d1) {
//                System.out.print(d2);
//            }
//            System.out.println();
//
//        }

        //teste passagem de array MultiDimensional
        test(array);
        
    }

    private static void test(int[][]ar){
        for (int i = 0; i < ar.length; i++){

            //cada interacao considera a quantidade de colunas para interar.Ex : ar.length vale 4 que é o tamanho total.
            //Já ar[i].length vale 2 que é o total de colunas da linha 1 no caso 0 do array dimenssao 1.
            for (int j = 0; j < ar[i].length; j++){

                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}
