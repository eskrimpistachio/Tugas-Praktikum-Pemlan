import java.util.ArrayList;

public class RentArchive{

    ArrayList<CarRent> rentData = new ArrayList<>();

    public void Rent(CarRider rider, Car car, int rentDur){

        CarRent newCarRent = new CarRent(rider,car,rentDur);


        if(car.isStatus()){
            System.out.println("Mobil berhasil disewa");
            car.setStatus("false");
            rentData.add(newCarRent);
        }
        else {
            System.out.println("Maaf, mobil sudah disewa");
        }


    }

    public void info(){

        System.out.println("-".repeat(45));
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("-".repeat(45));

        for(CarRent rent : rentData){
            System.out.println("NAMA PEMINJAM   : " + rent.getRider().getName());
            System.out.println("TIPE MOBIL      : " + rent.getCar().getCarType());
            System.out.println("NO POLISI       : " + rent.getCar().getPolNum());
            System.out.println("LAMA RENTAL     : " + rent.getRentDur());
            System.out.println("-".repeat(45));
        }




    }
}
