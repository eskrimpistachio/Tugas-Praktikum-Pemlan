public class Main {

    public static void main(String[] args) {

        PegawaiTetap pegawaitetap1 = new PegawaiTetap("George","11111111", 25_000_000);
        PegawaiTetap pegawaitetap2 = new PegawaiTetap("Charles","2222222", 20_000_000);
        PegawaiTetap pegawaitetap3 = new PegawaiTetap("Sergio","33333333", 10_000_000);


        PegawaiHarian pegawaiharian1 = new PegawaiHarian("Lewis","4444444", 17000, 44);
        PegawaiHarian pegawaiharian2 = new PegawaiHarian("Fernando","555555", 12000, 34);
        PegawaiHarian pegawaiharian3 = new PegawaiHarian("Max","6666666", 11000, 33);

        Sales sales1 = new Sales("Pierre", "777777", 10, 50_000);
        Sales sales2 = new Sales("Carlos", "8888888", 55, 45_000);
        Sales sales3 = new Sales("Lando", "9999999", 4, 40_000);

        System.out.println(pegawaitetap1);
        System.out.println(pegawaitetap2);
        System.out.println(pegawaitetap3);

        System.out.println(pegawaiharian1);
        System.out.println(pegawaiharian2);
        System.out.println(pegawaiharian3);

        System.out.println(sales1);
        System.out.println(sales2);
        System.out.println(sales3);
    }
}
