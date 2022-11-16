package calisma01;

import java.util.Scanner;

public class Scannercalisma01 {

    public static void main(String[] args) {
        //Example: iki tam sayıyı degistirmek icin kod yaz
       /*
        Scanner input=new Scanner(System.in);
       System.out.println("iki sayi giriniz");
        double n1=input.nextDouble();
        double n2= input.nextDouble();
        System.out.println("degistirmeden once:" + n1+ " - "+n2);
        */
        //Example sayiları kullanıcıdan alan ve toplama yapan kodu yazınız.
       /* Scanner input=new Scanner(System.in);
        System.out.println("bana iki sayı söyleyiniz..");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        System.out.println("sayiların toplamı:" + (sayi2+sayi1));
        */
        //Example: kullanıcıdan bir ücgenin kenarlarını ve yükseliğini alıp alanı hesaplayan kodu yazınız
       /*
       Scanner input=new Scanner(System.in);
       System.out.println("ücgenin kenarını yazınız");
        int kenar1=input.nextInt();
        System.out.println("ucgenin yükseklgini giriniz");
        int yukseklik=input.nextInt();
        System.out.println("ucgenin alanı:" + (kenar1*yukseklik)/2);+

        */


        //Example kullanıcıdan ismini soy ismini ve kimlik numarasını alan kod yazın

       /*
        Scanner input=new Scanner(System.in);
        System.out.println("isminizi giriniz...");
        String isim=input.next();
        System.out.println("soysiminizi giriniz...");
        String soyIsim=input.next();
        System.out.println("kimlk numaranızı giriniz...");
        String kimlikNo=input.next();
        System.out.println(isim+ " " + soyIsim);
        System.out.println(kimlikNo);

        */
        //Example: kullanıcıdan yasadıgı sehri, sehrin plakasını ve posta kodunu alınız

    //Scanner input=new Scanner(System.in);
//        System.out.println("yasadıgınız sehri giriniz...");
//        String sehir=input.next();
//        System.out.println("sehrin plasını giriniz..");
//        String plaka = input.next();
//        System.out.println("posta kodunu giriniz..");
//        String postaKodu=input.next();
//        System.out.print(sehir+ " "+ " " + plaka+ " "+ postaKodu);

        // kullanıcıdan isim soy ismini al ve ikinci harflerini yazdır.
//                    Scanner input=new Scanner(System.in);
//                    System.out.println("isminizi giriniz..");
//                    char ilk=input.next().charAt(1);
//                    System.out.println("soy siminizi yazınız");
//                    char soy=input.next().charAt(1);
//                    System.out.println("" + ilk +soy);

       // Scanner input=new Scanner(System.in);
//                    System.out.println("isminizi giriniz..");
//                    char ilk=input.next().charAt(1);
//                    System.out.println("soy siminizi yazınız");
//                    char soy=input.next().charAt(1);
//                    System.out.println("" + ilk +soy);



//        Scanner input=new Scanner(System.in);
//        System.out.println("ismini yaz");
//        char ilkharf=input.next().charAt(2);
//        System.out.println("soyisminiz yaz");
//        char soyIsim=input.next().charAt(4);
//        System.out.println(" "+ilkharf+soyIsim);

//       Scanner input=new Scanner(System.in);
//       System.out.println("Tam isminizi giriniz...");
//
//        String tamIsim = input.nextLine();// Ali Can
//
//        char ilkHarf = tamIsim.charAt(0);
//        System.out.print(ilkHarf);
//
//        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
//        System.out.println(soyIsminIlkHarfi);

      Scanner input=new Scanner(System.in);
        System.out.println("İSİM VE SOY İSMİNİZİ GİRİNİZ");
        String tamIsim=input.nextLine();
       char ilHarf=tamIsim.charAt(0);
        System.out.print(ilHarf);

       char soyisminilkharfi=tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyisminilkharfi);













    }

}



