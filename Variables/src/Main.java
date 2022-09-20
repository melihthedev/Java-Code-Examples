public class Main {
    public static void main(String[] args) {
        int ogrenciSayim = 5;
        ogrenciSayim++;
        ogrenciSayim += 4;
        String mesaj = "Öğrenci Sayısı : ";

        System.out.println(mesaj + ogrenciSayim);

        ogrenciSayim-= 2;
        System.out.println(mesaj + ogrenciSayim);
    }
}
