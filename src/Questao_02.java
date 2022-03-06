

public class Questao_02{

    public static void main (String[] args) {

        int[] vet = {1,5,3,4,2,6,10,13};
        int n = 2;

        retornaQteDiferencas(vet,n);


    }

    public static void retornaQteDiferencas(int[] vetor,int numero){

        int count = 0;
        for(int i=0;i<vetor.length;i++){
            for(int j=0;j<vetor.length;j++){

                if(vetor[i]-vetor[j] == numero){
                    count+=1;
                    //System.out.println("["+vetor[i]+","+vetor[j]+"]");
                }
            }
        }
        System.out.println(count);
    }
}
