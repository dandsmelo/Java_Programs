public class Array1 {
    public static void main(String[] args){
        int[] colecao = new int[10]; //estabelecendo o tamanho do vetor
        for(int i=0;i<colecao.length;i++){
            colecao[i] = i + 1;
        }
        System.out.print("Vetor: ");
        for(int i = 0; i<colecao.length;i++){
            System.out.print(colecao[i] + " ");
        }
    }
}
