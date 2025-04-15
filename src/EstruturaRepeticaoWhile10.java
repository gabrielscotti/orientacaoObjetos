public class EstruturaRepeticaoWhile10 {

    public static void main(String[] args) {

        // Exercício 4

        int a = 90000;
        int b = 200000;

        int cont = 0;

        while (a < b) {

            a += (a / 100) * 3;
            b += (b / 100) * 1.5;

            cont++;

        }
        System.out.println("A " + a);
        System.out.println("B " + b);
        System.out.println("Total " + cont);
    }

}
