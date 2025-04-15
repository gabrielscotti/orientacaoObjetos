import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        // 6) Faça um software que calcule o salário líquido do funcionário da
        // empresa XYZ. Leia o salário base e a idade. Calcule o bônus do
        // funcionário, sendo o mesmo calculado pela seguinte regra de negócio:
        // para funcionários com salário maior ou igual a 1000 e com idade
        // superior a 50 anos, receberá 10% de bônus; funcionários com salário menor de
        // 1000,00 e com idade até 50 anos receberá somente 5%.
        // Imprima o salário base, o bônus do funcionário e o salário líquido.

        Scanner teclado = new Scanner(System.in);

        double salario;

        System.out.println("Digite seu salário: ");
        salario = teclado.nextDouble();

        if (salario <= 1000) {
            System.out.println("5%: " + (1000 * 5) / 100);

        } else if (salario <= 1500) {
            System.out.println("7%: " + (1500 * 7) / 100);

        } else if (salario <= 2500) {
            System.out.println("9%: " + (2500 * 9) / 100);

        } else if (salario <= 4000) {
            System.out.println("15%: " + (4000 * 15) / 100);

        } else {
            System.out.println("18%: " + (4000 * 18) / 100);

        }

    }

}
