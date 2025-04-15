import java.util.Scanner;

public class MatrizUnidimensional13 {
    public static void main(String[] args) {

        // 9. Leia 8 valores e escreva na tela o menor valor.

        Scanner teclado = new Scanner(System.in);
        int valor, menor;
        System.out.println("Digite um valor: ");
        menor = teclado.nextInt();

        for (int i = 2; i <= 8; i++) {

            System.out.println("Digite um valor: ");

            valor = teclado.nextInt();

            if (valor < menor) {

                menor = valor;

            }

        }
        System.out.println("O menor  valor é " + menor);

    }
}
