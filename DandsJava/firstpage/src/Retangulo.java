import java.util.Scanner;

public class Retangulo {
    public double altura;
    public double largura;

    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        System.out.println("Digite a largura do retângulo: ");
        double largura = sc.nextDouble();

        //Retangulo r = new Retangulo();
        //double r.calcularArea(double altura, double largura);


    }
    
    public double calcularArea(double altura, double largura){
        return (altura * largura);
    }
    
    public double calcularPerimetro(double altura, double largura){
        return (largura + altura) * 2; 
    }

    public double calcularDiagonal(double altura, double largura){
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura,2));
    }
}
