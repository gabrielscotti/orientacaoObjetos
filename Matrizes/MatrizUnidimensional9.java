import java.util.Scanner;

public class MatrizUnidimensional9 {
    public static void main(String[] args) {

        // 5. Leia um vetor de 5 valores inteiros e escreva na tela o vetor.

        Scanner teclado = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i <= 4; i++) {

            System.out.println("Informe um valor: ");

            vetor[i] = teclado.nextInt();

        }
        for (int i = 0; i <= 4; i++) {

            System.out.println(vetor[i]);

        }
    }

}
