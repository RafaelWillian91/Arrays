package arraysParâmetrosVarargs;

public class App6 {

    public static void main(String[] args) {

        int n = sum(new int[] {4,6,3,7});
        System.out.println(n);

        int m = sum2(new int[] {3,4,5,4});//posso passar quntos eu quiser ou nao passar nada que imprime 0
        System.out.println(m);

        //Varargs tem que ser o último parametro para poder passar quantos quiser e tambem posso passar sem declarar um array
        int h = sum3(4,6,5,6,7,9,5);
        System.out.println(h);
   }
  private static int sum(int [] numbers){
        int j = 0;
        for (int n: numbers) {
            j += n;
        }
        return j;
    }

    //Existe no java o varargs que trabalha como se fosse um array
    private static int sum2(int... numbers){//esse parametro pode receber um array//Tem que ser o ultimo se for mais de um
        int j = 0;
        for (int n: numbers) {
            j += n;
        }
        return j;
    }

    private static int sum3(int a, int... numbers){//Varag tem que ser o ultimo parametro
        int j = 0;
        for (int n: numbers) {
            j += n;
        }
        System.out.println("prefix => " + a);
        return j;
    }
}
