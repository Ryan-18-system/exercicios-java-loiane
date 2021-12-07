package arrays;

import static java.lang.Math.sqrt;

public class ArrayTemperatura {
    public static void main(String[] args){

        // QUESTÃO 2
        /*
        int[] vetorA = {1,2,3,4,5,6,7,8,};
        int[] vetorB = new int[vetorA.length];
        for(int i=0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i]*2;

        }
        for( int vetores : vetorB){
            System.out.println(vetores);
        }*/

        // QUESTÃO 3
        int[] vetorC = new int[15];
        int[] vetorD= new int[vetorC.length];
        for(int i=0; i < vetorC.length; i++){
            vetorC[i] = i;
        }
        for(int j= 0; j < vetorC.length; j++){
            vetorD[j]= vetorC[j]*vetorC[j];
        }
        for (int result: vetorD
             ) {
            System.out.println(result);
        }
        // QUESTÃO 4
        int[] vetorE = new int[15];
        int[] vetorF= new int[vetorE.length];
        for(int k=0; k < vetorE.length; k++){
            vetorE[k] = k;
        }
        for(int s= 0; s < vetorE.length; s++){
            vetorF[s]= (int) sqrt(vetorE[s]);
        }
        for (int resultado: vetorF
        ) {
            System.out.println(resultado);
        }
    }

    /* Testando uma coisa */
}
