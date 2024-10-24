public class LongestSubstringOfSameChar {


    public static void main(String[] args) {

        String s = "aabbbbCaaaaaaCddd";

        int maxlength = 0;
        int index=0;
        for (int i = 0; i < s.length(); i++) {
            int length = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                length++;
                i++;
            }
            if (length > maxlength) {
                maxlength = length;
                index=i-maxlength+1;
            }
        }
        System.out.println("length of longest substring"+" "+maxlength);
        System.out.println("longest substring "+s.substring(index,index+maxlength));
    }
}
