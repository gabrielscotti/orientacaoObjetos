import java.util.Scanner;

public class EstruturaRepeticaoFor13 {

    public static void main(String[] args) {

        // Exercício 23

        Scanner teclado = new Scanner(System.in);

        int i = 1;

        int resultado = 1;

        int valor;

        while (i <= 4) {

            System.out.println("Digite um valor: ");

            valor = teclado.nextInt();

            resultado = resultado * valor;
            i++;

            System.out.println("A multiplicação dos elementos é igual a " + resultado);

        
        }

    }

}
