import java.util.Random;
import java.util.Scanner;

public class ChapterThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 3.1
//        System.out.println("Enter: a b c:");
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//
//        double discriminant = Math.pow(b, 2) - 4 * a * c;
//
//        if(discriminant < 0){
//            System.out.println("The equation has no real roots");
//        } else if (discriminant > 0){
//            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
//            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
//            System.out.println("Equation has 2 roots: " + r1 + " " + r2);
//        } else {
//            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
//            System.out.println("Equation root is : " + r1);
//        }
//        scanner.close();


        // 3.4
//        Random random = new Random();
//        int randomNumber = random.nextInt(12) + 1;
//        switch (randomNumber){
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//        }

        //3.5
        System.out.println("Write number between 0-Sunday to 6 - Saturday:");
        int todayNumber = scanner.nextInt();
        String dayName;

        System.out.println("Write number of days elapsed: ");
        int numberOfDaysElapsed = scanner.nextInt();

        switch (todayNumber){
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
        }



        // 3.12
//        int count = 11;
//        boolean newLine
//                = count % 10 == 0;
//        System.out.println(newLine);

        // 3.19 a
//        int num = 49;
//        if(num > 1 && num < 100){
//            System.out.println(true);
//        }

        // b
//        int num1 = -50;
//        if(num1 > 1 && num1 < 100 || num1 < 0){
//            System.out.println(true);
//        }
        // 3.20
//        int x = 1;
//        if ((x - 5) < 4.5 || (x - 5) > 4.5){}

        // 3.25
//        int age = 14;
//        System.out.println((age > 13) && (age < 18));

        // 3.26
//        double weight = scanner.nextDouble();
//        double height = scanner.nextDouble();
//        System.out.println((weight > 50) || (height > 60));

        // 3.26
//        System.out.println((weight > 50) &&  (height > 60));

        // 3.30
//        int x = 3;
//        int y = 3;
//        switch (x + 3) {
//            case 6:
//                y = 1;
//            default:
//                y += 1; }
//        System.out.println(y);
// output will be 2 because we don't have break after 1 case

//        if (x + 3 == 6)
//            y = 1;
//        else
//            y += 1;

        // 3.32
//        int day = 4;
//        switch (day) {
//            case 0:
//                System.out.println("Sunday");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Thuesday");
//                break;
//            case 3:
//                System.out.println("Wednsday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("This day doesn't exist");
//        }

        // 3.34
//        int age = 18;
//        System.out.println(age >= 16 ? 20 : 10);
//
//        // 3.35 a
//        int income = 11000;
//        if (income > 10000){
//            income *= 0.2;
//        } else {
//            income *= 0.17 + 1000;
//        }
    }
}


