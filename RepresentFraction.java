import java.util.*;
//Given two integers representing the numerator and denominator of a fraction,
//    return the fraction in string format.
//    [If the fractional part is repeating, enclose the repeating part in parentheses].
//
//Examples:
//    Numerator = 1, Denominator = 2
//    // Return "0.5"
//
//    Numerator = 1, Denominator = -2
//    // Return "-0.5"
//
//    Numerator = 50, Denominator = 22
//    // Return "2.(27)"  [Fractional part (27) is repeating, hence enclosed in paranthesis]
public class RepresentFraction {

    public static String result(int num, int den){
        int q = num/den;
        int r = num%den;
        StringBuilder sb = new StringBuilder();
        sb.append(q);
        if(r==0){

            return sb.toString();
        }

        else{
            Map<Integer,Integer> map = new HashMap<>();
            sb.append(".");
            while (r != 0) {
                if (map.containsKey(r)) {
                    int len = map.get(r);
                    sb.insert(len, "(");
                    sb.append(")");
                    break;
                } else {
                    map.put(r, sb.length());
                    r *= 10;
                    q = r / den;
                    r = r % den;
                    sb.append(q);
                }

            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int numerator = 193, denominator = 7;
        System.out.println(result(numerator,denominator));
    }
}
