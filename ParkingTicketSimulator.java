//import java.util.Scanner;

public class ParkingTicketSimulator {
    public static void main(String args[]) {
        String modelOfCar = "nissan", makeOfCar = "altima", colorOfCar = "blue", carPlate = "EY67354";
        int minutesParked = 180;
        int purchasedMin = 60; 
        String policeName = "Michael Vick";
        int policeBadge = 59784;

        //ParkedCar car = new ParkedCar(modelOfCar, makeOfCar, colorOfCar, carPlate, minutesParked);
        PoliceOfficer police = new PoliceOfficer(policeBadge, policeName);
        ParkingTicket car = new ParkingTicket(modelOfCar, makeOfCar, colorOfCar, carPlate, minutesParked, police, purchasedMin);

        //System.out.println(ticketInfo.getOfficerBadge());
        String theFinalVerdict = PoliceOfficer.issueTicket(car, police);
        System.out.println(theFinalVerdict);

    }
}
