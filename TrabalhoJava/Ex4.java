
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        // 4) Faça um software que leia a idade de uma pessoa expressa em anos, meses e
        // dias e mostre-a expressa apenas em dias. Considerar que cada ano possua 365
        // dias e que cada mês possua 30 dias.

        Scanner teclado = new Scanner(System.in);

        int ano, mes, dia, totaldias;

        System.out.println("Informe a idade em anos: ");
        ano = teclado.nextInt();

        System.out.println("Informe a idade em meses: ");
        mes = teclado.nextInt();

        System.out.println("Informe a idade em dias: ");
        dia = teclado.nextInt();

        totaldias = ano * 365 + mes * 30 + dia;

        System.out.println("A idade é" + totaldias);

    }

}
