public class PegawaiTetap extends Pegawai{
    private double upah ;

    PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah ;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah ;
    }

    @Override
    public double gaji() {
        return super.gaji() + getUpah();
    }

    @Override
    public String toString() {
        return  "Pengawai Tetap " + super.toString() + "\n" +
                "Upah           : " + (long)getUpah() + "\n" +
                "Pendapatan     : " + "Rp " + (int)gaji() + "\n";
    }
}
