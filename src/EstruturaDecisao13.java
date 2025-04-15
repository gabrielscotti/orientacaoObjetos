import java.util.Scanner;

public class EstruturaDecisao13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade de uma pessoa: ");

        idade = teclado.nextInt();

        if (idade < 12) {

            System.out.println("É uma criança");

        } else if (idade >= 12 && idade <= 18) {

            System.out.println("É um adolecente");

        } else if (idade > 18 && idade < 30) {
        
            System.out.println("É um jovem");

        } else if (idade >= 30 && idade <= 60) {

            System.out.println("É um adulto");

        } else {

            System.out.println("É um idoso");

        }

    }
}