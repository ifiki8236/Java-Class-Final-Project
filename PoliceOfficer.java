public class PoliceOfficer {
    private String officerName;
    private int officerBadge;
    
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
}
