import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();

        System.out.println("Welcome to the Florida Speed Informant System.");

        System.out.println(date);

        System.out.println("Driver Name: ");
        String name = scanner.nextLine();

        System.out.println("Age: ");
        String age = scanner.nextLine();

        System.out.println("Ethnicity and Sex: ");
        String ethicAnSex = scanner.nextLine();

        System.out.println("Hair Color: ");
        String hairColor = scanner.nextLine();

        System.out.println("Date of Birth: ");
        String DOB = scanner.nextLine();

        System.out.println("Height: ");
        String height = scanner.nextLine();

        System.out.println("Weight: ");
        int weight = scanner.nextInt();

        System.out.println("Location this took place: ");
        String locationOfSpeeding = scanner.nextLine();
        locationOfSpeeding.toUpperCase();
        scanner.nextLine().toUpperCase();

        System.out.println("Year of vehicle, Make, Body Style, Color: ");
        String yearMBC = scanner.nextLine();

        System.out.println("Is this a commercial vehicle:");
        String commercialVehicle = scanner.nextLine().toUpperCase();
        boolean setCommercialVeh = Boolean.parseBoolean(commercialVehicle);

        System.out.println("Area Speed Limit: ");
        short speedLimit = scanner.nextShort();

        System.out.println("Vehicle Speed: ");
        short vehicleSpeed = scanner.nextShort();

        System.out.println("(True or False) this took place in a School or Construction Zone: ");
        boolean doubleFine = scanner.nextBoolean();

        int mphOverLimit = (vehicleSpeed - speedLimit);

        GetFine getFine = new GetFine();
        getFine.fineTotal(mphOverLimit, doubleFine);
    }
}
