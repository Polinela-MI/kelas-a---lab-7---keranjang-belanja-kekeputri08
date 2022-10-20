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

        for (String s1 : hasilSplit) {
            System.out.println(s1);
        }



    }



}
