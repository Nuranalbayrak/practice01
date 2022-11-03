package calismaVariable01;

import java.util.Scanner;

public class StringManipulationcalisma01 {
    public static void main(String[] args) {
        //Ask userName, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
//(Check credit card number, if there aren't 16 digit print "Invalid credit card number"
//Input :
//John White 1234234534561478
//Output :
//Name : J*** W****
//CCN  : **** **** **** 1478
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz");
        String isim = input.nextLine();

        System.out.println("soyisminizi giriniz");
        String soyisim = input.nextLine();

        System.out.println("Kredi Karti Numaranizi giriniz");
        String Kkn = input.nextLine();

        String sonuc1 = isim.substring(0, 1) + isim.substring(1).replaceAll("\\w", "*");
        String sonuc2 = soyisim.substring(0, 1) + soyisim.substring(1).replaceAll("\\w", "*");

        String sonucKkn = Kkn.substring(0,11).replaceAll("\\w", "*")+" "+ Kkn.substring(Kkn.length()-4);
        System.out.println(sonuc1+" "+sonuc2);
        System.out.println(sonucKkn);//123412341234  1234


    }
}
