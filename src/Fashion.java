public class Fashion extends OnlineShop {
     private String ukuran;



    Fashion(String namaBarang, int hargaBarang) {
        super(namaBarang, hargaBarang);
        this.ukuran=ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public String toString(){
        return getNamaBarang() + " , " + ukuran;
    }
}
