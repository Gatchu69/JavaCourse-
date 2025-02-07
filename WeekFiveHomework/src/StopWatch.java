import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime(){
        return  endTime - startTime;
    }

    public void printElapsedTime()
    {
        System.out.println("Start time: " + startTime);
        System.out.println("End time: " + endTime);
        System.out.println("Elapsed time: " + getElapsedTime() + " milliseconds");
    }
}
