public class ParkingTicket extends ParkedCar{
    
    private String officerName;
    private int officerBadge;

    private static int fine;
    private static int minutesParked;
    private static int purchasedMin;

    private final static int FIRST_HR_FINE = 25;
    private final static int HOUR = 60;
    private final static int HRS_AFTER_FINE = 10;

    private static String issuedTicket = "";

    public ParkingTicket(String modelOfCar, String makeOfCar, String colorOfCar, String carPlate, int minutesParked, PoliceOfficer officer, int purchasedMin) {
        super(modelOfCar, makeOfCar, colorOfCar, carPlate, minutesParked);
        this.officerName = officer.getOfficer();
        this.officerBadge = officer.getBadge();
        ParkingTicket.purchasedMin = purchasedMin;
        ParkingTicket.minutesParked = minutesParked;
    }
    
    public String getModel() {
        return modelOfCar;
    }
    public String getMake() {
        return makeOfCar;
    }
    public String getColor() {
        return colorOfCar;
    }    
    public String getLicense() {
        return carPlate;
    }    
    public String getOfficerName() {
        return officerName;
    }    
    public int getOfficerBadge() {
        return officerBadge;
    }
    public int getMinutesParked() {
        return minutesParked;
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
            if(excessHours != 1) {
                fine = ((int)excessHours * HRS_AFTER_FINE)+FIRST_HR_FINE;
            }
            //System.out.println(excessHours+" ");
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
    
}
