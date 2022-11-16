package exceptions;

public class Exception01 {
    //Yeni bir class olusturalim,icinde mailDogrula(String eMail) olsun.Email adresi @gmail.com" veya "@hotmail.com" icermiyorsa
    //InvalidEmailIdCheckedException versin.
    public static void main(String[] args) {
        mailDogrula("nur");
    }
    public static  void mailDogrula(String Email){
        if (Email.contains("@hotmail.com")||Email.contains("@gmail.com")){
            System.out.println(Email);
        }else{
            throw new InvalidEmailIdUnCheckedException("email adresi uygun degil");
        }

    }


    }

