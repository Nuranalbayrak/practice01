package odevler_ifstatement;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        /*
        ekrana 10 defa "java guzeldir " yazdırınız
         */

//        String str="Java guzeldir.";
//        for (int i=0; i<str.length();i++){
//            System.out.println("java guzeldir");
//        }
        /*
        10 ile 30 arasındaki sayilari aralarında virgul kullanarak aynı satırda yazdırınız.
         */

//        for (int i = 10; i < 31; i++) {
//            System.out.print(i + ",");

        /*
        100 den baslayarak 50 ye kadar olan sayiları aralarında virgül kullanarak aynı satırda yazınız
         */
//        System.out.println();
//        for (int i = 100; i > 49; i--) {
//            System.out.print(i + ",");
//        }
//        System.out.println();
        /*
        kullanıcıdan 100 den kucuk bir tam sayı isteyin.1 den baslayarak girilen sayıya kadar 3 ün katı olan sayıları yazdırınız.
         */

        Scanner input = new Scanner(System.in);
//        System.out.println("100 den kucuk bir tam sayı giriniz.");
//        int sayı2 = input.nextInt();

//        if (sayı2>100){
//            System.out.println("hatalı giriş");
//        }else {
//            for (int i=1; i<=sayı2;i++){
//                if (i%3==0 || i%5==0){
//                    System.out.print(i+" ");
//                }
//            }
//        }
//        System.out.println();
        /*
         kullanıcıdan 100 den kucuk bir tam sayı isteyin.1 den baslayarak girilen sayıya kadar yazdırınız.
         ancak;
         1)sayı 3 un katı ise "java"
         2)sayı 5 in katı ise "guzeldir"
         3)sayı hem 3 un katı hem 5 i,n katı ise "java guzeldir"
         */
//        if (sayı2 > 100) {
//            System.out.println("hatalı giriş");
//        } else if (sayı2 < 101) {
//            for (int i = 1; i <= sayı2; i++) {
//                if (sayı2 % 3 == 0 && sayı2 % 5 == 0) {
//                    System.out.println("java guzeldir");
//                } else if (sayı2 % 5 == 0) {
//                    System.out.println("Guzeldir");
//                } else if (sayı2 % 3 == 0) {
//                    System.out.println("Java");
//
//                }
//            }
//        }

        /*
        kullanıcıdan bir strin isteyin ve bunu tersten yazdırın
         */
//        int brr1[][] = {{1, 2, 3}, {4, 5}, {6}};
//
//        int sonuc = 1;
//        for (int[] w : brr1) {
//            for (int m : w) {
//                sonuc = sonuc * brr1[1][2] + brr1[2][1] + brr1[2][0];
//                System.out.println(sonuc);
//            }
//        }
        /*
        kullanıcıdan bir string isteyin ve stringi tersten yazdırın.
         */

//        System.out.println("lutfen bir cumle giriniz");
//        String cumle=input.nextLine();
//        String bos="";
//        for (int i=cumle.length()-1;i>-1;i--){
//            bos=bos+cumle.substring(i,i+1);
//        }            System.out.println(bos);




        /*
        kullanıcıdan bir string isteyin ve kullanıcıdının girdiği stringin palnindrome olup olmadıgını kontrol eden programm yazınız.
         */
//       for (int i=cumle.length()-1;i>-1;i--){
//           String c=cumle.substring(i,i+1);
//           bos=bos+c;
//       }if (cumle.equals(bos)){
//            System.out.println("palindrome");
//        }else System.out.println("palindrome degil");


        /*
        kullanıcıdan iki sayı isteyin. girilen sayılar ve aralarındaki tüm tam sayıları toplayıp,sonucu yazdıran bir program yazınız.
         */

        System.out.println("lutfen iki sayi giriniz");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        int sum=0;
        for (int i=sayi1;i<=sayi2;i++){
         sum=sum+i;
        }
        System.out.println(sum);















        }

    }



