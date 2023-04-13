public class ParkingTicket {
    //string objects to reference car objects
    private String model;
    private String make;
    private String color;
    private String license;
    private String officerName;
    private int officerBadge;

    //strings to calculate
    private int fine;
    private int minutesParked;
    private int purchasedMin;

    private final int FIRST_HR_FINE = 25;
    private final int HOUR = 60;
    private final int HRS_AFTER_FINE = 10;

    public ParkingTicket(ParkedCar car, PoliceOfficer officer, int purchasedMin){
        this.model = car.getModel();
        this.make = car.getMake();
        this.color = car.getColor();
        this.license = car.getCarPlate();
        this.officerName = officer.getOfficer();
        this.officerBadge = officer.getBadge();
        this.purchasedMin = purchasedMin;
        this.minutesParked = car.getMinutes();
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
    public int calculateMinutes() {
        double excessHours = 0.0;
        int illegalMin = 0;
            illegalMin = minutesParked - purchasedMin;
            fine = FIRST_HR_FINE;
            excessHours = Math.ceil((double)illegalMin/HOUR);
            fine = ((int)excessHours * HRS_AFTER_FINE) + FIRST_HR_FINE;


        return fine;
    }      
    // public int getFine() {
    //     return fine;
    // }
}
