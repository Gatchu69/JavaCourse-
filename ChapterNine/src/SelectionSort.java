public class SelectionSort {
    public static void selectionSort(double[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            double temp = arr[i];
            arr[i] = minIndex;
            arr[minIndex] = temp;
        }
    }
}
