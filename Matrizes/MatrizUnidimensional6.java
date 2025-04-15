import java.util.Scanner;

public class MatrizUnidimensional6 {
    public static void main(String[] args) {

        //2. Leia três valores inteiros e determine o menor deles.

        Scanner teclado = new Scanner(System.in);

        int menor, valor, i;

        System.out.println("Informe um valor: ");

        valor = teclado.nextInt();

        menor = valor;

        for (i = 1; i <= 2; i++) {

            System.out.println("Informe um valor");

            valor = teclado.nextInt();

        }
        if (valor < menor) {

            menor = valor;

        }
        System.out.println("O menor valor é " + menor);

    }

}
