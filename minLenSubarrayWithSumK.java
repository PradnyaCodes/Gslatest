import java.util.*;
//Given an array of integers and a sum K,
//    return the length of the shortest sub-array which matches the given sum. If it doesn't exist, return -1.
//    [Even a single integer can be considered as a sum.]
//
//Examples:
//    int[] arr = {2, 4, 6, 10, 2, 1}, K = 12        // Return 2
//
//    int[] arr = {5, 8, 50, 4}, K = 50                // Return 50 (A single integer may be considered as a sum)
public class minLenSubarrayWithSumK {

    public static int findMinLen(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int currsum = 0;
        int start = 0;
        int end = 0;
        int ms = 0;
        int me = arr.length - 1;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (target - currsum==0) {
                start = 0;
                end = i;
                int l = end - start + 1;
                if (l < me - ms + 1) {
                    ms = start;
                    me = end;
                }
            }

            if (map.containsKey(currsum - target)) {
                start = map.get(currsum - target) + 1;
                end = i;
                int l = end - start + 1;
                if (l < me - ms + 1) {
                    ms = start;
                    me = end;
                }
            }
            map.put(currsum, i);

        }
       // System.out.println(ms+" , "+me);
        return me-ms+1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 2, 1};
        System.out.println(findMinLen(arr,12));

    }
}
