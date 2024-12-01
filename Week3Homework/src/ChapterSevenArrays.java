import java.util.Scanner;

public class ChapterSevenArrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        int numOfStudents = scanner.nextInt();
        System.out.println("Enter Points: ");
        int pointsOfStudents = scanner.nextInt();

    }
        void maxPoint(int[] points){
            int x = 0;
            for(int i = 0; i < points.length; i++){
                if(points[i] > points[i + 1]){
                    x = points[i];
                }  else {
                    x = points[i + 1];
                }
            }
            System.out.println(x);
        }
}
