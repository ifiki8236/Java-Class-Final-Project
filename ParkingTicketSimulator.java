//import java.util.Scanner;

public class ParkingTicketSimulator {
    public static void main(String args[]) {
        String modelOfCar = "nissan", makeOfCar = "altima", colorOfCar = "blue", carPlate = "EY67354";
        int minutesParked = 825;
        String policeName = "Michael Vick";
        int policeBadge = 59784;
        int illegalMin = 58;
        int fine = 95;
        ParkedCar car = new ParkedCar(modelOfCar, makeOfCar, colorOfCar, carPlate, minutesParked);
        PoliceOfficer police = new PoliceOfficer(policeBadge, policeName);
        ParkingTicket ticketInfo = new ParkingTicket(car, police, illegalMin, fine);

        System.out.println(ticketInfo.getOfficerBadge());
        System.out.println(ticketInfo.getOfficerName());

    }
}
