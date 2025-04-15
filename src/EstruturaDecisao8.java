import java.util.Scanner;

public class EstruturaDecisao8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float n1, n2, n3, m;

        System.out.println("Informe a Nota 1: ");

        n1 = teclado.nextFloat();

        System.out.println("Informe a Nota 2: ");

        n2 = teclado.nextFloat();

        System.out.println("Informe a Nota 3: ");

        n3 = teclado.nextFloat();

        m = (n1 + n2 + n3);

        if (m >= 7) {
            System.out.println("Aprovado" + m);

        } else if (m >= 5) {
            System.out.println("Recuperação: " + m);

        } else
            System.out.println("Reprovado: " + m);

    }
}
