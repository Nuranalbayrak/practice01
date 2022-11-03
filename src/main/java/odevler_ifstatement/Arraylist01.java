package odevler_ifstatement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylist01 {
    public static void main(String[] args) {

       // Example 1 :  Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
        List<Integer> l1=new ArrayList<>();
        l1.add(12);
        l1.add(31);
        l1.add(7);
        l1.add(13);
        l1.add(10);
        int sum=0;
        for ( Integer w:l1) {
            sum=sum+w;
        }
        System.out.println(sum);//73

        //Example 2: Listte 13 ogesinden onceki sayilarin toplamini bulunuz
        List<Integer> l2=new ArrayList<>();
        l2.add(12);
        l2.add(31);
        l2.add(7);
        l2.add(13);
        l2.add(10);
        int topla=0;
        for (Integer w: l2) {
            if (w==13){
                break;
            }topla=topla+w;
        }
        System.out.println(topla);//63

        // Example 3: Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.

        List<Integer> l3=new ArrayList<>();
        l3.add(12);
        l3.add(31);
        l3.add(7);
        l3.add(13);
        l3.add(10);
        int carp=1;
        for (Integer w: l3 ) {
            if (w%2==0){
                carp=carp*w;
            }
        }
        System.out.println(carp);//120


        //Example 4: Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
        //Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
        // (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
        List<String> l4=new ArrayList<>();
        l4.add("Sari");
        l4.add("Kirmizi");
        l4.add("Yesil");
        l4.add("Mavi");

        List<String> l5=new ArrayList<>();
        l5.addAll(l4);
        Collections.sort(l5);
        System.out.println(l4);
        System.out.println(l5);

        int size=l4.size();
        int ekle=0;
        for (int i = 0; i <size ; i++) {
            if (l5.get(i).equals(l4.get(size-1))){
                topla++;
            }
        }
        if (topla==size){
            System.out.println("azalan");
        }else {
            System.out.println("azalan sirada degil");


            //Example 5:Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
            //Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
            List<Integer> L6 = new ArrayList<>();
            L6.add(12);
            L6.add(11);
            L6.add(15);
            L6.add(34);
            L6.add(43);

            if (L6.contains(15)) {
                for (int w : L6) {
                    if (w == 15) {
                        int index = L6.indexOf(15);
                        L6.set(index, 51);
                    }
                }
                System.out.println(L6);
            } else System.out.println("15 icermiyor");


            //Example 6:  Listede 15 veya 13 varsa, bu elemanları kaldırınız.

            //Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
            List<Integer> h = new ArrayList<>();
            h.add(10);
            h.add(31);
            h.add(15);
            h.add(13);
            h.add(54);
            h.add(13);

            if(!h.contains(15) && !h.contains(13)){
                System.out.println("Liste 13 ve 15'i icermiyor");
            }else {
                for (int i = 0; i < h.size(); i++) {
                    if (h.get(i) == 15) {
                        int idx15 = h.indexOf(15);
                        h.remove(idx15);
                        i--;
                    }
                    if (h.get(i) == 13) {
                        int idx13 = h.indexOf(13);
                        h.remove(idx13);
                        i--;
                    }
                }
                System.out.println(h);

            }
    }

        //Example 7:  Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        //Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

        List<Integer> myList=new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(15);
        myList.add(13);
        myList.add(54);
        Collections.sort(myList);
        System.out.println(myList);

        int fark=myList.get(2)-myList.get(1);//Aradaki farki en az olan sayilar en yakin sayilardir.

        for (int i = 1; i <myList.size() ; i++) {
            fark=Math.min(fark,myList.get(i)-myList.get(i-1));
        }
        for (int i = 1; i < myList.size(); i++) {
            if(myList.get(i)-myList.get(i-1) == fark){
                System.out.println(myList.get(i) + " and " + myList.get(i-1));
        }
    }

       // Example 8: Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        //Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(15);
        list.add(7);
        list.add(10);
        list.add(13);
        list.add(10);
        list.add(14);
        list.add(14);
        list.add(15);
        System.out.println(list);
        for (int w:list) {
            if (w==7 || w==10){
                continue;
            }else {
               list.set(list.indexOf(w),w+2);

            }
        }
        System.out.println(list);

        //Example 9: String bir listede verilen tüm fiyatların toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99',  '$23.60',  '$54.45'}; ==> 91.04
        List<String> fiyat=new ArrayList<>();
        fiyat.add("$12.99");
        fiyat.add("$23.60");
        fiyat.add("$54.45");
     double sum2=0;
        for (String w:fiyat) {
            Double toplam=Double.valueOf(w.replace("$",""));
            sum2=sum2+toplam;
        }
        System.out.println(sum2);


        //Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70
        List<String> toplam=new ArrayList<>();
        toplam.add("$8.25");
        toplam.add("$23.60");
        toplam.add("$54.45");

        List<Double> decimalList = new ArrayList<>();
        for(String w: toplam){
            Double price = Double.valueOf(w.replace("$", ""));
            decimalList.add(price);

        }Collections.sort(decimalList);
        Double sum3 = decimalList.get(0) + decimalList.get(decimalList.size()-1);
        System.out.println(sum3);












    }}
