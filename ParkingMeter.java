public class ParkingMeter {
    
    private int purchasedMin;

    public ParkingMeter(int purchasedMin) {
        this.purchasedMin = purchasedMin;
    }

    public void setMinutes(int purchasedMin) {
        this.purchasedMin = purchasedMin;
    }
    public int getMinutes() {
        return purchasedMin;
    }
}
