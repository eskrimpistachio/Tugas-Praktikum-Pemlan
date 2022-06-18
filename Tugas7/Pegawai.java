public class Pegawai {
    private String nama ;
    private String noKTP ;

    Pegawai(String nama, String noKTP){
        this.nama = nama ;
        this.noKTP = noKTP ;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public double gaji(){
        return 0 ;
    }

    public String toString(){
        return  ": " + getNama() + "\n" +
                "No.KTP         : " + getNoKTP() ;
    }
}
