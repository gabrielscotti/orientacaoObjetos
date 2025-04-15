import java.util.Scanner;

public class MatrizUnidimensional10 {
    public static void main(String[] args) {

        // 6. Leia cinco valores inteiros utilizando o comando for, verifique qual deles
        // é maior e apresente na tela para o usuário.

        Scanner teclado = new Scanner(System.in);

        int valor, maior;

        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();

        maior = valor;

        for (int i = 2; i <= 5; i++) {

            System.out.println("Digite um valor: ");
            valor = teclado.nextInt();

        }
        if (valor > maior) {

            maior = valor;

        }
        System.out.println("O maior valor é " + maior);

    }

}
