
//Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
//
//HH = hours, padded to 2 digits, range: 00 - 99
//MM = minutes, padded to 2 digits, range: 00 - 59
//SS = seconds, padded to 2 digits, range: 00 - 59
//The maximum time never exceeds 359999 (99:59:59)
public class HumanReadable {

    public static String makeReadable(int  time){
        int HourInSec = 3600;
        int MinInSec = 60;

        String hh = Integer.toString((time / HourInSec));
        String mm = Integer.toString((time % HourInSec) / MinInSec);
        String ss = Integer.toString(time % MinInSec);

        if(hh.length()<1){
            hh = "0" + hh;
        }
        if(mm.length()<1){
            mm = "0" + mm;
        }
        if(ss.length()<1){
            ss = "0" + ss;
        }

        return hh+" : "+mm+" : "+ss;
    }

    public static void main(String[] args) {
        int time=36000;

        System.out.println(makeReadable(time));
    }
}
