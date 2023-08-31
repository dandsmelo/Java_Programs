public class ArrayAB {
    public static void main(String[] args){
        int[] vetorA = new int[10];//definindo tamanho do vetor
        int[] vetorB = new int[10];
        for(int i=0;i<vetorA.length;i++){
            vetorA[i] = i + 1;
        }

        for(int i = 0;i<vetorB.length;i++){
            vetorB[i] = vetorA[i]*2;
        }

        System.out.print("Vetor A: ");
        for(int i = 0;i<vetorA.length;i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("Vetor B: ");
        for(int i = 0;i<vetorB.length;i++){
            System.out.print(vetorB[i] + " ");
        }

    }
}
//Criar uma coleção “A” na linguagem Java com 10 elementos–	Inserir os elementos de 1 a 10 na coleção–	Criar uma outra coleção B que conterá o elemento da coleção A multiplicado por 2–	Mostrar as duas coleçõesObs. Não efetuar a leitura de 10 elementos