
import java.util.Scanner;

public class EstruturaDecisao7 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int valor;

        System.out.println("Digite um Valor");
        valor = teclado.nextInt();

        System.out.println(valor % 2);

        if (valor %2 == 0) {
            System.out.println("É par");
            
        }else{
            System.out.println("É Ímpar");
        }


    
}
}