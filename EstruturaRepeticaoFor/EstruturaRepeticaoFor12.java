import java.util.Scanner;

public class EstruturaRepeticaoFor12 {
    public static void main(String[] args) {

        // Exercício 15

        Scanner teclado = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor");

        valor = teclado.nextInt();

        for (int i = 1; i <= valor; i++) {

            System.out.println(i);

        }
    }

}
