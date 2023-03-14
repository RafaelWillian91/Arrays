package iterandoArray;

public class Arrayapp5 {

    public static void main(String[] args) {

        int [] array = {1, 3, 5, 7, 4, 2, 7, 9};

        //Iterar é percorrer os indices do Array

        //Qualquer estrutura for pode iterar no array.
        //O array por ser um objeto tem algumas caracteristicas.
        //Uma delas é o length que é um atributo do array, não é um método, pq método tem ().
        for (int i = 0; i < array.length; i++) {
            System.out.format("=> %d\n", array[i]);
        }

        for (int n: array) {//Unica coisa que para aqui é o break e o continue
            System.out.println(n);
            if(n == 3){
                break;
            }
        }

    }

}
