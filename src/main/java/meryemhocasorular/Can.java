package meryemhocasorular;

public class Can {
    private String sezon;
    private String kursAdi;
    private int ortalamaPuan;
    private int ogrenciSayisi;

    public String getSezon() {
        return sezon;
    }

    public void setSezon(String sezon) {
        this.sezon = sezon;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public void setKursAdi(String kursAdi) {
        this.kursAdi = kursAdi;
    }

    public int getOrtalamaPuan() {
        return ortalamaPuan;
    }

    public void setOrtalamaPuan(int ortalamaPuan) {
        this.ortalamaPuan = ortalamaPuan;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public Can(String sezon, String kursAdi, int ortalamaPuan, int ogrenciSayisi) {

        this.sezon = sezon;
        this.kursAdi = kursAdi;
        this.ortalamaPuan = ortalamaPuan;
        this.ogrenciSayisi = ogrenciSayisi;
    }

    @Override
    public String toString() {
        return "\n" + " sezon='" + sezon + '\'' +
                ", kursAdi='" + kursAdi + '\'' +
                ",  ortalamaPuan='" + ortalamaPuan + '\'' +
                ", ogrenciSayisi='" + ogrenciSayisi + '\'' +
                '}';
    }
}
