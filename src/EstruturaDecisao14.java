import java.util.Scanner;

public class EstruturaDecisao14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor: ");

        valor = teclado.nextInt();

        if (valor >= 350 && valor <= 500) {

            System.out.println("O valor se encontra no intervalo entre 350 e 500");

        } else {

            System.out.println("O valor não se encontra no intervalo entre 350 e 500");
        }
    }

}
