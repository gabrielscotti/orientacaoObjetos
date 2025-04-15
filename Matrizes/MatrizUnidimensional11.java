import java.util.Scanner;

public class MatrizUnidimensional11 {
    public static void main(String[] args) {

        // 7. Leia um vetor de 3 valores inteiros e escreva na tela o vetor.

        Scanner teclado = new Scanner(System.in);

        int[] valores = new int[3];

        for (int i = 0; i <= 2; i++) {

            System.out.println("Digite o valor" + (i + 1));

            valores[i] = teclado.nextInt();
        }
        System.out.println("Os valores digitados foram: ");

        for (int i = 0; i <= 2; i++) {

            System.out.println(valores[i]);

        }

    }

}
