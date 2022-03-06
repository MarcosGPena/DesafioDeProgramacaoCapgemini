
import java.util.ArrayList;
import java.util.Scanner;

public class Questao_01{

    public static void main(String[] args) {

        ArrayList<Integer> vec = new ArrayList<>();

        mediana(vec);

    }


    public static void mediana(ArrayList<Integer> values){

        values.sort(null);

        int mediana = values.get(values.size()/2);

        System.out.println(mediana);


    }
}
