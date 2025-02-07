public class ChapterSixMethods {
    public static void main(String[] args) {
        int numbersPerLine = 10;
        int totalNumber = 100;

        for (int i = 1; i <= totalNumber; i++){
            System.out.printf("%7d", getPentagonalNumber(i));

            if(i % numbersPerLine == 0){
                System.out.println();
            }
        }

    }
// 6.1
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;

    }
}
