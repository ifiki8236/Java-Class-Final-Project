public class ParkingMeter {
    
    private static int purchasedMin;

    public ParkingMeter(int purchasedMin) {
        ParkingMeter.purchasedMin = purchasedMin;
    }

    public void setMinutes(int purchasedMin) {
        ParkingMeter.purchasedMin = purchasedMin;
    }
    public int getMinutes() {
        return purchasedMin;
    }
}
