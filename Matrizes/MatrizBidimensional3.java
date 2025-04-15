import java.util.Scanner;

public class MatrizBidimensional3 {
    public static void main(String[] args) {

        // 19. Leia uma matriz 2X2 e verifique quantas vezes aparece o valor 5 na
        // matriz.

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[2][2];

        int vezes = 0;

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {



                System.out.println("Informe um valor");
                matriz[i][j] = teclado.nextInt();

                if (matriz[i][j] == 5) {

                    vezes++;// vezes=vezes+1

                }


                

            }
            System.out.println("Apareceu o número 5: " + vezes + "vezes");

        }

    }

}
