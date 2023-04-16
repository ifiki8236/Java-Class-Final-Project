public class PoliceOfficer {
    private String officerName;
    private int officerBadge;
    private static String theTicket;
    private static boolean violation = false;
    
    public PoliceOfficer(int officerBadge, String officerName) {
        this.officerBadge = officerBadge;
        this.officerName = officerName;
    }
    public void setOfficer(String officerName) {
        this.officerName = officerName;
    }
    public void setBadge(int officerBadge) {
        this.officerBadge = officerBadge;
    }
    public String getOfficer() {
        return officerName;
    }
    public int getBadge() {
        return officerBadge;
    }
    public static String issueTicket(ParkedCar vehicle, PoliceOfficer officer) {
        if(vehicle.getMinutes() > ParkingTicket.getPurchasedMin()) {
            violation = true;
        }
        theTicket = ParkingTicket.toString(vehicle, officer, violation);
        return theTicket;
    }
}
