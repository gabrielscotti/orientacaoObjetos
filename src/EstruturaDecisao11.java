import java.util.Scanner;

public class EstruturaDecisao11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float totalvendas, salario;

        System.out.println("Digite o total das vendas");

        totalvendas = teclado.nextFloat();

        if (totalvendas > 2000) {

            salario = (float) (totalvendas * 0.10 + 50);

        } else {

            salario = (float) (totalvendas * 0.075);

            System.out.println("O salário é " + salario);
        }

    }

}
