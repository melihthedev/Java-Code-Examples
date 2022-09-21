
public class Main {
    public static void main(String[] args) {
        // For Loop
        for(int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        for(int i = 1; i <= 20; i+=2) {
            System.out.println("Tek Sayı: " + i);
        }

        String[] arabalar = {"BMW", "Audi", "Mercedes", "Porsche"};

        for(String araba : arabalar) {
            System.out.println(araba);
        }

        // While Loop
        int sayi = 1;
        while(sayi <= 10) {
            System.out.println("While: " + sayi);
            sayi++;
        }

        // Do While Loop
        int i = 1;
        do {
            System.out.println(i);
            i+=2;
        } while (i < 10);
    }
}
