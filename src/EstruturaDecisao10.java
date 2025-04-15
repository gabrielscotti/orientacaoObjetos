import java.util.Scanner;

public class EstruturaDecisao10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float altura, pesoideal;

        int sexo;

        System.out.println("Digita a sua Altura");

        altura = teclado.nextFloat();

        System.out.println("Informe o sexo - 1 (F) ou 2 (M)");

        sexo = teclado.nextInt();

        if (sexo == 1) {

            pesoideal = (float) ((62.1 * altura) - 44.7);

        } else {

            pesoideal = (float) ((72.7 * altura) - 58);

            System.out.println("O Peso Ideal é " + pesoideal);
        }

    }

}
