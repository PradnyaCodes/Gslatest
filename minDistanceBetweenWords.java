
//Given a sentence/phrase and two words,
//    return the minimum distance between the words.
//
//Example:
//    String str = “the quick the brown quick brown the frog”
//    String word1 = “quick”
//    String word2 = "frog"
//
//    //Return 2
public class minDistanceBetweenWords {

    public static int findMinDistance(String str, String word1, String word2){
        String inp[] = str.split(" ");
        int n = inp.length;
        int start =0;
        int end = 0;
        int prev =-1;
        int minlen = Integer.MAX_VALUE;

        while (start<n){
            if(inp[start].equals(word1)|| inp[start].equals(word2)) {
                 prev = start;
                 break;
            }
            start++;
        }
        end = prev+1;
        while (end<n){
            if(inp[end].equals(word1)|| inp[end].equals(word2)){
                if(!inp[prev].equals(inp[end])){
                    minlen = Math.min(end -prev-1,minlen);
                }
                else{
                    prev = end;
                }
            }
            end++;
        }
        return minlen;


    }

    public static void main(String[] args) {
        String str = "the quick the brown brown the";
        String word1 = "quick";
        String word2 = "frog";
        System.out.println(findMinDistance(str,word1,word2));
    }
}
