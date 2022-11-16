package calisma01;

public class VariableCalisma01 {
    public static void main(String[] args) {

        int ad=18;//variable
        //integer=32 bit
        //byte=8 bit
        //short=16 bit
        //long=64 bit
        //float=32 bit ==> virgülden sonra 7 basamak var
        //double=64 bit==> virgulden sonra 16 basamak var
        //boolean =1 bit kullanır ==>true or false
        //char=16 bit '' arasına konulmalı
        //Numeric data type==> byte<short<int<long<float<double
        /*
                            Non-Primitive
             String:isim,adres, kimlik numarası gibi bir veya birden fazla karakter iceren değerlerde kullanılır.
             mutlaka cift tırnagın icine alınmalıdır
         */

        long x=456;
        boolean k=true;
        char sembol='5';
        String isim="nuran";

        //Example: herhangi bir 3 ogenin fiyatları icin double data tipinde degiskenler olusturunuz. fiyatların toplamını yazdırın
         double s1=78;
         double s2=12;
         double s3=63;
        System.out.println("toplam fiyat:" + (s1+s2+s3));

        //Example:herhangi bir 3 ögrnin float,long,int data tipinde degislenler olustur ve bu degerlerin carpımını yazdır
        float deger1=12;
        long deger2=1237;
        int deger3=78;
        System.out.println("sayıların carpımı:" + deger1*deger2*deger3);


        //Example: basit faizi bulmak icin kod yazınız:basit faiz=anapara*oran*yılDegeri/100
        int anaPara=10000, oran=6,yilDegeri=3;
        int basitFaiz=(anaPara*oran*yilDegeri)/100;
        System.out.println(basitFaiz);


        //Example: bir string ve iki long tipinde degisken olustur ve bu degerlerin carpımını ve toplamını string ile yazdır.
        String s="sonuc";
        long a=123;
        long b=98745632L;
        System.out.println(s+(a+b));
        System.out.println(s+a*b);







    }

}
