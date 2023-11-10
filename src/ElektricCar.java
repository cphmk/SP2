public class ElektricCar extends ACar {

int batteryCapacity;
int maxRange;
float WhPrKm;

    public ElektricCar(String make, String model, String registrationNumber, int numberOfDoors, int maxRange, int batteryCapacity) {
        super(make, model, registrationNumber, numberOfDoors);
        this.maxRange = maxRange;
        this.batteryCapacity = batteryCapacity;
    }


  public int getBatteryCapacityKWh() {
  return batteryCapacity;
  }
  public int getMaxRangeKm() {
  return maxRange;
  }
  public float getWhPrKm() {
  return ((float) getBatteryCapacityKWh() /getMaxRangeKm()*1000);
  }

      @Override
      public int getRegistrationFee() {
          int kmPrLitre = (int)(100/(getWhPrKm()/91.25));
          int registrationFee = 0;
          if (kmPrLitre >= 20) {
              registrationFee += 330;
          }
          else if (kmPrLitre >= 15) {
              registrationFee += 1050;
          }
          else if (kmPrLitre >= 10) {
              registrationFee += 2340;
          }
          else if (kmPrLitre >= 5) {
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
