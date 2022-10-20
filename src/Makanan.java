public class Makanan extends OnlineShop{
    String informasiBulanKadaluarsa;

     Makanan(String namaBarang, int hargaBarang) {
         super(namaBarang, hargaBarang);
         this.informasiBulanKadaluarsa=informasiBulanKadaluarsa;
    }


    public void setInformasiBulanKadaluarsa(String informasiBulanKadaluarsa) {
        this.informasiBulanKadaluarsa = informasiBulanKadaluarsa;
    }

    public String getInformasiBulanKadaluarsa() {
        return informasiBulanKadaluarsa;
    }
}
