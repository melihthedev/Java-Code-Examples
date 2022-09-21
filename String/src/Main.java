public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava biraz kapalı";

        // Bosluga gore kelimeleri bolme
        String[] mesajlar = mesaj.split(" ");
        for(String m : mesajlar) {
            System.out.println(m);
        }

        System.out.println("Karakter Sayısı: " + mesaj.length()); // uzunlugu

        System.out.println("5. Eleman: " + mesaj.charAt(4)); //indexteki harf

        System.out.println(mesaj.concat(". Yağmur yağabilir")); // metin ekleme

        System.out.println(mesaj.startsWith("Bugün"));
        System.out.println(mesaj.endsWith("kapalı"));

        char[] karakterler = new char[5];
        mesaj.getChars(0,5, karakterler, 0);
        for(char karakter : karakterler) {
            System.out.println(karakter);
        }

        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("a"));

    }
}
