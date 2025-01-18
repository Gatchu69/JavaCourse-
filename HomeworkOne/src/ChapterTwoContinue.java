import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ChapterTwoContinue {
    public static void main(String[] main) {
        // 2.1
//        Scanner cels = new Scanner(System.in);
//        System.out.println("How many celsius ?");
//        double celsius = cels.nextDouble();
//        double farenhait = 9d / 5 * celsius + 32;
//        System.out.println(farenhait + " Farenhait");

        // 2.2
//        System.out.println("Radius = ");
//        double radius = cels.nextDouble();
//        System.out.println(" Length = ");
//        double length = cels.nextDouble();
//        double area = radius * radius * Math.PI;
//        double volume = area * length;
//        System.out.println(area + " is cilinder area");
//        System.out.println(volume + " is cilinder volume");

        // 2.3
//        System.out.println("How many feet ?  ");
//        double foot = cels.nextDouble();
//        double meter = foot * 0.305;
//        System.out.println(foot + " is equal to " +  meter + " meters");
        // 2.4
          Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter amount of pounds:");
//        double pounds = scanner.nextDouble();
//        System.out.println(pounds + " pounds is " + pounds * 0.454 + " kilograms");


        // 2.5
//        System.out.println("Subtotal: ");
//        double subtotal = cels.nextDouble();
//        System.out.println("gratuity: ");
//        double gratuityRate = cels.nextDouble();
//        double gratuity = subtotal * gratuityRate / 100;
//        double total = subtotal + gratuity;
//        System.out.println("The gratuity is " + gratuity + " and total is " + total);

        // 2.6
//        System.out.println("Choose the number: ");
//        int number = cels.nextInt();
//        if(number >= 0 && number <= 1000){
//            int sum = 0;
//            int z;
//            while (number > 0) {
//                z = number % 10;
//                sum += z;
//                number = number / 10;
//            }
//            System.out.println("Digit sum equals " + sum);
//        }

        // 2.7
//        int minutes = cels.nextInt();
//        int numberOfDays = minutes / (24 * 60);
//        int year = numberOfDays / 365;
//        System.out.println(minutes + " minutes is approximately " + year + " year and " + numberOfDays % 365 + "days");

//        // 2.8 !!!!?????!???!?!?!?!??!?!
//        int timeZoneOffset = scanner.nextInt();
//
//        long totalMilliseconds = System.currentTimeMillis();
//
//        long currentSecond = totalMilliseconds / 1000;
//
//        long totalMinutes = currentSecond / 60;
//
//        long currentMinute = totalMinutes % 60;
//
//        long totalHours = totalMinutes / 60;
//
//        long currentHour = totalHours % 24;
//
//        // 2. Adjust Hours based on offset
//        currentHour = (currentHour + timeZoneOffset) % 24;
//
//        //Handle cases where the hours go below zero by wrapping the hours
//        if(currentHour < 0) {
//            currentHour += 24;
//        }
//
//        System.out.println("Current time is " + currentHour + ":"
//                + currentMinute + ":" + currentSecond + " GMT" + timeZoneOffset);


        // 2.9
//        double v0 = cels.nextDouble();
//        double v1 = cels.nextDouble();
//        double t = cels.nextDouble();
//        double avvergeAcceleration = (v1 - v0) / t;
//        System.out.println(avvergeAcceleration);

        // 2.10
//        System.out.println("Enter quantity of water in Kilograms: ");
//        double waterWeight = cels.nextDouble();
//        System.out.println("Enter the initial temperature: ");
//        double startTemp = cels.nextDouble();
//        System.out.println("Enter the final temperature: ");
//        double finalTemp = cels.nextDouble();
//        double energy = waterWeight * (finalTemp - startTemp) * 4184;
//        System.out.println("The energy needed is: " + energy);

        // 2.12
//        System.out.print("Enter Speed and Acceleration: ");
//        double speed = cels.nextDouble();
//        double acceleration = cels.nextDouble();
//        double length = speed * speed / (2 * acceleration);
//        System.out.println(length + " meter is needed");

        // 2.13
//        System.out.println("Saving: ");
//        double money = cels.nextDouble();
//        double interestRate = 0.00417;
//        double q = money;
//        double x = 0;
//
//
//        for (int i = 1; i <= 6; i++){
//              x = q * (1 + interestRate);
//              q = money + x;
//
//        }
//        System.out.println(x);

        // 2.14
//        System.out.println("Enter weight in pounds: ");
//        double weight = cels.nextDouble();
//        System.out.println("Enter height in inches: ");
//        double height = cels.nextDouble();
//
//        double weightInKg = weight * 0.45359237;
//        double heightInCm = height * 0.0254;
//        double iBm = weightInKg / (heightInCm * heightInCm);
//        System.out.println(iBm);

        // 2.15
//        System.out.println("Point 1 (x1 y1): ");
//        double x1 = scanner.nextDouble();
//        double y1 = scanner.nextDouble();
//
//        System.out.println("Point 2 (x2 y2): ");
//        double x2 = scanner.nextDouble();
//        double y2 = scanner.nextDouble();
//
//        double x = Math.pow((x2 - x1), 2);
//        double y = Math.pow((y2 - y1), 2);
//        double distance = Math.sqrt(x + y);
//        System.out.println("Distance between two points is: " + distance);

        // 2.16
//        System.out.println("Enter side of Hexagon: ");
//        float hexagon = scanner.nextFloat();
//
//        double area = (3 * Math.sqrt(3) / 2 * Math.pow(hexagon, 2));
//        System.out.println(area);

        //2.18
//        System.out.printf("%-10s%-10s%-10s%n", "a", "b", "pow(a, b)");
//        System.out.printf("%-10d%-10d%-10d%n", 1, 2, (int) Math.pow(1, 2));
//        System.out.printf("%-10d%-10d%-10d%n", 3, 4, (int) Math.pow(3, 4));
//        System.out.printf("%-10d%-10d%-10d%n", 4, 5, (int) Math.pow(4, 5));
//        System.out.printf("%-10d%-10d%-10d%n", 5, 6, (int) Math.pow(5, 6));

        // 2.20
//        System.out.println("Enter balance and interest rate. For example 3 for 3%: ");
//        double balance = scanner.nextDouble();
//        double interestRate = scanner.nextDouble();
//        double interest = balance * (interestRate / 1200);
//        System.out.printf("Interest is %.5f%n", interest);

        //2.21
//        System.out.println("Write investment amount: ");
//        double investmentAmount = scanner.nextDouble();
//
//        System.out.println("Write annual interest rate: ");
//        double annualInterestRate = scanner.nextDouble();
//
//        System.out.println("Write number of years: ");
//        int numberOfYears = scanner.nextInt();
//
//        double futureInvestmentValue = investmentAmount * Math.pow(1 + annualInterestRate / 1200, numberOfYears * 12);
//        System.out.println(futureInvestmentValue);

        // 2.23
        System.out.println("Enter driving distance: ");
        double distance = scanner.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();
        System.out.println("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        double gallonsNeed = distance / milesPerGallon;
        double costOfTrip = gallonsNeed * pricePerGallon;
        System.out.println("The cost of driving is: " + costOfTrip);
    }
}
