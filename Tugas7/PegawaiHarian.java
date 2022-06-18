public class PegawaiHarian extends Pegawai {

    private double upahPerJam ;
    private int totalJam ;

    PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        this.upahPerJam = upahPerJam ;
        this.totalJam = totalJam ;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        if(getTotalJam() <= 40){
            return super.gaji() + getUpahPerJam() * getTotalJam() ;
        }
        else{
            return super.gaji() + getUpahPerJam() * getTotalJam() + (getTotalJam() - 40) * getUpahPerJam() * 1.5 ;
        }

    }

    @Override
    public String toString() {
        return  "Pengawai Harian" + super.toString() + "\n" +
                "Upah/jam       : " + getUpahPerJam() + "\n" +
                "Total jam kerja: " + getTotalJam() + "\n" +
                "Pendapatan     : " + "Rp " + (int)gaji() + "\n";
    }
}
