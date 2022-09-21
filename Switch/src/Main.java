public class Main {
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Üstün Başarı");
                break;
            case 'B':
                System.out.println("Başarılı");
                break;
            case 'C':
                System.out.println("Orda düzey");
                break;
            case 'D':
                System.out.println("Şartlı Geçti");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Bilgisi");
        }
    }
}
