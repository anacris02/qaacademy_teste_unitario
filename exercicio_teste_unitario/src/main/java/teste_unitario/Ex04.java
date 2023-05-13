package teste_unitario;

public class Ex04 {
    public static void imprimirPalavra(String palavra){
        int i =0;
        while(i<4){
            System.out.println(palavra);
            i++;
        }
    }
    public static void main(String[] args){
        String palavra;
        imprimirPalavra(palavra:"Murilo");
    }
}
