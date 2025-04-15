import java.util.Scanner;

public class EstruturaDecisao15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Exercício 10 !!!!!!

        float nota1, nota2, nota3, media;

        System.out.println("Digite a nota 1: ");

        nota1 = teclado.nextFloat();

        System.out.println("Digite a nota 2: ");

        nota2 = teclado.nextFloat();

        System.out.println("Digite a nota 3: ");

        nota3 = teclado.nextFloat();

        media = nota1 + nota2 + nota3;

        System.out.println("A média do aluno foi igual a " + media);

        if (media >= 5) {

            System.out.println("O aluno foi aprovado");

        } else {

            System.out.println("O aluno foi reprovado");
        }

    }

}
