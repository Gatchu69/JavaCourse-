import java.util.Scanner;

public class ChapterThree {
    public static void main(String[] args) {
        // 3.4
//        int y = 1;
//        int x;
//        if (y > 0 ){
//            System.out.println(x = 1);
//        }
        // 3.5
//        int pay = 100;
//        int score = 99;
//        if (score > 90){
//            pay += 100 * 3 / 100;
//            System.out.println(pay);
//        }

        // 3.6
//        if (score > 90){
//            pay += 100 * 3 / 100;
//        } else {
//            pay += 100 * 1 / 100;
//        }

        // 3.7  a - even, b - odd

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
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println((weight > 50) || (height > 60));

        // 3.26
//        System.out.println((weight > 50) &&  (height > 60));

        // 3.30
        int x = 3;
        int y = 3;
        switch (x + 3) {
            case 6:
                y = 1;
            default:
                y += 1; }
        System.out.println(y);
// output will be 2 because we don't have break after 1 case

//        if (x + 3 == 6)
//            y = 1;
//        else
//            y += 1;

        // 3.32
        int day = 4;
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thuesday");
                break;
            case 3:
                System.out.println("Wednsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("This day doesn't exist");
        }

        // 3.34
        int age = 18;
        System.out.println(age >= 16 ? 20 : 10);

        // 3.35 a
        int income = 11000;
        if (income > 10000){
            income *= 0.2;
        } else {
            income *= 0.17 + 1000;
        }
    }
}


