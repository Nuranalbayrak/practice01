package odevler_ifstatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        /*
         Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
        Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
         */

//        int[] a = new int[]{12, 5, 8, 89, 56};
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
//
//        if (a.length % 2 != 0) {
//            int ortadaki = a.length / 2;
//            System.out.println(ortadaki);//indeksi hesapladim
//            System.out.println(a[ortadaki]);//o indeksteki sayiyi hesapladim
//        } else {
//            int ortadaki = a.length / 2;
//            int orta = (a[ortadaki] + a[ortadaki - 1]) / 2;
//            System.out.println(orta);
//        }
        /*
             String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
            Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
        */
        String b[] = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int minLenght = b[0].length();

        for (String w : b) {
            minLenght = Math.min(minLenght, w.length());
        }
        for (String w : b) {
            if (minLenght == w.length()) {
                System.out.println(w);
            }

        }
    /*
        Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        bulunuz.
        Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
     */

        int[]a =new int[]{-12,18,-5,23,-2};
        Arrays.sort(a);
        int minPozitive=a[a.length-1];
        int maxNegative=a[0];
        for (int w:a) {
            if (w>=0){
                minPozitive=Math.min(minPozitive,w);
            }if (w<0){
                maxNegative=Math.max(maxNegative,w);
            }
        }

        System.out.println("maxNegative = " + maxNegative);//-2
        System.out.println("maxpozitive=" + minPozitive);//18


        /*
         String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        alınız.

        Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM
         */

//        String[] adlar=new String[]{"Kemal","Jonathan","Mark","Jackson","Ali"};
//        String bos="";
//        for (String w:adlar) {
//         if (w.endsWith("n")|| (w.endsWith("k"))){
//             bos=bos+w.substring(0,1);
//         }
//
//        }
//        System.out.println(bos);

        /*
             String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.

        Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
//         */
//        String isim[]=new String[]{"Kemal","Jonathan","Mark","Angie","Veli"};
//        int sum=0;
//        for (String  w:isim) {
//            sum+=w.length();
//        }
//        System.out.println(sum);

        /*
        Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.
        */
//        String cumle = "Apex is an object oriented programming language";
//        String []parca= cumle.split(" ");
//        int counter=0;
//        for (String w:parca) {
//           if (w.startsWith("a") || (w.startsWith("A"))){
//               counter++;
//           }
//        }
//        System.out.println(counter);

        /*
         Verilen bir String'deki sesli harf sayısını bulunuz.
         */

//        String s = "Apex is an object oriented programming language";
//        String c[] = s.toLowerCase().split("");
//        int count = 0;
//        for (String w : c) {
//            switch (w) {
//                case "a":
//                case "e":
//                case "i":
//                case "o":
//                case "u":
//                    count++;
//            }
//        }
//        System.out.println(count);

        /*
         İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
         */

//        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
//
//        int size=arr.length;
//
//        for (int i=0;i<size;i++){
//            String firstChar=arr[i].substring(0,1);
//            String lastChar=arr[i].substring(arr[i].length()-1);
//            if (firstChar.equals(lastChar)){
//                System.out.println(arr[i]);
//            }
//        }

        /*
        Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.
         */
//        String[] brr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
//        String obje = "nur";
//        int co = 0;
//        for (String w : brr) {
//            if (w.equalsIgnoreCase(obje)) {
//                co++;
//            }
//
//        }
//
//        if (co > 0) {
//            System.out.println(obje + " arrayde vardir");
//        } else {
//            System.out.println(obje + " arrayde yoktur");
//
//        }



        /*
        Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız
         */

//        String yeni[]=new String[]{"alabama", "pick", "sos", "sets", "pex"};
//        int topla=0;
//        for (String w:yeni) {
//            topla+=w.length();
//        }
//        System.out.println(topla);

        /*
        Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
           Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
         */

//        Integer[] num=new Integer[]{1,8,5,0,2,0,3};
//
//        Integer[] brr = new Integer[num.length];
//
//        int firstindex=0;
//        int lastindex=num.length-1;
//
//        for (int i = 0; i < num.length;    i++) {
//            if (num[i]!=0){
//                brr[firstindex]=num[i];
//                firstindex++;
//
//            }else {
//                brr[lastindex]=0;
//                lastindex--;
//            }
//        }
//        System.out.println(Arrays.toString(brr));


        /*
        Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        büyük öğeler arasındaki farkı konsolda yazdırınız.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Array uzunlugunu giriniz : ");
        int len = input.nextInt();


        int arr[] = new int[len];

        System.out.println("Girilen array elemanlari : " + len);
        for(int i=0; i<len; i++) {
            arr[i] = input.nextInt();//array elemanlarini tek tek kullanicidan alip yerlestiriyor.

        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        int diffOfBigAndSmall = arr[arr.length-1] - arr[0];
        System.out.println("En buyuk ve en kucuk oge arasındaki fark : " + diffOfBigAndSmall);

        /*
        Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
        konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.

        Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.
        */

//        System.out.println("iki String giriniz :");
//        String s1 = scan.nextLine();
//        String s2 = scan.nextLine();
//
//        String a1[] = s1.toLowerCase().split("");
//        Arrays.sort(a1);
//        System.out.println(Arrays.toString(a1));
//
//        String a2[] = s2.toLowerCase().split("");
//        Arrays.sort(a2);
//        System.out.println(Arrays.toString(a2));
//
//        if (s1.length() != s2.length()) {
//            System.out.println("Anagram Degil");
//        } else if (s1.isEmpty() || s2.isEmpty()) {
//            System.out.println("Anagram Degil");
//        } else if (Arrays.equals(a1, a2)) {
//            System.out.println("Anagramdir");
//        } else {
//            System.out.println("Anagram Degil");

        }


    }










