//import java.util.Scanner;

public class ParkingTicketSimulator {
    public static void main(String args[]) {
        String modelOfCar = "nissan", makeOfCar = "altima", colorOfCar = "blue", carPlate = "EY67354";
        int minutesParked = 825;
        int purchasedMin = 545; 
        String policeName = "Michael Vick";
        int policeBadge = 59784;
        ParkedCar car = new ParkedCar(modelOfCar, makeOfCar, colorOfCar, carPlate, minutesParked);
        PoliceOfficer police = new PoliceOfficer(policeBadge, policeName);
        ParkingTicket ticketInfo = new ParkingTicket(car, police, purchasedMin);

        //System.out.println(ticketInfo.getOfficerBadge());
        int excessMinutes = ticketInfo.calculateMinutes();
        System.out.println("Excess minutes: " + excessMinutes);

    }
}
