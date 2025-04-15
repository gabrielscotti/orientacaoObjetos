import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        // 10) Utilizando o do while resolva a questão abaixo. Lembre do tipo Boolean.
        // Apresente um menu para o usuário com 4 opções. A) Cadastrar produto
        // B) Cadastrar Fornecedor
        // C) Cadastar Cliente
        // D) Sair
        // E) Para questões A,B,C deverá conter os respectivos cadastros, Para
        // produto: Cadastrar produto e quantidade, Para fornecedor:
        // Cadastrar fornecedor e Cadastrar cidade, Para Cliente, Cadastrar
        // cliente e cidade.
        // F) Repetir o menu para o usuário se deseja continuar cadastrando e
        // informar os menus, para sair digite

        Scanner teclado = new Scanner(System.in);

         int opcao;
        boolean continuar = true;
        String empresa, endereco;
        int numero;
        float preco;

        String cliente, cliente_endereco, produto;
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
                produto = teclado.nextLine();
                    System.out.println("Cadastro do produto");
                    produto = teclado.nextLine();
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

    


