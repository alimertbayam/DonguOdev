import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        int toplam = 0;
        int sayac = 0;
        for(int i = 0; i <= sayi; i++)
        {
            if((i % 3 == 0) && (i % 4 == 0))
            {
                toplam = toplam + i;
                sayac++;
            }
        }
        double ort = (double) toplam / sayac;
        System.out.println("Ortalama: " + ort);
    }

}