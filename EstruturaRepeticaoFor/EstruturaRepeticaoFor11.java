import java.util.Scanner;

public class EstruturaRepeticaoFor11 {
    public static void main(String[] args) {

        // Exercício 13

        Scanner teclado = new Scanner(System.in);

        int valor, soma;

        soma = 0;

        for (int aux = 1; aux <= 7; aux++) {

            System.out.println("Digite o valor: " + aux);

            valor = teclado.nextInt();
            soma = soma + valor;
        }
        System.out.println("A soma dos sete valores digitados é " + soma);

    }

}
