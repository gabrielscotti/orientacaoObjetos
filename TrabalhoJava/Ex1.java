import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        //1) Faça um algoritmo que leia duas notas de um aluno e apresente na tela a média.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nota 1");
        float nota1 = teclado.nextFloat();

        System.out.println("Digite a Nota 2:");
        float nota2 = teclado.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println("A média é:" + media);

    }

}
