import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Given an array of strings,
//    return the IP address that occurs maximum number of times.
//    [You might have to check for the validity of the IP address before considering it].
//
//Example:
//    String [] str = {
//                              "10.0.0.1 bytes=32 time=50ms TTL=63",
//                              "10.0.0.2 bytes=32 time=50ms TTL=73",
//                              "10.0.0.4 bytes=32 time=50ms TTL=83",
//                              "10.0.0.2 bytes=32 time=50ms TTL=93",
//                            }
//
//    // Return 10.0.0.2
public class IPmaxTimes {

    public static void main(String[] args) {
        String [] str = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<str.length;i++){
            String s = str[i].substring(0,8);

            System.out.println(s);
            String zeroTo255
                    //="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
                    ="([0-9]|[0-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])";
            //String zeroTo255 = "(([0-9]||[1-9][1-9]||1[0-9][0-9]||2[0-4][0-9]||25[0-5])\\.){3}([0-9]||[1-9][1-9]||1[0-9][0-9]||2[0-4][0-9]||25[0-5])";


            String regex = zeroTo255 + "\\."
                    + zeroTo255 + "\\."
                    + zeroTo255 + "\\."
                    + zeroTo255;

            Pattern p =Pattern.compile(regex);
            Matcher m  = p.matcher(s);
            boolean found = m.find();
           // System.out.println(found);
            if(found){
                map.put(s,map.getOrDefault(s,0)+1);
            }
            else{
                System.out.println("invalid");
            }


        }
        Map.Entry<String,Integer> entryst = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();

            System.out.println("max repeated IP address: " + entryst.getKey() + " repeated " + entryst.getValue() + " times");

        String str1 ="256.10.240.0";
        String zeroTo255
                ="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";


        String regex = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;
        Pattern p =Pattern.compile(regex);
        Matcher m  = p.matcher(str1);
        boolean found = m.find();
         System.out.println(found);





    }
}
