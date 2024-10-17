//Given an array of integers,
//    sort it in a wave form.
//    [ The order of elements in a wave form:
//       arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= ….. ]
//
//Example:
//    int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
//    Answer : arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR {20, 5, 10, 2, 80, 6, 100, 3}
public class SortInWaveForm {

    public static void sortInWave(int[] arr){

        for(int i=0;i< arr.length-1;i++){
            if(i%2==0){
                if(arr[i]<arr[i+1]){
                    swap(i,i+1, arr);
                }
            }
            else {
                if(arr[i]>arr[i+1]){
                    swap(i,i+1,arr);
                }
            }
        }
    }

    private static void swap(int i, int i1, int[]arr) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        sortInWave(arr);
        for(int each : arr){
            System.out.print(each+" ");
        }
    }
}
