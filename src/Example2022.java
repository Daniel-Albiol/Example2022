import java.util.Scanner;
public class Example2022 {
    public static void main(String[] argv) {

        Scanner leap = new Scanner(System.in);

        // Enter the year
        System.out.print("Enter the year: ");
        int year = leap.nextInt();

        //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("The year " + year + " it is leap year");
        } else {
            System.out.println("The year" + year + " it is not leap year");
        }

    }
}
