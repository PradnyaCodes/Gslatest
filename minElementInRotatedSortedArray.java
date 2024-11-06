public class minElementInRotatedSortedArray {

    public static int getmin(int[] arr){

        int start=0;
        int end=arr.length-1;

        int ans=Integer.MAX_VALUE;
        if (arr[start] < arr[end]) {
            return arr[start];
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[start]==arr[mid] && arr[end]==arr[mid]){ // 5 3 2 5 5 5 5
                ans = Math.min(ans,arr[mid]);
                start++;
                end--;

            }
            else if(arr[mid]>arr[end]){   // 4 5 7 8 1 2 3
                ans= Math.min(ans,arr[mid]);
                start=mid+1;
            }
            else {
                ans= Math.min(ans,arr[mid]); // 7 8 9 1 2 3 4
                end=mid-1;
                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {7, 8 ,9, 1 ,2 ,3 ,4};
        System.out.println(getmin(arr));


    }
}

