import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args){
        int[] numbers = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }
    }


}
