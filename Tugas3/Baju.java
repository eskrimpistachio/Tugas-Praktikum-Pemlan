public class Baju {

    String jenis ;
    int harga ;
    int jumlah ;

    public Baju (String a, int b){
        this.jenis = a ;
        this.jumlah = b ;
    }

    final int bajua = 100_000;
    final int bajub = 125_000;
    final int bajuc = 175_000;

    void hargaa(){
        this.harga = bajua;

        if (jumlah > 100)
            harga = harga - 5000 ;
    }

    void hargab(){
        this.harga = bajub;

        if (jumlah > 100)
            harga = harga - 5000 ;
    }

    void hargac(){
        this.harga = bajuc;

        if (jumlah > 100)
            harga = harga - 15000 ;
    }

    void display(){
        if (jenis.equalsIgnoreCase("a"))
            hargaa();
        else if (jenis.equalsIgnoreCase("b"))
            hargab();
        else if (jenis.equalsIgnoreCase("c"))
            hargac();

        System.out.println("Jenis yang anda beli    : " + jenis);
        System.out.println("Harga per buah          : " + harga);
        System.out.println("Total harga             : " + harga*jumlah);
    }


}
