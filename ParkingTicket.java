public class ParkingTicket {
    //string objects to reference car objects
    private String model;
    private String make;
    private String color;
    private String license;
    private String officerName;
    private int officerBadge;

    //strings to calculate
    private static int fine;
    private static int minutesParked;
    private static int purchasedMin;

    private final static int FIRST_HR_FINE = 25;
    private final static int HOUR = 60;
    private final static int HRS_AFTER_FINE = 10;

    private static String issuedTicket = "";

    public ParkingTicket(ParkedCar car, PoliceOfficer officer, int purchasedMin){
        this.model = car.getModel();
        this.make = car.getMake();
        this.color = car.getColor();
        this.license = car.getCarPlate();
        this.officerName = officer.getOfficer();
        this.officerBadge = officer.getBadge();
        ParkingTicket.purchasedMin = purchasedMin;
        ParkingTicket.minutesParked = car.getMinutes();
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
    public static int getPurchasedMin() {
        return purchasedMin;
    }
    public static int calculateFine() {
        double excessHours = 0.0;
        int illegalMin = 0;
            illegalMin = minutesParked - purchasedMin;
            fine = FIRST_HR_FINE;
            excessHours = Math.ceil((double)illegalMin/HOUR);
            fine = ((int)excessHours * HRS_AFTER_FINE) + FIRST_HR_FINE;
            System.out.println(excessHours+" ");
        return fine;
    }
    public static String toString(ParkedCar vehicle, PoliceOfficer officer, boolean violation) {
        if(violation == true) {
            ParkingTicket.calculateFine();
            issuedTicket = "Make: "+vehicle.getMake()+"\n"+
                    "Model: "+vehicle.getModel()+"\n"+
                    "Color: "+vehicle.getColor()+"\n"+
                    "Issued License Plate: "+vehicle.getCarPlate()+"\n\n"+
                    "Citation/Fine: $"+fine+"\n"+
                    "'Ticket Issued By' Officer "+officer.getOfficer()+"\n"+
                    "Officer Badge: "+officer.getBadge();
        }
        else{
            issuedTicket = "No ticket will be issued at this time.";
        }
        return issuedTicket;
    }      
    // public int getFine() {
    //     return fine;
    // }
}
