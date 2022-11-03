package calismaVariable01;

public class Method01 {
    //method olusturma yöntemleri.
    /*
    method olusturuken psvm nin suslu parantezinin dısına  cıkıyoruz. daha sonra public + static+yapacagımız eylemi yazıyoruz
    sonra parantez acıp (örn;int a, int b, vb yazıp parabtezi kapatıp süslü parantez acıyoruz. o suslu parantezin icine
    return a+b ; ne ise yapacagın islem onu yazıyosun bu yaptıklarını yazdırmak icinde yukarı cıkıp psvm nin icine sout yazıyorsun.
    println icine gelip method ismini yazıp(degerleri aralarında virgül olarak yazıp kapatıyosun.
     */
    public static void main(String[] args) {
        System.out.println(toplamaYap(1.2,4.5));

        System.out.println(bolmeyap(45,9));
        System.out.println(carpmaYap(7,8,9));
    }
    //toplama islemi yapan biir method olustur.
    public static double toplamaYap (double a,double b){
        return a+b;

    }
    //uc sayıyı birbiriyle carpan bir method olusturun
    public static int carpmaYap (int a,int b,int c){
        return a*b*c;

    }


    public static double bolmeyap(double a,double b){
        return a/b;

    }





}




