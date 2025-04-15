import java.util.Scanner;

public class EstruturaDecisao16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");

        numero = teclado.nextInt();

        if (numero % 8 == 0) {

            System.out.println("O número é divisível por 8");

        } else {

            System.out.println("O número não é divisível por 8");
        }

    }
}
