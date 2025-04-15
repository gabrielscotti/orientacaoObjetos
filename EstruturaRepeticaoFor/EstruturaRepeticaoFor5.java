import java.util.Scanner;

public class EstruturaRepeticaoFor5 {
    public static void main(String[] args) {

        // Exercício 2

        Scanner teclado = new Scanner(System.in);

        int menor, valor, aux;

        System.out.println("Informe um valor: ");

        valor = teclado.nextInt();

        menor = valor;

        for (aux = 1; aux <= 2; aux++) {

            System.out.println("Informe um valor: ");

            valor = teclado.nextInt();

            if (valor < menor) {

                menor = valor;
    
            }

        }
      
        System.out.println("O menor valor é " + menor);

    }

}
