import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        // 3) Elaborar um software que calcule e apresente o volume de uma caixa
        // retangular, por meio da fórmula:
        // VOLUME = COMPRIMENTO * LARGURA * ALTURA

        Scanner teclado = new Scanner(System.in);

        float volume, comprimento, largura, altura;

        System.out.println("Digite o comprimento: ");
        comprimento = teclado.nextFloat();

        System.out.println("Digite a largura: ");
        largura = teclado.nextFloat();

        System.out.println("Digite a altura");
        altura = teclado.nextFloat();

        volume = comprimento * largura * altura;

        System.out.println("O volume é " + volume);

    }

}
