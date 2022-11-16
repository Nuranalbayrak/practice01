package calisma01;

public class Car01 {

    protected int ilanNo;
   protected String marka;
    String  model;
    int yil;
    int fiyat;

    public  void hiz(int maxHiz){
        System.out.println("Araba max:"+ maxHiz+ "km hiz yapar.");

    }
    public  void yakit(String yakitTuru){
        System.out.println("Araba yakit olarak: "+yakitTuru+ " kullanir..");

    }public Car01(int ilanNo,String marka){
        this.marka = marka;
        this.ilanNo = ilanNo;
    }
}
