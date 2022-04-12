import java.util.Scanner;

public class DataMerchant {

    static Scanner input = new Scanner(System.in);
    static Merchant merc[] = new Merchant[0];

    public static Merchant[] tambahMerchant (Merchant merchant){

        Merchant newarr [] =  new Merchant[DataMerchant.merc.length+1];

        for (int i = 0 ; i < DataMerchant.merc.length ; i++){
            newarr[i] = DataMerchant.merc[i];
        }

        newarr[DataMerchant.merc.length] = merchant ;
        return newarr ;

    }

    public static void tampilData(){
        for (Merchant merchant1 : merc){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant   : " + merchant1.getNamaMerchant());
            System.out.println("Nama Produk     : " + merchant1.getNamaProduk());
            System.out.println("Harga           : " + (int)merchant1.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant (String nama){

        return null;
    }

    public static void tampilMerchant (Merchant merchant){

    }

    public static void updateMerchant (Merchant merchant){

    }

}
