
import java.util.Scanner;

public class Activity1 {
    Scanner sc = new Scanner(System.in);

    public void userGreeting() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter birth year: ");
        int year = sc.nextInt();

        System.out.print("Enter gender: ");
        String gender = sc.next();

        System.out.println("--------------------------------------------");
        System.out.println("Hello " + name + "! Welcome to Java!");
        System.out.println("You were born in " + year + " and your gender is " + gender);
        System.out.println("--------------------------------------------");
    }
}
