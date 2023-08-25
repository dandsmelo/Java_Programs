public class SomaTotal {
    public static void main(String[] args){
        int soma = 0;
        
        for(int i=1;i<=100;i++){
            soma+=i;
        }
        System.out.print("O resultado da soma dos cem primeiros números é de " + soma);
    }
}
