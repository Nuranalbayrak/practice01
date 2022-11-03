package odevler_ifstatement;

import java.util.Scanner;

public class Ternaryodev01 {
    public static void main(String[] args) {
        //Soru 1 :kullanıcıdan iki sayı alınız ve buyuk olmayanı yazdırın
        Scanner input=new Scanner(System.in);
//        System.out.println("lütfen iki sayı giriniz");
//        int a=input.nextInt();
//        int b=input.nextInt();
//        int sonuc= a<b ? a:b;
//        System.out.println(sonuc);

        //Soru 2:kullanicidan bir tam sayı alın ve sayının tek mi çift mi oldugunu yazdırın
//        System.out.println("lütfen bir tam sayı giriniz");
//        int sayı=input.nextInt();
//        String sonuc1=(sayı%2==0)? "çift": "tek";
//        System.out.println(sonuc1);

        //SORU 3: kullanıcıdan bir sayı alın ve sayının mutlak degerini yazdırın
//        System.out.println("bir sayı giriniz..");
//        int deger1=input.nextInt();
//        deger1=Math.abs(deger1);
//        System.out.println(deger1);

        //SORU 4: kullanıcıdan bir sayı alın sayı pozitifse "sayı pozitif " yazdırın, negatifse sayının karesini yazdırın
        System.out.println("bir sayı giriniz");
        int s=input.nextInt();
        Object sonuc=s>0 ? "sayı pozitif" : (s*s);
        System.out.println(sonuc);
/*
       Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
       Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb.
       */
        System.out.println(" bir sayı giriniz");
        int ay=input.nextInt();

        String AyIsmi =
                (ay == 1) ? "Ocak" :
                ((ay == 2) ? "Şubat" :
                ((ay== 3) ? "Mart" :
                ((ay == 4) ? "Nisan" :
                ((ay==5) ? "Mayıs" :
                ((ay==6) ? "Haziran" :
                ((ay==7) ? "Temmuz" :
                ((ay==8) ? "Agustos" :
                (ay==9) ? "Eylul" :
                ((ay==10) ? "Ekim" :
                ((ay==11) ? "Kasim" :
                ((ay==12) ? "Aralik" : "Girilen değer geçersizdir(1-12arası değer giriniz)"))))))))));
        System.out.println(AyIsmi);
    //Soru 5: kullanıcıdan bir tam sayi alin ve sayı 10 dan kucukse "Rakam",100 den kucukse "iki basamakli sayi"
    //degilse "uc basamli veya daha buyuk sayi" yazdirin.








    }
}
