public abstract class OnlineShop {
    private String namaBarang;
    private int hargaBarang;


    OnlineShop(String namaBarang, int hargaBarang){
        this.namaBarang=namaBarang;
        this.hargaBarang=hargaBarang;
    }



    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }


    @Override
    public String toString(){
        return namaBarang;

    }

}


