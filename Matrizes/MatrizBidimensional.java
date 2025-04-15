import java.util.Scanner;

public class MatrizBidimensional {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Declaração da Metriz Bidimensional

        int[][] brian = new int[3][3];
        int soma = 0 ;

        for (int i = 0; i < brian.length; i++) {

            //System.out.println("Valores de i: " + "[" + i + "]");

            for (int j = 0; j < brian.length; j++) {

                System.out.println("Valores de i e j: " + "[" + i + "]" + "[" + j + "]");

                brian[i][j] = teclado.nextInt();

                soma += brian [i][j];
            }
        }
        // Imprimir matriz Bidimencional
        for (int i = 0; i < brian.length; i++) {
            for (int j = 0; j < brian.length; j++){
                System.out.println("Valores da Matriz Bi " + brian[i][j]);

            }
        }

        System.out.println("Soma é " + soma);

    }

}
