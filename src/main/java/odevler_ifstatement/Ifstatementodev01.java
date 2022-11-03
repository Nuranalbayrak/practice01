package odevler_ifstatement;

import java.util.Scanner;

public class Ifstatementodev01 {
    public static void main(String[] args) {
                                            //IF STATEMENT SORULARI

        //soru 1 : kullanıcıdan bir tam sayı isteyin ve sayının tek veya cift oldugunu yazdırın

//        System.out.println("lütfen bir tam sayı giriniz");
//        int s=input.nextInt();
//        if (s%2==0){
//            System.out.println("çift sayı");
//        }else {
//            System.out.println("tek sayı");
//        }


        //SORU 2: kullanıcıdan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdırın
        Scanner input = new Scanner(System.in);
//        System.out.println("lütfen bir gun isminin ilk harfini soyleyin");
//        String harf=input.next();
//        if (harf.equalsIgnoreCase("p")){
//            System.out.println("pazar\npazartesi\npersembe\n ");
//        } else if (harf.equalsIgnoreCase("s")) {
//            System.out.println("salı");
//
//        } else if (harf.equalsIgnoreCase("c")) {
//            System.out.println("carsamba\ncuma\ncumartesi");
//
//        }else{
//            System.out.println("lütfen gecerli bir gun ismi ilk harfi giriniz. P,S,C");
//        }


        //Soru 3: kullanıcıdan gun ismini alın ve haftaici veya hafta sonu oldugunu yazdırın
//        Scanner input=new Scanner(System.in);
//        System.out.println("lütfen bir gun ismi giriniz");
//        String gun1=input.next();
//        if (gun1.equalsIgnoreCase("pazar") || gun1.equalsIgnoreCase("cumartesi")){
//            System.out.println("haftasonu");
//        } else if (gun1.equalsIgnoreCase("pazartesi") || gun1.equalsIgnoreCase("salı") ||
//                gun1.equalsIgnoreCase("carsamba") || gun1.equalsIgnoreCase("persembe") ||
//        gun1.equalsIgnoreCase("cuma")) {
//            System.out.println("haftasnu");

        }

        //SORU 4 : kullanıcıdan dikdortgenın kenar uzunluklarını isteyin ve dikdörtgenin kare olup olmadıgını yazdırın.
//        Scanner input=new Scanner(System.in);
//        System.out.println("lütfen dikdörtgenin kenarlarını giriniz");
//        double kenar1=input.nextInt();
//        double kenar2=input.nextInt();
//
//        if (kenar1==kenar2){
//            System.out.println("kare");
//        }else{
//            System.out.println("dikdörtgen");
//        }

        //SORU 5 :kullacidan bir gün alın eger gun "cuma "ise ekrana "muslumanlar icin kutsal gun "yazdırın.
        //eger gun "cumartesı" ise "ekrana yahudiler icin kutsal gun" yazdırım
        //eger gun "pazar" ise "ekrana hristiyanlar icin kutsal gun yazdırın

//        Scanner input=new Scanner(System.in);
//        System.out.println("lütfen bir gun ismi giriniz....");
//        String gun=input.next();
//
//        if (gun.equalsIgnoreCase("cuma")){
//            System.out.println("muslumanlar icin kutsal gun");
//        } else if (gun.equalsIgnoreCase("cumartesi")) {
//            System.out.println("yahudiler icin kutsal gun ");
//        } else if (gun.equalsIgnoreCase("pazar")) {
//            System.out.println("hristiyanlar icin kutsal gun");
//        }else{
//            System.out.println("lutfen gecerli bir gun ismi giriniz...");
//        }
                                            //İF ELSE STATEMENT SORULARI
        //SORU1 :kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin ve kare olup olmadıgını yazdırın
//        System.out.println("lütfen dikdörtgenin kenar uzunluklarını giriniz....");
//        int kenara=input.nextInt();
//        int kenarb=input.nextInt();
//        if (kenara==kenarb){
//            System.out.println("kare");
//        }else {
//            System.out.println("dikdörtgen");
//        }
        //SORU 2: kullanıcıdan bir karakter girmesini isteyin ve karakterin harf olup olmadıgını yazdırın.
//        System.out.println("lütfen bir karakter giriniz..");
//        char karakter=input.next().charAt(0);
//        if (karakter>='a' && karakter<='z' || karakter>='A' && karakter<='Z'){
//            System.out.println("harf");
//        }else{
//            System.out.println("harf değil");
//        }

        //SORU 3:kullanıcıdan yasını sorun, eger yas 65'den kucukse "emekli olamazsın; eger yası 65 e esit veya buyukse "emekli olabilirsin yazdır.
//        System.out.println("lütfen yasınızı giriniz");
//        byte yas=input.nextByte();
//        if (yas<65){
//            System.out.println("emekli olamazsın");
//        }else {
//            System.out.println("emekli olabilirsin");
//        }

        //SORU 4: Kullanıcıdan bir ucgenin kenar uzunluklarınu isteyin eger uc kenarda birbirine eşitse "eskenar" diger durumlarda degil yazdır.
//        System.out.println("lütfen ucgenin kenarlarını giriniz");
//        double kenar1=input.nextDouble();
//        double kenar2=input.nextDouble();
//        double kenar3=input.nextDouble();
//        if (kenar1==kenar2 && kenar2==kenar3){
//            System.out.println("eskenar ucgen");
//
//        }else {
//            System.out.println("eskenar degil");
//        }

                                                //IF ELSE IF STATEMENT SORULARI
        //SORU 5: kullanicidan gun ismini yazmasını isteyin. girilen isim gecerli bir gun ise gun isminin 1.,2.,3. harflerini ilk harf buyuk
        //diger ikisi kucuk olarak yazdırın. gun ismi gecerli degilse "gecerli gun yazın" yazdır

//        System.out.println("Lütfen bir gün ismi giriniz");
//        String gUn = input.nextLine();
//        String kücükGun = gUn.toLowerCase();
//        if (    kücükGun.equals("pazar")||
//                kücükGun.equals("pazartesi")||
//                kücükGun.equals("salı")||
//                kücükGun.equals("çarşamba")||
//                kücükGun.equals("perşembe")||
//                kücükGun.equals("cuma")||
//                kücükGun.equals("cumartesi")){
//            System.out.println(kücükGun.substring(0,3).toUpperCase()+kücükGun.substring(3).toLowerCase());}
//        else {
//            System.out.println("Geçerli bir gün adı giriniz");}




        //SORU 6:Kullanıcıdan iki sayı isteyin sayıların ikiside pozitifse sayıların toplamını,sayıların ikiside negatifse sayıların carpımını
        //farklı isaretli ise islem yapamam yazdır
//        System.out.println("lütfen iki sayı giriniz..");
//        int sayı1=input.nextInt();
//        int sayı2=input.nextInt();
//        if (sayı1>0 && sayı2>0){
//            System.out.println(sayı1+sayı2);
//        } else if (sayı1<0 && sayı2<0) {
//            System.out.println(sayı1*sayı2);
//
//        } else if (sayı1==0 || sayı2==0) {
//            System.out.println("sıfır yutan eleman");
//
//        }else {
//            System.out.println("islem yapamam");
//        }

        //SORU 7:kullanicidan 100 üzerinden notunu isteyin. Notu harf sistemine cevirip yazdırın.
        //50 den kucukse "D",50-60 arasi ise "C" 60-80 arası "B" 80 üzeri ise "A" yazdırın.
//        System.out.println("lütfen notunuzu yazınız");
//        int not=input.nextInt();
//        if (not<50){
//            System.out.println("D");
//        } else if (50<=not && not<=60) {
//            System.out.println("C");
//
//        } else if (60 < not && not<=80) {
//            System.out.println("B");
//
//        }else if (not>80){
//            System.out.println("A");
//        }


        //SORU 8: Kullanıcıdan maas icin bir teklif isteyin ve asagıdaki degerlere göre yazdirin
        //teklif 80,000 uzerinde ise "kabul ediyorum
        //teklif 60-80,000 arası ise "konusabiliriz
        //teklif 60,000 altında ise "maalesef kabul edemem.
//        System.out.println("lütfen maas teklifinizi giriniz");
//        int teklif=input.nextInt();
//        if (teklif<60000){
//            System.out.println("kabul edemem");
//        } else if (teklif>=60000 && teklif<80000) {
//            System.out.println("konusabiliriz");
//
//        }else {
//            System.out.println("kabul ediyorum");
//        }

        //SORU 9: kullanıcıdan sifre girmesini isteyin. eger ilk harf buyuk ise 'A' olup olmadıgını kontrol edin. dogruysa gecerli,yanlıssa gecersiz yazdırın
        //eger ilk harf kucukse "z" olup olmadıgını kontrol edin. dogruysa gecerli yanlıssa gecersiz yazdırın
//        String sifre="a12345";
//        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z') {
//            if (sifre.charAt(0)=='A'){
//                System.out.println("gecerli parola");
//            }else{
//                System.out.println("gecersiz paralo");
//            }
//
//        } else if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z') {
//            if (sifre.charAt(0)=='z'){
//                System.out.println("gecerli sifre");
//            }else{
//                System.out.println("gecersiz sifre");
//            }
//
//        }

        //SORU 10: kullanıcıdan 4 basamaklı bir sayı girmesini isteyin. girdiği sayı 5'e bölünüyorsa son rakamını kontrol edin.
        //son rakamı 0 ise ekrana "5 e bölünen çift sayı"yazdırın. son rakamı 0 degilse "5'e bölünen tek sayı yazdırın. girdigi password 5 e bölünmuyorsa "tekrar deneyin yzdırın"

//        System.out.println("lütfen sifre giriniz");
//        int s=input.nextInt();
//        if (s%5==0){
//            if (s%10==0){
//                System.out.println("5 e bölünen çift sayı ");
//            }else{
//                System.out.println("5 e bölünen tek sayı");
//            }
//
//        }else{
//            System.out.println("tekrar dene");
//}
       //Soru 11:
//        int y=20;
//        int z=1;
//        int a=y<10 ? y++ :z++;
//        System.out.println(y+","+z+","+a);

                //İNTERVİEW SORULARI
        //SORU 12:kullanicidan artık yıl olup olmadıgını kontrol etmek icin yil girmesini isteyin
        /*
        1)4 ile bölünemeyen sayilar artık yıl değildir
        2)4 ile bölünüp 100 ile bölünemeyen sayılar artık yıldır
        3)4'ün katı olmasına rağmen 100 ile bölümebilen yıllardan sadece 400'ün katı olanlar artık yıldır.
         */
        //1. Yol:
//        System.out.println("lütfen bir yıl giriniz.");
//        int artikYil=input.nextInt();
//        String artikYil1=artikYil%100==0 ?(artikYil%400==0 ? "artık yıl" :
//                "artık yıl degil" ):
//           (artikYil%4==0 ? "artık yıl" : "artık yıl degil");
//        System.out.println(artikYil1);
//    //2. Yol:
//        System.out.println("bir yıl giriniz");
//        int yıl1=input.nextInt();
//        if (yıl1%100==0) {
//            if (yıl1 % 400 == 0) {
//                System.out.println("artık yıl");
//            } else {
//                System.out.println("artık yıl degil");
//            }
//        }else if (yıl1%100!=0) {
//            if (yıl1%4==0) {
//                System.out.println("artık yıl");
//            }else {
//                System.out.println("artık yıl degil");
//            }
//
//        }


    }

