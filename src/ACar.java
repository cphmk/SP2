public abstract class ACar implements Car {

int numberOfDoors;
String model;
String make;
String registrationNumber;

    public ACar(String make, String model, String registrationNumber, int numberOfDoors) {

        this.make = make;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber(){
    return registrationNumber;
    }


    @Override
    public String getMake(){
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    @Override
    public String toString() {
        return make + " " + model + "; " + registrationNumber + ", " + numberOfDoors + " doors";
    }


}
