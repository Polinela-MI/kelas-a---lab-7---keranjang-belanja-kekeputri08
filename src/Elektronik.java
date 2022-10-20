public class Elektronik extends OnlineShop{
    private String InformasiGaransi;


    Elektronik(String namaBarang, int hargaBarang) {
        super(namaBarang, hargaBarang);
        this.InformasiGaransi=InformasiGaransi;
    }

    public void setInformasiGaransi(String informasiGaransi) {
        InformasiGaransi = informasiGaransi;
    }

    public String getInformasiGaransi() {
        return InformasiGaransi;
    }
}
