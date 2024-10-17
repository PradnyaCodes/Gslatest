//Convert a string as given in the format below:
//Example:
//aabbb into a2b3
//aaaa into a4
//a into a1
public class RunLength {
    public static void main(String[] args) {

        String str ="aaabbbccaa";

        for(int i=0;i<str.length();i++){
            int count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            System.out.print(str.charAt(i)+""+count);

        }

    }
}
