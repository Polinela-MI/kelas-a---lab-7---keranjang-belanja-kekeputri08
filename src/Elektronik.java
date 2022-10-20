public class Elektronik extends OnlineShop{
    String Garansi;


    Elektronik(String namaBarang, int hargaBarang) {
        super(namaBarang, hargaBarang);
        this.Garansi=Garansi;
    }

    public void setInformasiGaransi(String informasiGaransi) {
        Garansi =Garansi;
    }

    public String getInformasiGaransi() {
        return Garansi;
    }
}
