import java.util.Scanner;

public class MatrizBidimensional4 {
    public static void main(String[] args) {

        // 21. Faça um software que leia uma matriz 2X2, a seguir multiplique cada
        // elemento da matriz lida por 2 e escreva na tela o resultado.

        Scanner teclado = new Scanner(System.in);
        int[][] m = new int[2][2];

        int resultado;

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {

                System.out.println("Digite um valor");
                m[i][j] = teclado.nextInt();

            }

        }
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {

                resultado = m[i][j] * 2;
                System.out.println(resultado);

            }

        }

    }

}
