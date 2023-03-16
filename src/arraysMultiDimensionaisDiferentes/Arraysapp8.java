package arraysMultiDimensionaisDiferentes;

public class Arraysapp8 {

    public static void main(String[] args) {

        //O java permite criar arrays MultiDimensionais com o segundo dimenssão vazia para ser declarada depois
        int [][] array = new int[4][];
        
        array[0] = new int[2];
        array[1] = new int[3];
        array[2] = new int[3];
        array[3] = new int[5];


//        for (int[] d1: array) {
//
//            for (int d2 : d1) {
//                System.out.print(d2);
//            }
//            System.out.println();
//
//        }

        test(array);
        
    }

    private static void test(int[][]ar){
        for (int[] d1: ar) {

            for (int d2 : d1) {
                System.out.print(d2);
            }
            System.out.println();

        }
    }
}
