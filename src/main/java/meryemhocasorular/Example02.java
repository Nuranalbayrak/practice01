package meryemhocasorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example02 {

        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */

    static List<String > listem=new ArrayList<>(Arrays.asList("patates-urun kodu :1","sogan-urun kodu :2","limon-urun kodu :3","elma-urun kodu :4","kayisi- urun kodu :5",
            "maydanoz-urun kodu:6","domates-urun kodu:7"));

    static List<Double> urunfiyatlarti=new ArrayList<>(Arrays.asList(2.0,3.0,2.5,4.5,1.5,0.75,2.75));
     static double toplamfiyat=0;
     static Scanner input=new Scanner(System.in);

     public static void  musterisecimi(){
         System.out.println("lutfen almak istediginiz urunun kodunu giriniz");
         int urunsecimi=input.nextInt();
         if (urunsecimi>8){
             System.out.println("hatali giris yaptiniz");

         }else System.out.println("****urun miktari secimi icin yonlendiriliyorsunuz****");
         System.out.println("sectiginiz urunden kac kilo almak istediginizi giriniz");
         double kilo=input.nextDouble();
         double uruntutar=urunfiyatlarti.get(urunsecimi-1);
         double toplamodenecekfiyat=uruntutar*kilo;
         toplamfiyat+=toplamodenecekfiyat;
         System.out.println("devam etmek icin 1'i,kasa'ya gecmek icin 2'yi tuslayiniz");
         int karar=input.nextInt();
         if (karar==1){
             musterisecimi();
         }else if (karar==2){
             kasa();
         }
     }
     public static void kasa(){
        System.out.println("toplam odenecek tutar:"+toplamfiyat+"\t tesekkur ederiz.");
    }

    public static void main(String[] args) {
        System.out.println(listem);
        musterisecimi();
    }









    }



