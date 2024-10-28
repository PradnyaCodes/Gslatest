public class FirstNonRepeating {

    public static char findfirstNonRepeatingCharacter(String s){
        char[] characters = new char[256];

        for(int i=0;i<s.length();i++){
            //System.out.println(s.charAt(i));
            characters[s.charAt(i)]++;
        }

        for(int i=0;i<s.length();i++){
            if(characters[s.charAt(i)]==1){
                return s.charAt(i);
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        String s = "abbaccdd";
        System.out.println(findfirstNonRepeatingCharacter(s));
    }
}
