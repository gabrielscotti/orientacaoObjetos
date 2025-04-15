import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        // 13)Soma dos números de 1 a 100
        // Objetivo: Usar o for para somar os números de 1 a 100 e imprimir o
        // resultado.

        Scanner teclado = new Scanner(System.in);

        float soma, valor = 0;

        soma = 0;

        for (int i = 1; i <= 100; i++) {

            soma = teclado.nextFloat();

            soma = soma + valor;

            System.out.println("Digite o valor " + i);
        }
        System.out.println("A soma dos cem valores digitados é " + soma);

                

    }

}
