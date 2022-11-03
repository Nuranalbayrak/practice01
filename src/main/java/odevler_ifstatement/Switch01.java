package odevler_ifstatement;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Example 1:Kullanicidan bir gün no alarak günü yazdırın
        Scanner sc = new Scanner(System.in);
//        System.out.println("Bir gün numarası giriniz");
//        int n = sc.nextInt();
//        switch (n) {
//            case 1:
//                System.out.println("Pazartesi");
//                break;
//            case 2:
//                System.out.println("Salı");
//                break;
//            case 3:
//                System.out.println("Çarsamba");
//                break;
//            case 4:
//                System.out.println("Perşembe");
//                break;
//            case 5:
//                System.out.println("Cuma");
//                break;
//            case 6:
//                System.out.println("Cumartesi");
//                break;
//            case 7:
//                System.out.println("Pazar");
//                break;
//            default:
//                System.out.println("Gecersiz gün no");
//                break;
//        }
//           //Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin
//        System.out.println("kacıncı ayda oldugunuzu yazınız");
//        int ayIsmi=sc.nextInt();
//        switch (ayIsmi) {
//            case 1:
//                System.out.println("Ocak");
//                break;
//            case 2:
//                System.out.println("Subat");
//                break;
//            case 3:
//                System.out.println("Mart");
//                break;
//            case 4:
//                System.out.println("Nisan");
//                break;
//            case 5:
//                System.out.println("Mayıs");
//                break;
//            case 6:
//                System.out.println("Haziran");
//            break;
//            case 7:
//                System.out.println("Temmuz");
//            case 8:
//                System.out.println("Agustos");
//                break;
//            case 9:
//                System.out.println("Eylül");
//                break;
//            case 10:
//                System.out.println("Ekim");
//            break;
//            case 11:
//                System.out.println("Kasım");
//                break;
//            case 12:
//                System.out.println("Aralik");
//                break;
//            default:
//                System.out.println("Gecersiz ay no");
//        }
//
//        //Kullanicidan bir sayi girmesini isteyin girilen sayi
//        //10 ise "iki basamakli en kucuk sayı"
//        //100 ise "üc basamakli en kucuk sayı"
//        //1000 ise "dört basamakli en kucuk sayi"
//        //diger durumlarda "girdigin sayiyi degiştir " yazdirin
//        System.out.println("Bir sayi giriniz");
//        int sayi1=sc.nextInt();
//        switch (sayi1) {
//            case 10:
//                System.out.println("iki basamakli en kucuk sayi");
//                break;
//            case 100:
//                System.out.println("uc basamakli en kucuk sayı");
//            break;
//            case 1000:
//                System.out.println("dört basamakli en kucuk sayı");
//                break;
//            default:
//                System.out.println("Girdiğin sayiyi değiştir");

            System.out.println("SDET kelimesinin harflerinden birini giriniz...");
            String harf=sc.next().toUpperCase();
            switch ( harf) {
                case "S" :
                    System.out.println("Software");
                    break;
                case "D":
                    System.out.println("Developer");
                    break;
                case "E":
                    System.out.println("Engineer");
                    break;
                case "T":
                    System.out.println("In Testing");
                    break;
                default:
                System.out.println("lütfen gecerli bir haf giriniz...");
            }











}
}