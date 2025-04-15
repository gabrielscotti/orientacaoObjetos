import java.util.Scanner;

public class EstruturaRepeticaoWhile12 {

    public static void main(String[] args) {

        // exercício 7

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
