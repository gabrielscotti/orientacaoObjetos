
import java.util.Scanner;

public class MatrizUnidimensional3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] matriz = new int[5];

        // Preenche os valoras da Matriz
        for (int i = 0; i < matriz.length; i++) {

            System.out.println("Digite os valores da Matriz " + i);
            matriz[i] = teclado.nextInt();

        }
        // Imprime valores da Matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Valores da Matriz: " + matriz[i]);

        }
    }

}
