public class Main {
    public static void main(String[] args) {
        /*
        TarimKrediManager tarimKrediManager = new TarimKrediManager();
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        tarimKrediManager.Hesapla();
        ogretmenKrediManager.Hesapla();
        */

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}
