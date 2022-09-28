public class Main {
    public static void main(String[] args) {
        int toplam = topla(2,5,54,62,2,13);
        System.out.println(toplam);
    }
    public static int topla(int... sayilar ){ // takes unknown amount of params like an array
        int toplam = 0;
        for(int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}
