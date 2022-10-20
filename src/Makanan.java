public class Makanan extends OnlineShop{
     private String Kadaluarsa;

     Makanan(String namaBarang, int hargaBarang) {
         super(namaBarang, hargaBarang);
         this.Kadaluarsa=Kadaluarsa;
    }


    public void setInformasiBulanKadaluarsa(String informasiBulanKadaluarsa) {
        this.Kadaluarsa =Kadaluarsa;
    }

    public String getInformasiBulanKadaluarsa() {
        return Kadaluarsa;
    }

    @Override
    public String toString(){
        return getNamaBarang() + " , " + Kadaluarsa;
    }
}
