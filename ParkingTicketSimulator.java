import java.util.Scanner;
    
public class ParkingTicketSimulator {

    public static int checkDataType(Scanner keyboard) {
        int numberInput = 0;
        while (keyboard.hasNext()) {
            if (keyboard.hasNextInt()) {
                numberInput = keyboard.nextInt();
                keyboard.nextLine();
                break;
            } else {
                System.out.println("Invalid input. Numbers Only.");
                keyboard.nextLine();
                System.out.print("Try Again: ");
            }
        }
        return numberInput;
    }
    
    public static void checkLen(String[] carInfo, Scanner keyboard) {
        while (true) {
            carInfo[3] = keyboard.nextLine();
            if (carInfo[3].length() == 7) {
                break;
            } else {
                System.out.print("License Plate Must Be 7 Characters Long: ");
            }
        }
    }
    
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
        checkLen(carInfo, keyboard);

        System.out.print("Enter The Minutes Purchased: ");
        boughtMinutes = checkDataType(keyboard);

        System.out.print("How Long Did The Driver Stay(in minutes): ");
        parkedMinutes = checkDataType(keyboard);

        System.out.print("Name Of The Deputy On Scene: ");
        nameOfOfficer = keyboard.nextLine();

        System.out.print("Deputy Badge Number: ");
        theBadge = checkDataType(keyboard);
      
        PoliceOfficer deputyInfo = new PoliceOfficer(theBadge, nameOfOfficer);
        ParkingMeter purchasedMin = new ParkingMeter(boughtMinutes);
        ParkingTicket civillianVehicle = new ParkingTicket(carInfo[0], carInfo[1],  carInfo[2], carInfo[3], parkedMinutes, deputyInfo, purchasedMin);
       
        String theFinalVerdict = PoliceOfficer.issueTicket(civillianVehicle, deputyInfo, civillianVehicle);
        
        System.out.println("\nInfraction Outcome:"+theFinalVerdict);
        
        keyboard.close();
    }
}
