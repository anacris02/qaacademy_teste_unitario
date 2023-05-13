package teste_unitario;
public class Ex03 {
    public static boolean eDivisivePorDois(int num){
        if(num%2==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        int meuValor = 3210;
        System.out.println(eDivisivePorDois(meuValor));
        
    }
}
