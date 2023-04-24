import java.util.Scanner;

public class ParkingTicketSimulator {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String[] carInfo = new String[4];
        String nameOfOfficer = "";
        int parkedMinutes = 0;
        int boughtMinutes = 0;
        int theBadge = 0;

        System.out.print("Enter Make: ");
        carInfo[0] = keyboard.nextLine();

        System.out.print("Enter Model: ");
        carInfo[1] = keyboard.nextLine();

        System.out.print("Enter Color: ");
        carInfo[2] = keyboard.nextLine();

        System.out.print("Enter License Plate: ");
        carInfo[3] = keyboard.nextLine();

        System.out.print("Enter The Minutes Purchased: ");
        boughtMinutes = keyboard.nextInt();

        System.out.print("How Long Did The Driver Stay(in minutes): ");
        parkedMinutes = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Name Of The Deputy On Scene: ");
        nameOfOfficer = keyboard.nextLine();

        System.out.print("Deputy Badge Number: ");
        theBadge = keyboard.nextInt();

      
        PoliceOfficer deputyInfo = new PoliceOfficer(theBadge, nameOfOfficer);
        ParkingTicket civillianVehicle = new ParkingTicket(carInfo[0], carInfo[1],  carInfo[2], carInfo[3], parkedMinutes, deputyInfo, boughtMinutes);
       
        String theFinalVerdict1 = PoliceOfficer.issueTicket(civillianVehicle, deputyInfo);
        
        System.out.println(theFinalVerdict1);
        
        keyboard.close();
    }
}
