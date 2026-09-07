import java.util.Scanner;
public class Activity2 {
    public void ticketing_system(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n====CINEMA TICKET SYSTEM====");
        System.out.print("Select Format (1: REGULAR, 2: 3D, 3: IMAX) :");
        int format = sc.nextInt();
        System.out.print("Enter Screening Hour ( 24-Hour Format, e.g., 18) : ");
        int hour = sc.nextInt();

        String formatName = "";
        double price = 0.00;

        switch (format){
            case 1:
                formatName = "REGULAR";
                price = 350.00;
                break;

            case 2:
                formatName = "3D";
                price = 400.00;
                break;

            case 3:
                formatName = "IMAX";
                price = 450.00;
                break;
        }

        double peakHoursFee = (hour >= 17 && hour <= 20)? 50.00 : 0.00;
        double totalcost = price + peakHoursFee;

        System.out.println("\n-----------TICKET BREAKDOWN------------");
        System.out.printf("Screening Format: %s\n", formatName);
        System.out.printf("Base Ticket Price: PHP %.2f\n",  price);
        System.out.printf("Peak Hour Fee: PHP %.2f\n",  peakHoursFee);
        System.out.println("---------------------------------------");
        System.out.printf("TOTAL TICKET COST:PHP %.2f\n", totalcost);
        System.out.println("STATUS         SEAT RESERVED");
    }
}
