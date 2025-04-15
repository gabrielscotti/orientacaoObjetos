import java.util.Scanner;

public class EstruturaRepeticaoFor7 {
    public static void main(String[] args) {

        // Exercício 5

        Scanner teclado = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int aux = 0; aux <= 4; aux++) {

            System.out.println("Informe um valor: ");

            vetor[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux <= 4; aux++) {

            System.out.println(vetor[aux]);

        }

    }

}
