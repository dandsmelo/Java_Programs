public class ConversaoRepeticao {
    
    public static double conversao(int celsius){
        return (celsius * 9.0/5.0) + 32.0;

    }
    public static void main(String[] args){
        
        System.out.println("Celsius\tFahrenheit");

        for(int celsius = 10;celsius<=100;celsius+=10){
            double fahrenheit = conversao(celsius);
            System.out.println(celsius + "\t" + fahrenheit);
        }
    }
}
