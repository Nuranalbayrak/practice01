package calisma01;

public class CarRunner {
    public static void main(String[] args) {
        Car01 c1= new Car01(2003,"by");

        //c1.ilanNo=2001;
        //c1.marka="Toyoito";
        c1.model="Corolla";
        c1.yil=2017;
        c1.fiyat=400000;
        System.out.println(c1.ilanNo+" "+c1.model+" "+c1.marka+" "+c1.fiyat+" "+c1.yil+" ");
        c1.hiz(25000);
        c1.yakit("dizel");
    }
}
