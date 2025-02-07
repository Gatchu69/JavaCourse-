public class StopWatchTest {
    public static void main(String[] args){
        double[] numbers = new double[100000];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Math.random() * 100000;
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        SelectionSort.selectionSort(numbers);

        stopWatch.end();

        long elapsed = stopWatch.getElapsedTime();

        System.out.println("It take " + elapsed + " in milliseconds");

    }
}
