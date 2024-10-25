import java.util.Arrays;

public class WaveForm {

    public static void swap(int arr[],int x, int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void SortInWave(int arr[],int n){

// assume at even index we are going to store high part of a wave and at odde index we are going to store low part
        for(int i=0;i<n-1;i++){
            if(i%2==0){
                //swap if current index value is less than that of next
                if(arr[i]<arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
            else{
                //swap if current index value is greater than that of next
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        int n = arr.length;
        SortInWave(arr,n);
        for(int each : arr){
            System.out.print(each+" ");
        }

    }
}
