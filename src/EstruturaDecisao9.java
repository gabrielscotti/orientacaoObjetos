import java.util.Scanner;

public class EstruturaDecisao9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float salarioBase, salarioLiquido, bonus;

        int idade;

        System.out.println("Digite o valor do salário base");

        salarioBase = teclado.nextFloat();

        System.out.println("Digite a idade do funcionário");

        idade = teclado.nextInt();

        bonus = 0;

        if (salarioBase >= 1000 && idade > 50)
            ;

        bonus = (float) (salarioBase * 0.05);

        salarioLiquido = salarioBase + bonus;
        System.out.println("O salário base é " + salarioBase);
        System.out.println("O salário líquido é " + salarioLiquido);
        System.out.println("O bônus é " + bonus);

    }

}
