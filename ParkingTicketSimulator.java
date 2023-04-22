//import java.util.Scanner;

public class ParkingTicketSimulator {
    public static void main(String args[]) {
        String [] [] vehicle_information = {{"nissan", "altima", "white-gray", "TRUMP24"},{"toyota", "corolla", "dark blue", "TUF5602"},{"dodge", "charger", "red and gold", "EY67354"}}; //makeOfCar = {"altima"}, colorOfCar = {"blue"}, carPlate = "EY67354";
        int[] minutesParked = {1001, 482, 65};
        int[] purchasedMin = {1000, 543, 60}; 
        String[] policeName = {"Michael Vick", "Sarai McKenneth Bartley", "Leroy Jenkis"};
        int[] policeBadge = {597, 802, 420};

        //ParkedCar car = new ParkedCar(modelOfCar, makeOfCar, colorOfCar, carPlate, minutesParked);
        PoliceOfficer police1 = new PoliceOfficer(policeBadge[0], policeName[0]);
        ParkingTicket car1 = new ParkingTicket(vehicle_information[0][0], vehicle_information[0][1], vehicle_information[0][2], vehicle_information[0][3], minutesParked[0], police1, purchasedMin[0]);
        // PoliceOfficer police2 = new PoliceOfficer(policeBadge[1], policeName[1]);
        // ParkingTicket car2 = new ParkingTicket(vehicle_information[1][0], vehicle_information[1][1], vehicle_information[1][2], vehicle_information[1][3], minutesParked[1], police2, purchasedMin[1]);
        // PoliceOfficer police3 = new PoliceOfficer(policeBadge[0], policeName[0]);
        // ParkingTicket car3 = new ParkingTicket(vehicle_information[2][0], vehicle_information[2][1], vehicle_information[2][2], vehicle_information[2][3], minutesParked[2], police3, purchasedMin[2]);

        //System.out.println(ticketInfo.getOfficerBadge());
        String theFinalVerdict1 = PoliceOfficer.issueTicket(car1, police1);
        // String theFinalVerdict2 = PoliceOfficer.issueTicket(car2, police2);
        // String theFinalVerdict3 = PoliceOfficer.issueTicket(car3, police3);

        //System.out.println("First ticket:");
        System.out.println(theFinalVerdict1);
        // System.out.println("\nFirst ticket:");
        // System.out.println(theFinalVerdict2);
        // System.out.println("\nFirst ticket:");
        // System.out.println(theFinalVerdict3);


    }
}
