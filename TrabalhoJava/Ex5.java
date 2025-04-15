import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        // 5) Leia três notas de um aluno, se a média for maior ou igual a 7, o aluno
        // está aprovado, se a média for maior ou igual a 5 e menor que 7, o aluno está
        // em recuperação, senão o aluno está reprovado. Mostre a mensagem correta.

        Scanner teclado = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("DIgite o valor da nota 1: ");
        nota1 = teclado.nextFloat();

        System.out.println("Digite o valor da nota 2: ");
        nota2 = teclado.nextFloat();

        media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");

        } else {
            System.out.println("Reprovado");

        }

    }

}