import java.util.Scanner;

public class EstruturaDoWhile2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcao;
        boolean continuar = true;
        String empresa, endereco;
        int numero;
        float preco;

        String cliente, cliente_endereco;
        int cliente_numero;
        float cliente_preco;

        do {
            System.out.println("Digite 1,2,3 ou 4 para Sair: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    empresa = teclado.nextLine();
                    System.out.println("Cadastro Empresa");
                    empresa = teclado.nextLine();
                    System.out.println("Cadastre o Endereço");
                    endereco = teclado.nextLine();
                    System.out.println("Cadastre o Número");
                    numero = teclado.nextInt();
                    System.out.println("Preço");
                    preco = teclado.nextFloat();


                    System.out.println("Nome da empresa é:"
                     + empresa + "Endereço"+ endereco 
                     + " \n Número" + numero 
                     + "Preço" + preco);
                    
                    break;

                case 2:
                cliente = teclado.nextLine();
                    System.out.println("Cadastro Cliente");
                    cliente = teclado.nextLine();
                    System.out.println("Cadastre o Endereço");
                    cliente_endereco = teclado.nextLine();
                    System.out.println("Número");
                    cliente_numero = teclado.nextInt();
                    System.out.println("Preço");
                    cliente_preco = teclado.nextFloat();

                    break;

                case 3:

                    System.out.println("Cadastro do produto");
                    break;

                case 4:

                    continuar = false;

                    break;

                default:

                    System.out.println("Número Inválido");
            }

        } while (continuar);
    }

}
