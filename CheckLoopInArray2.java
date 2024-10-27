import java.util.*;

public class CheckLoopInArray2 {

    public static int findLoop(int[]arr){
        Set<Integer> visited = new HashSet<>();
        int count=0;
        int curr=0;
        int n = arr.length;
        while (true){
            if(visited.contains(curr)){
                return count;
            }
            if(arr[curr]==0 || curr == (curr + arr[curr])%n){
                return 0;
            }

            visited.add(curr);
            count++;

            curr = (curr+arr[curr])%n;
            if(curr<0){
                curr = curr + n;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2 };
        System.out.println(findLoop(arr));
    }
}
