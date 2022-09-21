public class Main {
    public static void main(String[] args) {
        double[] mylist = {1.2, 3.4, 6.1, 82.1};

        double toplam = 0;
        double maxNum = mylist[0];
        for (double eleman : mylist) {
            if(eleman > maxNum) maxNum = eleman;
            toplam += eleman;
            System.out.println(eleman);
        }
        System.out.println("Sayıların toplamı : " + toplam);
        System.out.println("Sayıların aritmetik ortalaması: " + (toplam / mylist.length));
        System.out.println("En büyük sayı : " + maxNum);

        // Multidimensional Arrays
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "İzmit";
        sehirler[0][2] = "Tekirdağ";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Antep";
        sehirler[2][1] = "Urfa";
        sehirler[2][2] = "Diyarbakır";

        for(int i = 0; i < sehirler.length; i++) {
            System.out.println("--------");
            for(int j = 0; j < 3; j++) {
                System.out.println(sehirler[i][j]);
            }
        }


    }
}
