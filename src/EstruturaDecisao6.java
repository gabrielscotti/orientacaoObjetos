import java.util.Scanner;

public class EstruturaDecisao6 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite um Número");
        n1 = teclado.nextInt();

        System.out.println("Digite o segundo Número");
        n2 = teclado.nextInt();

        if (n1 == n2) {
            System.out.println("São Iguais");

        } else {
            System.out.println("São Diferentes");
        }

    }
}
