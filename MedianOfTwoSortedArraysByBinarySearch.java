public class MedianOfTwoSortedArraysByBinarySearch {

    public static double findMedian(int[]a, int[]b){
        int n1 = a.length;
        int n2= b.length;
        int n =n1+n2;
        int lefthalf = (n1+n2+1)/2;
        if(n1>n2) return findMedian(b,a);

        int low =0;
        int end = n1;

        while(low<=end){
            int mid1 = (low+end)/2;
            int mid2 = lefthalf - mid1;

            int l1 = (mid1>0)? a[mid1-1]: Integer.MIN_VALUE;
            int l2 = (mid2>0)? b[mid2-1]: Integer.MIN_VALUE;
            int r1 = (mid1<n1)? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2<n2)? b[mid2]: Integer.MAX_VALUE;

            if(l1<=r2 && l2<=r1){
                if(n%2==1){
                    return Math.max(l1,l2);
                }
                else{

                    return (double)(Math.max(l1,l2)+ Math.min(r1,r2))/2.0;
                }
            }
            else if(l1>r2){
                end = mid1-1;
            }
            else{
                low = mid1+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 8};
        int[] b = {10, 12, 14, 16, 18, 20};
        System.out.println(findMedian(a,b));
    }
}
