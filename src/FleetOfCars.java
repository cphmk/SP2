import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();

    void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;
        for (Car car : fleet) {
            totalRegistrationFee = totalRegistrationFee +  car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }


    @Override
    public String toString() {
        String carTxt = "";
        for (Car car : fleet) {
            carTxt = carTxt + car.toString() + " \n";
        }
        return carTxt;


    }
}