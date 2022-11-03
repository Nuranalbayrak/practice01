package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example03 {


        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */
        //1.Adim: Günleri içeren bir tane ArrayList oluşturun. (gunler)
        public static void main(String[] args) {

            List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));


            //2.Adim: Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
            List<Integer> gunlukKazanclar = new ArrayList<>();

            //3.Adim: While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.

            Scanner input = new Scanner(System.in);
            int i = 0;
            while (i < 7) {

                System.out.println(gunler.get(i) + " gunune ait kazanc miktarini giriniz");
                gunlukKazanclar.add(input.nextInt());
                i++;
            }

            //4.Adim: getOrtalamaKazanc() adlı method ile ortalama kazancı alın.

            System.out.println("Ortalama Kazanc: " + getOrtalamaKazanc(gunlukKazanclar));


            //5.Adim: getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
            //     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
            //     *           ortalama kazançtan yüksekse o günleri return yap.

            getOrtalamaninUstundeKazancGunleri(gunler, gunlukKazanclar, getOrtalamaKazanc(gunlukKazanclar));

            //6.Adim: getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
            //     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
            //     *           ortalama kazançtan aşağıysa o günleri return yap.

            getOrtalamaninAltindakiKazancGünleri(gunler, gunlukKazanclar, getOrtalamaKazanc(gunlukKazanclar));

        }

    public static int getOrtalamaKazanc (List<Integer> a){

        int sum= 0;
        for(int w: a){
            sum+=w;
        }
        int ortalamaKazanc = sum/a.size();
        return ortalamaKazanc;

    }

    public static void getOrtalamaninUstundeKazancGunleri (List<String> a, List<Integer> b, int c){

        int size = a.size();
        List<String> OrtalamaninUstundeKazancGunleri = new ArrayList<>();

        for(int i=0; i<size; i++){
            if(b.get(i)>c){
                OrtalamaninUstundeKazancGunleri.add(a.get(i));
            }

        }
        System.out.println("OrtalamaninUstundeKazancGünleri = " + OrtalamaninUstundeKazancGunleri);
    }

    public static void getOrtalamaninAltindakiKazancGünleri (List<String> a, List<Integer> b, int ortalamaKazanc){

        int size = a.size();
        List<String> OrtalamaninAltindakiKazancGünleri = new ArrayList<>();

        for(int i=0; i<size; i++){
            if(b.get(i)<ortalamaKazanc){
                OrtalamaninAltindakiKazancGünleri.add(a.get(i));
            }

        }
        System.out.println("OrtalamaninAltindakiKazancGünleri = " + OrtalamaninAltindakiKazancGünleri);
    }
    }

