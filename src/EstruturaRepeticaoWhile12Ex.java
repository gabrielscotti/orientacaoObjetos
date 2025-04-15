import java.util.Scanner;

public class EstruturaRepeticaoWhile12Ex {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int soma = 0;
        int i = 0;

        while (i <= 6) {
            System.out.println("Digite 7 números");
            numero = teclado.nextInt();

            soma += numero;
            i++;

        }
        System.out.println("A soma é " + soma);
    }

}
