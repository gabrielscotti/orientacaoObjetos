import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        // 2) Faça um software para calcular a área de um triângulo retângulo. Fórmula
        // da área. Área=(Base * altura)/2.

        Scanner teclado = new Scanner(System.in);

        float base, altura, area;

        System.out.println("Digite o valor base: ");
        base = teclado.nextFloat();

        System.out.println("Digite o valor altura: ");
        altura = teclado.nextFloat();

        System.out.println("Digite o valor área: ");
        area = teclado.nextFloat();

        area = (base * altura) / 2;

        System.out.println("A área é" + area);

    }

}
