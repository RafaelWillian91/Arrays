package arraysMultiDimensionais;

public class Array007 {

    public static void main(String[] args) {

//        int[][] arrayM = new int [3][2];
//        arrayM[0][0] = 4;
//        arrayM[2][1] = 6;

        //Inicialização de arrays Multidimensionais
        int[][] arrayM = {{1, 2}, {3, 5}, {4, 6}};
        // cada Chave é uma linha. Seria como está abaixo.
        /*{
            {1,2},
            {3,5},
            {4,6}
        };*/
        t(arrayM);
        for (int i = 0; i < arrayM.length; i++) {
            //dentro do array tem outro array para segunda dimensao, por isso que é arrayM[i].length.
            for (int j = 0; j < arrayM[i].length; j++) {
                System.out.print(arrayM[i][j]);
            }
            System.out.println();
        }

    }


    private static void t(int[][] varargs) {//a copia da referencia para o heap é passada
        System.out.println("_____________________________");
        for (int i = 0; i < varargs.length; i++) {
            //dentro do array tem outro array para segunda dimensao, por isso que é arrayM[i].length.
            for (int j = 0; j < varargs[i].length; j++) {
                System.out.print(varargs[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
    }

}