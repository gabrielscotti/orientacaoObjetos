import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        // 9) Desenvolver um algoritmo que peça o código do cliente, se o código
        // for igual a 1, apresentar uma mensagem de (“Olá você terá acesso a
        // um parte do sistema”), caso se 2 (“você tem acesso parcial ao sistema
        // ”) caso seja 3 (“você é o administrador do sistema”).
        // A ) Se for (Cód 1) pedir senha de acesso e nome do usuário*, a senha 123
        // (“OK”) senão
        // verifique seu usuário e senha
        // B) Se for (Cód 2) pedir senha de acesso e nome do usuário*, a senha 456
        // (“OK”) senão
        // verifique seu usuário e senha

        // C) Se for (Cód 3) pedir senha de acesso e nome do usuário*, a senha 789
        // (“OK”) senão verifique seu usuário e senha
        // * Utilize o equals

        Scanner teclado = new Scanner(System.in);

        String usuario, senha;

        System.out.println("Digite seu usuário:");
        usuario = teclado.nextLine();

        System.out.println("Digite sua senha:");
        senha = teclado.nextLine();

        System.out.println("Usuário:" + usuario);

        System.out.println("Senha:" + senha);

        if (usuario.equals("gabriel") && senha.equals("123")) {
            System.out.println("Logado com sucesso");

        } else {
            System.out.println("Verifique seu usuário e senha");
        }

    }

}
