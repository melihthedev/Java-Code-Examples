public class Main {
    public static void main(String[] args) {
        // reference types
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager1 = new CustomerManager();
        customerManager = customerManager1;
        customerManager.Add();
        customerManager.Updated();
        customerManager.Removed();

        // value types
        int sayi1 = 10;
        int sayi2= 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        // array is a reference type
        int[] sayilar1 = {1,2,3};
        int[] sayilar2 = {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
    }
}
