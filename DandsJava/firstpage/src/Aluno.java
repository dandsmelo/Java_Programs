import java.util.Scanner;

public class Aluno {
    public int ra;
    public String nome;
    private String endereco;
    public String curso;
    private double notaFinal;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("RA: ");
        int ra = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Qual é seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Qual é seu endereço: ");
        String endereco = sc.nextLine();

        System.out.println("Qual é seu curso:");
        String curso = sc.nextLine();

        System.out.print("RA:" + ra + "\n" + "Nome: " + nome + "\n" + "Endereço: " + endereco + "\n" + "Curso: " + curso);


    }

    boolean conferirMatricula(String curso){
        if(curso == "DSM"){
            return true;
        }
        else
            return false;
    }

    public boolean estaAprovado() {
        return notaFinal >= 6.0;
    }

}
