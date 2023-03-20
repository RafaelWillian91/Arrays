package ExerciseElementosArray;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;

public class ExerciseApp2 {


    public static void main(String[] args) {

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        Item[] array = new Item[5];
        array[0] = new Item("Cafe", 10.90);
        array[1] = new Item("Açucar", 4.60);
        array[2] = new Item("Coador", 6.0);
        array[3] = new Item("Farinha", 5.50);
        array[4] = new Item("Arroz", 12.90);


        System.out.println(Arrays.toString(array) + "\n");

        Object[] object = process(array);
        //É seguro fazer o cast devido, pq em memória eu sei o que esta vindo em casa posicao do array.
        System.out.println("Menor Valor => "+ ((Item)object[0]).getName() + " " + numberFormat.format(((Item) object[0]).getPrice()));
        System.out.printf("Maior Valor => %s %s\n", ((Item)object[1]).getName() , numberFormat.format(((Item) object[1]).getPrice()));
        System.out.println("Preço Médio dos Items: " + numberFormat.format(object[2]) + "\n");

    }

    //Método que retorna como Object[] mais de um Item de array para ser feita a conversão quando chegar a resposta.
    private static Object[] process(Item[] item){

        BigDecimal sum3 = new BigDecimal(0);

        for (int i = 0; i < item.length; i++) {

            sum3 = sum3.add(BigDecimal.valueOf(item[i].getPrice()));

              for (int j = item.length -1; j > i; j--) {
                if(item[i].getPrice() > item[j].getPrice()){
                     Item[] itemAux = new Item[item.length];
                     itemAux[1] = item[j];
                     item[j] = item[i];
                     item[i] = itemAux[1];
                }
            }
        }
        //Tipo Object foi montado como array para suportar mais de um dado de Item (Item e BigDecimal)
        Object[] objects = new Object[3];
        objects[0] = item[0];
        objects[1] = item[item.length -1];
        objects[2] = sum3.doubleValue() / item.length;

        return objects;
    }


}
