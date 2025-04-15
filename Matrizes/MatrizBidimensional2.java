import java.util.Scanner;

public class MatrizBidimensional2 {
    public static void main(String[] args) {

        // 18. Leia uma matriz 2X2 e realizar a soma da diagonal principal,
        // subtraindo da diagonal secundária.

        Scanner teclado = new Scanner(System.in);

        int[][] valor = new int[2][2];
        int resultado = 0;

        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor.length; j++) {

                System.out.println("Valores da Matriz " + i + " - " + j);
                valor[i][j] = teclado.nextInt();

            }

        }
        // Imprimir Matriz
        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor.length; j++) {

                resultado = (valor[0][0] + valor[1][1]) - (valor[0][1] + valor[1][0]);

            }

        }
        System.out.println(resultado);
    }

}
