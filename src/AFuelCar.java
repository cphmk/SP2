public abstract class AFuelCar extends ACar {


        int kmPrLitre;


        AFuelCar(int numberOfDoors, String model, String make, int kmPrLitre, String registrationNumber ) {
            super(make, model, registrationNumber, numberOfDoors);
            this.kmPrLitre = kmPrLitre;
        }


        public abstract String getFuelType();

        public int getKmPrLitre() {
            return kmPrLitre;
        }


        @Override
        public String toString() {
            return super.toString() + ", km/l is " +  kmPrLitre + ", fueltype is " + getFuelType();
        }
    }


