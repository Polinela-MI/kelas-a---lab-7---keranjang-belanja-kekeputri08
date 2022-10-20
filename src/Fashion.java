public class Fashion extends OnlineShop {
    int ukuran;

    Fashion(String namaBarang, int hargaBarang) {
        super(namaBarang, hargaBarang);
        this.ukuran=ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }
}
