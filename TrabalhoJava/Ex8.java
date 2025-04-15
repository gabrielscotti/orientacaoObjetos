import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        // 8) Leia um número e verificar se o número digitado foi o número 15, se
        // for escreva uma mensagem informando que o número digitado foi o
        // número 15, senão escreva que o número digitado não foi o número
        // 15.

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");

        numero = teclado.nextInt();

        if (numero == 15) {

            System.out.println("O número digitado é igual a 15 ");

        } else {

            System.out.println("O número digitado é diferente de 15 ");

        }
    }

}
