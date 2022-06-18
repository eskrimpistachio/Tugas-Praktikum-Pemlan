public class Main {

    public static void main(String[] args) {

        CarRider charles = new CarRider("Charles Leclerc",24, "0801234");
        CarRider max = new CarRider("Max Verstappen", 24, "081234");
        CarRider george = new CarRider("George Russell", 24, "081378");
        CarRider lando = new CarRider("Lando Norris", 22, "087654");

        CarData data = new CarData();
        data.addCar("SPORT", "C 123456", "Ferrari");
        data.addCar("HATCHBACK", "M 234567", "Honda");
        data.addCar("SUV", "G 634578", "Mercedes");
        data.addCar("SPORT", "L 789123", "Mclaren");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(charles, data.carList.get(0), 4);
        arsip.Rent(max,data.carList.get(2),6);
        arsip.Rent(george, data.carList.get(2), 2);
        arsip.Rent(lando, data.carList.get(3), 8);

        System.out.println();
        arsip.info();

    }

}
