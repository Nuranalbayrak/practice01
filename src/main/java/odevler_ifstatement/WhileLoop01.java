package odevler_ifstatement;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        /*
        3 ten 13 e kadar tum tek tamsayilari ekrana yazdiriniz.
         */
//        int i=3;
//        String bos=" ";
//         while (i<14){
//             if (i%2!=0){
//                 bos=bos+i+" ";
//
//             }
//             i++;
//         }   System.out.print(bos);
        /*
        for loop ve while loop kullanarak 3 b asamakli sayilardan 15,20,90 a tam bolunebilen sayulari yazdirin.
        */
//        int i=100;
//        String num="";
//        while (i<1000){
//            if ((i%15==0  && i%20==0) && (i%15==0 && i%90==0)){
//                num=num+i+" ";
//            }i++;
//        }
//        System.out.println(num);


        /*
        kullanicidan bir sayi alin ve bvu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekrana yazdirin.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi=input.nextInt();
//        int counter=0;
//        String c="";
//        for (int i=1;i<=sayi;i++){
//            if (sayi%i==0){
//                c=c+i+ " ";
//                counter++;
//            }
//        }
//        System.out.println(sayi+ " sayisinin " + " " +counter + " tane boleni vardir.");
//        System.out.println("bu bolenler :" + c );

        /*
        kullanicidan bir tam sayi alin ve bu sayinin rakamlari toplamini yaziniz
         */

        int sonuc=0;
        for (int i=sayi ;i>0;i=i/10){
            sonuc=sonuc+i%10;
        }
        System.out.println(sonuc);

























    }
}
