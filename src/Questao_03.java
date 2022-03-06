
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao_03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Digite um texxto :");

        String texto = scan.nextLine();

        encriptar(texto);


    }

    public static void encriptar(String s){

        s = s.replaceAll("\\s+","");

        System.out.println(s);

        String[] sArray = s.split("(?!^)");

        int n =(int) Math.sqrt(s.length());

        if(n*n >= s.length()){

            List<String> list = new ArrayList<>((n+1)*n);

            for(int i = 0; i < (n+1)*n ; i++){

                if(i<s.length()){

                    list.add(sArray[i]);

                }else {

                    list.add(i, " ");
                }
            }
            System.out.println(list);
            for(int j = 0;j < n;j++){
                for(int k = 0;k < n+1;k++){
                    if(list.get(j + k * (n)).contentEquals(" ")){

                        System.out.println(list.get(j + k * (n)));

                    }else{
                        System.out.println(list.get(j + k * (n))+" ");
                    }
                }


            }

        }else{

            List<String> list = new ArrayList<>((n+2)*(n+1));

            for(int i = 0; i < (n+2)*(n+1) ; i++){

                if(i < s.length()){

                    list.add(sArray[i]);

                }else {

                    list.add(i, " ");

                }
            }
            //System.out.println(list);

            for(int j = 0;j < n+1;j++){

                for(int k = 0;k < n+2;k++){

                    if(list.get(j + k * (n + 1)).contentEquals(" ")){

                        System.out.println(list.get(j + k * (n + 1)));

                    }else{

                        System.out.println(list.get(j + k * (n + 1))+" ");
                    }
                }
            }
        }
    }

}

