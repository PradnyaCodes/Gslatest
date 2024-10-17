//Prefix Search
//    Given a document and a prefix, return all the words starting with the prefix.
//Example:
//Say the document is a string of words,
//    String[] arr = {"apple", "applet", "bread", "aper"};
//    String prefix = "app";
   // Return apple, applet
import java.util.ArrayList;

public class WordsStartingWithPrefix {

    public static ArrayList<String> findwords(String[] arr, String word){
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<word.length();j++){

                if(arr[i].length()<word.length()){
                    break;
                }
                if(arr[i].charAt(j)!=word.charAt(j)){
                    break;
                }
                else if(j==word.length()-1)
                    list.add(arr[i]);
            }
        }
        return list;

    }
    public static void main(String[] args) {
        String[] arr = {"appe", "applet", "bread", "aper"};
        String word = "app";
        System.out.println(findwords(arr, word));


    }
}
