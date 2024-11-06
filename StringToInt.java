import java.util.regex.Pattern;
//Implement your custom atoi function in Java.
//    Given a string, you have to convert into integer.
//    The input string may contain alphabets and special characters alongside numbers (both negative and positive).
//
//Examples:
//    String str1 = "123";     //Return 123 (in integer format)
//    String str2 = "-123";    //Return -123
//    String str3 = "1a23";   //Return -1 (Invalid entry)
public class StringToInt {

    public static void main(String[] args) {
        String s = "-12233";
        int res=0;
        if(s.matches("(-)[0-9]*|[0-9]*")){
            res = Integer.parseInt(s);
            System.out.println(res);
        }
        else{
            System.out.println("Invalid Entry");
        }
    }
}
