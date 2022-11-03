package calismaVariable01;

public class car {


    /*
    öncelikle variablelar olusturuldu
    psvm acıldı
    obje olusturduk.
    altına yazdırdık
    psvm dısında method olusturduk. nasıl olusturuyordk methodu
    public+ void(sadece void yazdık cunku yeni data üretmeyecegiz)eylemi yaz(){}.
    sout yaz icine o methodu yazınca cıkmasını istediğin seyi yaz
    sonra cık psvmnin icine yaz methodunu nokta koy ne istiyorsan sec
     */
        String marka="toyoto";
        int fiyat=400;

    public static void main(String[] args) {

        car myToyoto = new car();//objemiz
        System.out.println(myToyoto.fiyat);
        System.out.println(myToyoto.marka);
        myToyoto.hareketEt();
        myToyoto.dur();
    }

        public void hareketEt(){
            System.out.println("toyoto mukemmel arabadır");
        }
        public void dur(){
            System.out.println("toyoto guvenli durur");
        }


        /*
        Note: Class==> Variable==> Object ==>kullanacagiz
                        method
         */

        //obje olusturma islemi nasıl yapılır?
        //1)Class ismini yaz.
        //2)objeye bir isim ver.
        //3) "= " isareti koy.
        //4)"new" keyboardunu kullan, yaz
        //5)Class ismini parantezle beraber yaz (Constructor)






    }

