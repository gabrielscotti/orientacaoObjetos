import java.util.Scanner;

public class EstruturaDoWhile1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        do {

            System.out.println("Digite um número positivo");
            numero = teclado.nextInt();

        } while (numero >= 0);

        System.out.println("Digite um número válido" + numero);

    }

}
