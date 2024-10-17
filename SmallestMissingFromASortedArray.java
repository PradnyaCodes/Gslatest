public class SmallestMissingFromASortedArray {

    int smallestMissing(int [] arr){
        if(arr[0]!=0){
            return 0;
        }

        if(arr[arr.length-1]==arr.length-1){
            return arr.length;
        }

        return findFirstMissing(arr,0,arr.length-1);
    }

    int findFirstMissing(int [] arr, int start, int end){

        while(start<end){
            int mid = (start+end)/2;

            if(arr[mid]!=mid){

                return findFirstMissing(arr,start,mid);
            }
            else{
                return findFirstMissing(arr, mid+1, end);
            }
        }
        return start;

    }
    public static void main(String[] args) {
        SmallestMissingFromASortedArray s = new SmallestMissingFromASortedArray();

        int arr[] = {0, 1, 2, 4,};

        System.out.println(s.smallestMissing(arr));
    }
}
