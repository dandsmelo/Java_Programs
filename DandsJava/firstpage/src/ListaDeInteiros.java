public class ListaDeInteiros{
    private int dados[];
    private int tamanho;

    public ListaDeInteiros(int capMax){
        dados = new int[capMax];

        //o java pré inicializa os atributos do tipo inteiro com o valor 0, do tipo real com o valor 0.0 e atributos
        // com o tipo abstratato de dados são inicializados com null
        //Portanto tamanho recebeu o valor 0 
    }
    public void adicionaFinal(int e)throws Exception{
         if(dados.length != tamanho){
        //não está cheia
        dados[tamanho] = e;
        tamanho = tamanho + 1;
        } else{
            //sim está cheia
            throw new Exception("ERRO! Lista cheia");
        }
    }
   
}