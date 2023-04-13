public class ParkedCar {
    private String makeOfCar, modelOfCar, colorOfCar, carPlate;
    private int minutesParked;


    public ParkedCar(String modelOfCar, String makeOfCar, String colorOfCar, String carPlate, int minutesParked) {
        this.modelOfCar = modelOfCar;
        this.makeOfCar = makeOfCar;
        this.colorOfCar = colorOfCar;
        this.carPlate = carPlate;
        this.minutesParked = minutesParked;
    }

    public void setMake(String makeOfCar) {
        this.makeOfCar = makeOfCar;
    }
    public void setModel(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }
    public void setColor(String colorOfCar) {
        this.colorOfCar = colorOfCar;
    }
    public void setPlate(String carplate) {
        this.carPlate = carplate;
    }
    public void setMinutes(int minutesParked) {
        this.minutesParked = minutesParked;
    }

    public String getMake() {
        return makeOfCar;
    }
    public String getModel() {
        return modelOfCar;
    }
    public String getColor() {

        return colorOfCar;
    }
    public String getCarPlate() {
        return carPlate;
    }
    public int getMinutes() {
        return minutesParked;
    }
    
    // public void copyValue() {
        
    // }
    // public String toString(int minutesParked) {
    //     String minuteString = toString(minutesParked);
    //     return minuteString;
    // }
    
}
