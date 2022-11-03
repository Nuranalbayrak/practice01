package calismaVariable01;

public class Nestedcalisma01 {
    public static void main(String[] args) {
       /*
       password'un ilk harfi buyuk harf ise
       'A' olursa gecerli diger durumlarda gecersiz
       passwordun ilk harfi kucuk harf ise
       'z' olursa gecerli diger durumlarda gecersiz
        */

      String pwd="A12345";
      char ilkHarf=pwd.charAt(0);
      if (ilkHarf>='A' && ilkHarf<='Z' ){
          if (ilkHarf=='A'){
              System.out.println(" gecerli");
          }else{
              System.out.println("gecersiz");
          }
      }else if (ilkHarf>='a' && ilkHarf<='z'){
          if (pwd.charAt(0)=='z') {
              System.out.println("gecerli");
          }else {
              System.out.println("gecersiz");
         }
      }else {
          System.out.println("ilk karakter harf olmalı");
      }






    }
}
