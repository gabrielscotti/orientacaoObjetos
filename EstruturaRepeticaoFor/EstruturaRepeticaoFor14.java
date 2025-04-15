import java.util.Scanner;

public class EstruturaRepeticaoFor14 {
    public static void main(String[] args) {

        // Exercício 24

        Scanner teclado = new Scanner(System.in);

        int valor;

        int i = 2;

        int soma = 0;

        System.out.println("Digite um valor");

        valor = teclado.nextInt();

        while (i <= valor) {

        }
        if (i % 2 == 0) {

            soma = soma + i;

            i++;
        }
        System.out.println("A soma dos números pares é " + soma);
    }

}
