package odevler_ifstatement;

import java.util.Scanner;
import java.util.SortedMap;

public class Loop01 {
    public static void main(String[] args) {
        //Example 1: 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.

     // 1. yol
//        for (int i=120; i>10;i--){
//            if (i%4==0 && i%6==0){
//                System.out.print(i+ " ");;
//            }
//        }
        //2. way:
//        String s="";
//        int i=120;
//        while (i>10){
//            if ((i%4==0 && i%6==0)){
//                s=s+i+" ";
//           }
//            i--;
//        }
//        System.out.println(s);
        //3. way:
//        int i = 120;
//        String s = "";
//        do {
//            if (i % 4 == 0 && i % 6 == 0) {
//                s = s + i + " ";
//            }
//            i--;
//        } while (i > 10);
//        System.out.println(s);

        //Example 2: Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ==> ces
//        String s="accessories";
//        String b="";
//        for (int i=0 ;i<s.length() ;i++) {
//            String d = s.substring(i, i + 1);
//            if (s.indexOf(d) != s.lastIndexOf(d)){;
//                if (!b.contains(d)){;
//            b = b + d;
//        }}}
//        System.out.println(b)

        // 2.  way
        //Bir String’de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces
//        String s = "accessories";
//        String b = "";
//        int i = 0;
//        while (i < s.length()) {
//            String c = s.substring(i,i+1);
//            if (s.indexOf(c) != s.lastIndexOf(c)) {
//                if (!b.contains(c)) {
//                    b=b+c;
//
//                }
//            }
//            i++;
//
//        }
//  System.out.println(b);

    // Example 3: Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
    //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
//        Scanner input=new Scanner(System.in);
//        System.out.println("lütfen isim giriniz");
//        String isim=input.nextLine();
//        String r = "";
//        for(int i=isim.length()-1; i>-1; i--) {
//            String c = isim.substring(i, i + 1);
//            r = r + c;
//        }
//        if(isim.equals(r)){
//            System.out.println(isim + " palindromdur");
//        }else{
//            System.out.println(isim + " palindrom degildir");
//
//        }
        // 2. way

//        String p="run";
//        String b="";
//        int i=p.length()-1;
//        while (i>-1){
//            String  c=p.substring(i,i+1);
//            b=b+c;
//            i--;
//
//        }
//        if (p.equals(b)){
//            System.out.println("panlindrom");
//        }else System.out.println("degildir");
//        System.out.println(b);

    //Example 3:  Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //Örnek; 223878 ´ 37
//        int num=223878; //tekrarlı mı diye bakabilmemiz için stringe cevirmeliyiz.
//        String s=String.valueOf(num);
//        String n="";
//        for (int i=0;i<s.length();i++){
//            String f=s.substring(i,i+1);
//            if (s.indexOf(f)!=s.lastIndexOf(f)){
//                n=n+f;
//            }
//        }
//        System.out.println(n);

    //Example 5: Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        // A A A A A
        // A A A A A
        // A A A A A

//        for (int i=1;i<4; i++){
//            for(int k=1;k<6;k++){
//                System.out.print("A");
//            }
//            System.out.println();
//        }
    //Example 6:Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        // A
        // A A
        // A A A
        // A A A A
//        for (int i=1;i<5;i++){
//            for (int k=1;k<=i;k++){
//                System.out.print("A"+" ");
//            }
//            System.out.println();
//        }
        //Example 7:Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        // 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
//        int s=4;
//        for (int i=1;i<11;i++){
//            System.out.println(s+"*"+i+"="+ s*i);
//        }
        //Example 8: 20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
        //bırakarak yazdırmak için gereken kodu yazınız.

//        for (int i=20;i>2;i--){
//            if (i%2!=0){
//                System.out.println(i);
//
//            }
//        }

        //Example 9:String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        // Örneğin; 'Ali Can?' ==> l*i*a*n*
//        String n="Ali Can";
//        n=n.replaceAll("[^a-z]","");
//        String b="";
//        int i=0;
//        do {
//            String c=n.substring(i,i+1);
//            b=b+c+"*";
//            i++;
//        }while (i<n.length());
//        System.out.println(b);


        //Example 10: Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        //işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 75.4238 ´ *4*2*3*8
//        double a=75.4238;
//        String c=String.valueOf(a);
//       String decimalPart=c.split("\\.")[1];
//        String b="";
//        for (int i=0;i<decimalPart.length();i++){
//            String f=decimalPart.substring(i,i+1);
//            b=b+"*"+f;
//        }
//        System.out.println(b);

        //Example 11:Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
//        String isim="Mark";
//        String c="";
//        for (int i=isim.length()-1; i>-1;i--){
//          String k=isim.substring(i,i+1);
//          c=c+k;
//
//        }
//        System.out.println(c);
        //Example 12:Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        // A A A A A A A A
        // A X X X X X X A
        // A X X X X X X A
        // A X X X X X X A

        //Example 13:3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.
//        int sum=0;
//        for (int i=3; i<15; i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);

        //Example 14:3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.
//        int m=1;
//        int i=3;
//        do {
//            m=m*i;
//            i++;
//        }while (i<10);
//        System.out.println(m);

        //Example 15:Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
        //kod yazınız.
//        String s="";
//        char i='C';
//        do {
//            s=s+i;
//            i--;
//
//        }while (i>='A');
//        System.out.println(s);

        //Example 16: Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
//        String m="Cristmas";
//        String b="";
//        for (int i=0; i<m.length();i++){
//            String c=m.substring(i,i+1);
//            if (c.equals("m")){
//                break;
//            }
//            b=b+c;
//        }
//        System.out.println(b);


        //Example 17: Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
//        int n=789;
//        int sum=0;
//        for (int i=n; i>0;i=i/10){
//            sum=sum+i%10;
//        }
//        System.out.println(sum);



       /*
       Example 18:Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        //Örneğin; Hello ==> Heo
        */

//        String n="hello";
//        for (int i=0; i<n.length();i++){
//            String c=n.substring(i,i+1);
//            if (n.indexOf(c)==n.lastIndexOf(c)){
//                System.out.println(c);
//            }
//        }


        // Example 19:Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.

//        String l="hello 123";
//        l=l.replaceAll("\\s","").replace("\\p{Punct}","");
//        System.out.println(l.length());
//        }



        // Example 20: Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        // * * * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

//        int num=6;
//        String s="";
//        for (int i=1; i<=num;i++){
//            for (int k=num; k>=i;k--){
//                s=s+"*";
//            }
//            System.out.println(s);
//            s="";
//        }



        // Example 21: Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
        //Örnek:12133455 ´ 2+4=6

//        int p = 1213345455;
//       String r=String.valueOf(p);
//       int num=0;
//       for (int i=0; i<r.length();i++){
//           String c=r.substring(i,i+1);
//           if (r.indexOf(c)==r.lastIndexOf(c)){
//               num=num+Integer.valueOf(c);
//           }
//       }
//        System.out.println(num);


        //Example 22:  5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.

//        for (int i=3;i<10;i++){
//            if(i==5){
//                continue;
//            }
//            System.out.print(i+"");
//        }


        // Example 23: Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
        //Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
        //olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
        //yönlendiriniz.




        // Example 24:Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci
        //sayılarını yazdıran kodu yazınız.
        //Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Kac tane fibonacci sayisi gormek istiyorsunuz  ?");
//        int number = scan.nextInt();
//        int fibo1 = 1;
//        int fibo2 = 1;
//        int fibonacci = 0;
//        System.out.print(fibo1 + " ");
//        System.out.print(fibo2 + " ");
//        for (int i = 1; i < number-1;   i++) {
//            fibonacci = fibo1 + fibo2;
//            System.out.print(fibonacci + " ");
//            fibo1 = fibo2;
//
//            fibo2 = fibonacci;
//
//
//        }


        // Example 25:) Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
        //Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir
        //Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
        //için bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("Armstrong sayisi olup olmadigini kontrol etmek icin bir sayi giriniz :");
        int n = scan.nextInt();
        int sumOfCubes = 0;
        int temp = n;
        int digit = 0;
        while(n>0) {
            digit = n%10;
            sumOfCubes = sumOfCubes + digit*digit*digit;
            n = n/10;

        }
        System.out.println(n);
        if(temp==sumOfCubes) {
            System.out.println(temp + " Armstrong sayidir");
        }else {
            System.out.println(temp + " Armstrong sayi degildir");

        }







        // Example 26: Kullanıcıdan bir String ve bir karakter alınız.
        //String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter
        //sayısını sayınız.
        //Boşluk karakterlerini saymayınız.
        //Kod, kullanıcının seçtiği karakter String ‘de sadece bir kez varsa konsolda -1,
        //Kod, kullanıcının seçtiği karakter String ‘de yoksa konsolda -1 döndürsün.
        //
        //Örneğin; "Java is easy" - 'a' ==> 5
        // "Java is easy" - 'w' ==> -1
        // "Java is easy" - 'e' ==> -1

        //Example 27 :Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
        //Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.


        // Example 28: Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazınız.
        //Örnek: kullanıcı 20 girerse çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır.

        // ://Example 29: Herhangi bir döngü kullanmadan 1'den 100'e kadar tam sayıları yazdıran bir program
        //yazınız.

        //Example 30: Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Sözcükler değişmeden,
        //her giriş satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız.
        //Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        //Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir.

        //Example 31: Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Her giriş satırındaki ilk
        //ve son sözcükler dışındaki sözcüklerin sırasını tersine çevirip sözcükleri değiştirmeden
        //kodu yazınız.
        //Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        //Örnek; Kemal Can Tan Han Kuzu, Kemal Han Tan Can Kuzu'ya dönüşecektir.












    }}


