//Find the median of two sorted arrays of different sizes.
//Example:
//arr1[] = {2, 3, 5, 8}
//arr2[] = {10, 12, 14, 16, 18, 20}
////Return 11 as the median
public class MedianOfTwoSortedArrays {

    public static double findMedian(int[] nums1, int[] nums2){
        int i=0;//
        int j=0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1+ n2;
        int idx1 = n/2;
        int idx2 = idx1-1;
        int idx1Val =-1;
        int idx2Val =-1;
        int count=0;

        while (i<n1 && j<n2) {
            if (nums1[i] < nums2[j]) {
                if (count == idx1) idx1Val = nums1[i];
                if (count == idx2) idx2Val = nums1[i];
                count++;
                i++;
            } else {
                if (count == idx1) idx1Val = nums2[j];
                if (count == idx2) idx2Val = nums2[j];
                count++;
                j++;
            }
        }
        while (i<n1){
                if (count == idx1) idx1Val = nums1[i];
                if (count == idx2) idx2Val = nums1[i];
                count++;
                i++;
        }

        while (j<n2){
                if(count == idx1) idx1Val = nums2[j];
                if(count == idx2) idx2Val = nums2[j];
                count++;
                j++;
        }
        if(n%2==1){
            return (double)  idx1Val;
        }
        else{
            return (double) (idx1Val+idx2Val)/2;
        }
    }

    public static void main(String[] args) {
        int[]nums1 = {2, 3, 5, 8}, nums2 = {10, 12, 14, 16, 18, 20};
        System.out.println(findMedian(nums1,nums2));
    }
}
