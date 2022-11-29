package meryemhocasorular;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
       Can course1=new Can("sonbahar","Java",90,350);
       Can course2=new Can("yaz","selenium",96,120);
       Can course3=new Can("ilkbahar","core java",88,300);
       Can course4=new Can("kis","Sql",92,40);
       List<Can> courses=new ArrayList<>();
       courses.add(course1);
       courses.add(course2);
       courses.add(course3);
       courses.add(course4);


       dksnSkzBykMu(courses);
       System.out.println();
       gunKelimeVarMi(courses);
       System.out.println();
       ogrSays154Mu(courses);
       System.out.println();
       mvsimSorgula(courses);
       System.out.println();
       ogrSays100Varmi(courses);
       System.out.println();
       ortSiraal(courses);
       System.out.println();
       ogrSayisinaSirala(courses);
       System.out.println();
       kursAdinaGreSirala(courses);


    }
   //Tüm ortalama puanların 98'den az olup olmadığını kontrol edin
   public static void dksnSkzBykMu( List<Can> courses){
      System.out.println(courses.stream().allMatch(t->t.getOrtalamaPuan() < 98) ? "tum not ortalamalari 98'den kucuktur" :"98 uzerinde not vardir");

   }
   //Tüm ders adlarının "Gün" kelimesini içerip içermediğini kontrol edin
   public static void gunKelimeVarMi(List<Can> courses){
      System.out.println(courses.stream().allMatch(t->t.getKursAdi().contains("Gun")) ?"ders gun adi iceriyor"  : "ders gun adi icermiyor");
   }
   //Herhangi bir öğrenci sayısının 154 olup olmadığını kontrol edin
   public static void ogrSays154Mu(List<Can> courses){
      System.out.println(courses.stream().anyMatch(t -> t.getOgrenciSayisi() > 154) ? "ogrenci sayisi 154 olan ders yok" : "ogrenci sayisi 154 olan ders vardir");
   }
   // Herhangi bir mevsimin Kış olup olmadığını kontrol edin
   public static void mvsimSorgula(List<Can> courses){
      System.out.println(courses.stream().anyMatch(t -> t.getSezon().equalsIgnoreCase("kis")) ? "en az bir mevsim kistir" : "kis olan yoktur");
   }

   //Herhangi bir öğrenci sayısının 100 olup olmadığını kontrol edin
   public static void ogrSays100Varmi(List<Can> courses){
      System.out.println(courses.stream().noneMatch(t -> t.getOgrenciSayisi() == 100) ? "esit olan yoktur t" : "en az bir sinifin mevcudu esitir");
   }
   //Öğeleri ortalama puana göre doğal sırayla sırala
   public static void ortSiraal(List<Can> courses){
       courses.stream().sorted(Comparator.comparing(Can::getOrtalamaPuan)).forEach(t-> System.out.println(t+" "));
   }
   //Öğeleri öğrenci sayısına göre ters sırada sırala
   public static void ogrSayisinaSirala(List<Can> courses){
       courses.stream().sorted(Comparator.comparing(Can::getOgrenciSayisi).reversed()).forEach(t-> System.out.println(t+" "));
   }
   //Kurs adına göre öğeleri ters sırada sıralayın
   public static void kursAdinaGreSirala(List<Can> courses){
       courses.stream().sorted(Comparator.comparing(Can::getKursAdi).reversed()).forEach(t-> System.out.println());
   }
}
