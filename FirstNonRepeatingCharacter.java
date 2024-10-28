import java.util.Arrays;
import java.util.*;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeating(String str) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return str.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String str1 = "abbacd";// ans should be c
        System.out.println(findFirstNonRepeating(str1));
    }
}
