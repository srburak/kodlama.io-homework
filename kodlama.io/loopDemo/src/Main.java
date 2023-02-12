public class Main {
    public static void main(String[] args) {
// For
        System.out.println("For");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }

        System.out.println("Döngü Bitti...");

        // Tek Say�lar
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("Döngü Bitti...");

        // 1 ile 10 aras�ndaki �ift Say�lar
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("Döngü Bitti...");

        System.out.println("************");
        System.out.println();

        // While
        System.out.println("While");
        // int i = 1;

        /*
         * while (i < 10) { System.out.println(i); i++; }
         *
         *
         * System.out.println("Tek Say�lar"); while (i < 10) { System.out.println(i);
         * i+= 2; }
         *
         */

        int i = 2;
        System.out.println("Çift Sayılar");

        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while döngüsü bitti");

        System.out.println("************");
        System.out.println();

        // Do While
        System.out.println("Do While döngüsü");
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do While döngüsü Bitti");
    }
    }
