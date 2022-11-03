package calismaVariable01;

import java.util.Scanner;

public class Ternarycalisma01 {
    public static void main(String[] args) {
    int sayı1=-45;
     String sonuc= sayı1>0 ? "pozitif" : "pozitf degil" ;
        System.out.println(sonuc);
     int a =12;
     int b=18;
     int min=  a<b ? a : b;
        System.out.println(min);

     /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        Kullanıcıdan bir ayismi girmesini isteyin.
         a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "İlkbahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Sonbahar"
        e) Diğerleri için "Geçersiz ay adı
     */

       Scanner input=new Scanner(System.in);
       System.out.println("lütfen gecerli bir ay ismi giriniz..");
       String mevsim=input.next();
       String sonuc1=mevsim.equals("aralik") || mevsim.equals("ocak") || mevsim.equals("subat") ? "kıs":
               mevsim.equals("mart") || mevsim.equals("nisan") || mevsim.equals("mayis") ? "ilkbahar":
               mevsim.equals("haziran") || mevsim.equals("temmuz") || mevsim.equals("agustos") ? "yaz":
               mevsim.equals("eylul") || mevsim.equals("ekim") || mevsim.equals("kasım") ? "sonbahar":
               "gecersiz";




















    }
}
