import java.util.Scanner;

public class EstruturaRepeticaoWhile4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int i = 0;
        int fim;

        System.out.println("Digite um valor entre 0 e 20: ");
        fim = teclado.nextInt();

        while (i <= fim) {
            System.out.println("Quantidade da repetição");

            i++;
        }
    }
}
