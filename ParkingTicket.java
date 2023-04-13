public class ParkingTicket {
    private String model;
    private String make;
    private String color;
    private String license;
    private String officerName;
    private int officerBadge;
    private int illegalMin;
    private int fine;
    
    public ParkingTicket(ParkedCar car, PoliceOfficer officer, int illegalMin, int fine){
        this.model = car.getModel();
        this.make = car.getMake();
        this.color = car.getColor();
        this.license = car.getCarPlate();
        this.officerName = officer.getOfficer();
        this.officerBadge = officer.getBadge();
        this.illegalMin = illegalMin;
        this.fine = fine;
    }

    
    public String getModel() {
        return model;
    }
    
    
    public String getMake() {
        return make;
    }
    
    
    public String getColor() {
        return color;
    }
    
    
    public String getLicense() {
        return license;
    }
    
    
    public String getOfficerName() {
        return officerName;
    }
    
    
    public int getOfficerBadge() {
        return officerBadge;
    }
    
    
    public int getIllegalMin() {
        return illegalMin;
    }
    
    
    public int getFine() {
        return fine;
    }
}
