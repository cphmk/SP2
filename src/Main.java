
public class Main {
    public static void main(String[] args) {

        FleetOfCars fleetOfCars = new FleetOfCars();

        fleetOfCars.addCar(new GasolineCar(4,"520 i 2,2","BMW",11,"Mahdi89"));
        fleetOfCars.addCar(new GasolineCar(4,"Barchetta 1,8 Cabr","Fiat",12,"Ferdinand04"));
        fleetOfCars.addCar(new DieselCar(4, "147 1,9 JTD Lusso 6g", "Alfa Romeo",17,"Claus06",true));


        System.out.println(fleetOfCars);
        System.out.println("Du skal betale " + fleetOfCars.getTotalRegistrationFeeForFleet() + " kr ");
    }
}