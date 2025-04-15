import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        // 12)Imprimir a tabuada de um número

        Scanner teclado = new Scanner(System.in);

        int i, resultado;

        for (i = 0; i <= 10; i++) {

            resultado = 9 * i;
            System.out.println("9 x " + i + "=" + resultado);

        }
    }

}
