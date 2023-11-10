public class GasolineCar extends AFuelCar {


    GasolineCar(int numberOfDoors, String model, String make, int kmPrLitre, String registrationNumber) {
        super(numberOfDoors, model, make, kmPrLitre, registrationNumber);
    }

    @Override
   public String getFuelType() {
        return "Gasoline";
   }

   @Override
   public int getRegistrationFee() {
       int registrationFee = 0;

       if (kmPrLitre >= 20 && kmPrLitre <= 50) {
           registrationFee += 330;
       }
       else if (kmPrLitre >= 15 && kmPrLitre < 20) {
           registrationFee += 1050;
       }
       else if (kmPrLitre >= 10 && kmPrLitre < 15) {
           registrationFee += 2340;
       }
       else if (kmPrLitre >= 5 && kmPrLitre < 10) {
           registrationFee += 5500;
       }
       else {
           registrationFee += 10470;
       }
       return registrationFee;


   }
    @Override
    public String toString() {
        return super.toString();
    }

}
