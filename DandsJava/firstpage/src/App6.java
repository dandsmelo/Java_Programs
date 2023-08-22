import java.util.Scanner;

public class App6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m[][]; //criando a matriz
        m = new int[3][]; //definindo a quantidade de linhas
        for (int l=0;l<m.length;l++){
            m[l] = new int[3]; //definindo a quantidade de colunas 
            for (int c=0;c<m[l].length;c++){
                System.out.printf("Digite um elemento para linha %d e coluna %d ", l, c);
                m[l][c] = sc.nextInt(); //pegando os valores das linhas e das colunas
            }
        }
        for(int l=0; l<m.length; l++){// percorrendo as linhas
            for(int c=0; c<m[l].length;c++){//percorrendo as colunas
                System.out.printf("m[%d][%d]=%d\t",l,c,m[l][c]);
        }
        System.out.println();
    }
    }
}
//Matriz