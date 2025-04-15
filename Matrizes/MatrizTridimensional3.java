import java.util.Scanner;

public class MatrizTridimensional3 {
    public static void main(String[] args) {

        // 19. Leia uma matriz 3x3x3 e peça para o usuário digitar e verifique quantas
        // vezes aparece o valor 5 na matriz.

        Scanner teclado = new Scanner(System.in);

        int[][][] matriz = new int[3][3][3];

        int vezes = 0;

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                for (int k = 0; k <= 1; k++) {

                    System.out.println("Informe um valor");
                    matriz[i][j][k] = teclado.nextInt();

                    if (matriz[i][j][k] == 5) {

                        vezes++;// vezes=vezes+1

                    }
                }
                System.out.println("Apareceu o número 5: " + vezes + "vezes");
            }
        }
    }
}
