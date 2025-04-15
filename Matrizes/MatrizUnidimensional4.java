
import java.util.Scanner;

public class MatrizUnidimensional4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] gwa = new int[5];
        int soma = 0;

        for (int i = 0; i < gwa.length; i++) {
            System.out.println("Digite os valores da Matriz " + i);
            gwa[i] = teclado.nextInt();

            // soma = soma + gwa[i];
            soma += gwa[i];

        }

        // Imprimir Matriz
        for (int i = 0; i < gwa.length; i++) {
            System.out.println("Valores da Matrizes" + gwa[i]);

        }
        System.out.println("A soma dos valores da Matriz é " + soma);
    }
}
