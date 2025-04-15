public class Ex14 {
    public static void main(String[] args) {

        // 14)Contar quantos números ímpares existem entre 1 e 50

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Pares: " + i);
            } else {
                System.out.println("Ímpares:" + i);
            }

        }
    }
}