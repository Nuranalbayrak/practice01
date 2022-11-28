package abstraction;

public class Runner {
    public static void main(String[] args) {
        Oyuncu oyuncu = new Futbolcu() ;//abstract class in instance'i alinamaz.
        oyuncu.setIsim("Nuran");
        oyuncu.setNumara(23);
        oyuncu.pasVer();
        oyuncu.sutCek();
        oyuncu.toString();
        System.out.println(oyuncu.toString());

    }
}
