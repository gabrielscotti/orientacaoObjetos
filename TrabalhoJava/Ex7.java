import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        // 7) Leia a idade de uma pessoa e informe se a pessoa é: 1. Criança (idade
        // < 12) 2. Adolescente (12 <= idade
        // <= 18) 3. Jovem (18 < idade < 30)
        // Adulto (30 <= idade <= 60) 5. Idoso (idade > 60)

        Scanner teclado = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();

        if (idade <= 12) {
            System.out.println("Criança");

        } else if (idade <= 18) {
            System.out.println("Adolescente");

        } else if (idade <= 30) {
            System.out.println("Jovem");

        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

    }

}
