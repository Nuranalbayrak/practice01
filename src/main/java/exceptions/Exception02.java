package exceptions;

public class Exception02 {
    //Yeni bir class olusturalim,icinde mailDogrula(String eMail) olsun.Email adresi @gmail.com" veya "@hotmail.com" icermiyorsa
    //InvalidEmailIdCheckedException versin.
    public static void main(String[] args) throws InvalidEmailIdCheckedException {

        mailDogrula("aghajh@gmail.com");
    }
    public static void mailDogrula(String eMail) throws InvalidEmailIdCheckedException {
        if (eMail.contains("@gmail.com")||eMail.contains("@hotmail.com")){
            System.out.println(eMail);
        }else {
            throw  new InvalidEmailIdCheckedException("email adresi uygun degil");
        }
    }
}
