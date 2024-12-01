import java.sql.SQLOutput;
import java.util.Scanner;

public class ChapterFiveLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // 5.1
//        int[] arr1 = { 1, 2, 3, -1, 0};
//        float sum = 0;
//        float count = 0;
//        for (int i = 0; i < arr1.length; i++){
//            sum += arr1[i];
//            if(arr1[i] != 0){
//                count++;
//            }
//        }
//        System.out.println("Sum = " + sum);
//        System.out.println("Average = " + sum / count );

        // 5.3
//        System.out.println("Kilogram \t Pound");
//        for(int i1 = 1; i1 < 11; i1++){
//            System.out.println(i1 + "\t\t" + String.format("%.2f",i1 * 2.2));
//        }
//
//        // 5.4
//        System.out.println("Mil \t\t KM");
//        for(int i2 = 1; i2 <= 10; i2++){
//            System.out.println(i2 + "\t\t" + String.format("%.2f", i2 * 1.609));
//        }

        // 5.5
//        System.out.println("KG \t\t Pound \t | Pound \t\t KG");
//        int i3 = 1;
//        int j1 = 20;
//        while(i3 < 200 && j1 < 520){
//            System.out.println(i3 + "\t\t" + String.format("%.2f", i3 * 2.2) + "\t\t" +
//                                j1 + "\t\t" + String.format("%.2f", j1 / 2.2));
//            i3++;
//            j1+=5;
//        }

        //5.6
//        int cost = 10_000;
//        int x = 0;
//        for (int i = 1; i <= 10; i++){
//            x = cost * 5 / 100; // next year cost
//            cost = cost + x;
//        }
//        System.out.println(cost); // prints cost at 10 year
//        int costAt10Year = cost;
//        int y = 0;
//        int sum = 0;
//        for (int j = 1; j <= 4; j++){
//            y = costAt10Year * 5 / 100;
//            costAt10Year = costAt10Year + y;
//            sum += costAt10Year;
//        }
//        System.out.println("Cost after 10 year 4 years long course is : " + sum );

        // 5.7
//        int x1 = 100;
//        int count = 0;
//        while (x1 < 1000) {
//            if (x1 % 5 == 0 && x1 % 6 == 0) {
//                System.out.print(x1 + " ");
//                count++;
//                if (count % 10 == 0) {
//                    System.out.println();
//                }
//            }
//            x1++;
//        }

         //5.11
//        int x2 = 100;
//        int counter = 0;
//        while (x2 < 200) {
//            if (x2 % 5 == 0 ^ x2 % 6 == 0) {
//                System.out.print(x2 + " ");
//                counter++;
//                if (counter % 10 == 0) {
//                    System.out.println();
//                }
//            }
//            x2++;
//        }

        // 5.12 - 5.13
        int n = 1;
//        while(n * n < 12_000){
//            n++;
//        }
//        System.out.println(n);

//        while(n * n * n < 12_000){
//            n++;
//        }
//        System.out.println(n - 1);

        // 5.14
    }
}
