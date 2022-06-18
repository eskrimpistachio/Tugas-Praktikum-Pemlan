import java.util.Arrays;

public class Main {
    static Manusia manusia[];
    static MahasiswaFILKOM mahasiswa[];
    static Pekerja pekerja[];
    static Manager manager[];

    public static void main(String[] args) {

        manusia = new Manusia[3];
        System.out.println(" Class Manusia ");
        System.out.println("-".repeat(45));
        manusia[0] = new Manusia("Ferland Mendy", "123124124552", true, false);
        manusia[1] = new Manusia("Karim Benzema", "31232132321", true, true);
        manusia[2] = new Manusia("Charlotte", "723712377123", false, true);
        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());
        System.out.println("=".repeat(45));

        mahasiswa = new MahasiswaFILKOM[3];
        System.out.println();
        System.out.println(" Class Mahasiswa ");
        System.out.println("-".repeat(45));
        mahasiswa[0] = new MahasiswaFILKOM("215150400111002", 3.6, "Ridha Sabilla", "199925029106", false, true);
        mahasiswa[1] = new MahasiswaFILKOM("195150300111002", 3.2, "Isabel", "2003829374606", false, false);
        mahasiswa[2] = new MahasiswaFILKOM("205150707111037", 4.0, "Dusan Vlahovic", "2002682923109", true, true);
        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());
        System.out.println("=".repeat(45));

        pekerja = new Pekerja[3];
        System.out.println();
        System.out.println(" Class Pekerja ");
        System.out.println("-".repeat(45));
        pekerja[0] = new Pekerja(10, 29, "203127529647", "Charles Leclerc", "2933242352524", true, true);
        pekerja[1] = new Pekerja(6, 28, "204325829957", "Bella", "243245245224", false, true);
        pekerja[2] = new Pekerja(8, 30, "2022257291648", "Abel Khaizure", "203245244642", true, false);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());
        System.out.println("=".repeat(45));

        manager = new Manager[3];
        System.out.println();
        System.out.println(" Class Manager ");
        System.out.println("-".repeat(45));
        manager[0] = new Manager(1200, 8, 20, "205225229106", "Friska Ananta", "2001647443", false, true);
        manager[1] = new Manager(1600, 6, 26, "201225729106", "Steven Baldwin", "1987456362362", true, true);
        manager[2] = new Manager(1250, 5, 28, "203225129106", "Refa Haldy", "193475135113", true, false);
//        manager[2] = new Manager(1500, 9, 20, "204837283728", "Lyra", "351707384392", false, false);
        System.out.println(manager[0].toString());
        System.out.println(manager[1].toString());
        System.out.println(manager[2].toString());
        System.out.println("=".repeat(45));

        System.out.println(" Total Keseluruhan yang Terdaftar ");
        System.out.println("-".repeat(45));
        System.out.println("Jumlah Manusia : " + manusia.length);
        System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
        System.out.println("Jumlah Pekerja : " + pekerja.length);
        System.out.println("Jumlah Manager : " + manager.length);
    }
}