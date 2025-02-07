import java.util.Date;

public class DatePrinter {
    public static void main(String[] args){
        long[] elapsedTimes = {10_000L, 100_000L, 1_000_000L, 10_000_000, 100_000_000_0L, 100_000_000_00L, 100_000_000_000L };

        for(long elapseTime: elapsedTimes){
            Date date = new Date(elapseTime);
            System.out.println("Elapsed Time: " + elapseTime + ", Date: " + date);
        }
    }
}
