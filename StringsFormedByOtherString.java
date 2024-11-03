//Given a dictionary (list of words) and a word,
//    return an array of strings that can be formed from the given word.
//    [Every letter in the input word can occur only once in the word to be returned].
//
//Examples:
//    String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
//    String input = "abcd";
//    // Return {"abcd", "bcad"}
//
//    String[] dict =  {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
//    String input = "caab";
//    // Return {"acab"}

import java.util.ArrayList;
import java.util.List;

public class StringsFormedByOtherString {

    public static List<String> getSimilarWord(String[] dict, String input){
        List<String> ans = new ArrayList<>();
       char[] inputfreq = frequencyArray(input);
       for(int i=0;i< dict.length;i++){
           String word = dict[i];
           char[] wordfreq = frequencyArray(word);
           if (checkIfCanForm(wordfreq, inputfreq)==true){
               ans.add(word);
           }
       }
       return ans;
    }

    private static char[] frequencyArray(String word){
        char[] freq = new char[26];
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            freq[ch-'a']++;
        }
        return freq;
    }

    private static boolean checkIfCanForm(char[] wordfreq, char[] inputfreq){
        for(int i=0;i<26;i++){
            if(wordfreq[i]!=inputfreq[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String[] dict = //{"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
                {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
        String input = //"abcd";
                "caab";
        System.out.println(getSimilarWord(dict, input));
    }
}
