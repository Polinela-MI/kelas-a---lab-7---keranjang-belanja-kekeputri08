import java.util.ArrayList;

public class Beli {
    public static void main(String[] args){

        String AllItem= ""
                + "makanan#susu#15000#oct-2022;" +
                "fashion#sweater#55000#M;" +
                "fashion#denim jeans#150000#L;" +
                "makanan#keju#25000#dec-2022;" +
                "elektronik#lenovo thinkpad#12500000#24;" +
                "elektronik#lg monitor#800000#15;" +
                "fashion#piyama bayi#35000#S;";

        String[] hasilSplit = AllItem.split(";");

        for (int i=0; i< hasilSplit.length; i++) {

            String[] OnlineShop = hasilSplit[i].split("#");

            switch (OnlineShop[0]){
                case "makanan":
                    Makanan Makanan = new Makanan(OnlineShop[1], OnlineShop[2], OnlineShop[3]);
                    break;
                case "fashion":
                    Fashion Fashion = new Fashion(OnlineShop[1], OnlineShop[2], OnlineShop[3]);
                    break;
                case "makanan":
                    Elektronik Elektronik = new Elektronik(OnlineShop[1], OnlineShop[2], OnlineShop[3]);
                    break;
            }
            ArrayList shoping = new ArrayList<>();
            
        }
    }
}
