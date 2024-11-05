import java.awt.image.ImageProducer;
import java.util.HashSet;
import java.util.Set;

public class Direction {

    public static String findDirection(String s){
        String[] arr = s.split(" ");
        int x = 0;
        int y = 0;
        Set<Character> set = new HashSet<>();
        set.add('D');
        set.add('U');
        set.add('R');
        set.add('L');
        int n = arr.length;
        if (n>1) {
            for (int i = 0; i < arr.length; i++) {
                int num = 1;
                String st = arr[i];
                int idx = 0;
                StringBuilder str = new StringBuilder();
                if (!set.contains(st.charAt(0))) {
                    char charX = 'x';
                    while (idx < arr[i].length() && st.charAt(idx) != charX) {
                        idx++;
                    }
                    System.out.println(idx);
                    str.append(st.substring(0, idx));
                    //System.out.println(str);
                    idx++;
                    num = Integer.parseInt(str.toString());
                }

                switch (st.charAt(idx)) {
                    case 'D':
                        y = y - num;
                        break;
                    case 'U':
                        y = y + num;
                        break;
                    case 'L':
                        x = x - num;
                        break;
                    case 'R':
                        x = x + num;
                        break;
                }
            }
            //System.out.println(str.toString());
        } else {
            String st = arr[0];
            for (int i = 0; i < st.length(); i++) {
                switch (st.charAt(i)) {
                    case 'D':
                        y--;
                        break;
                    case 'U':
                        y++;
                        break;
                    case 'L':
                        x--;
                        break;
                    case 'R':
                        x++;
                        break;
                }
            }
        }
        return "x:" + " " + x + ", y: " + y;
    }

    public static void main(String[] args) {
        String dir =  "UP 230xDOWN LEFT LEFT 2xRIGHT 5xUP RIGHT";
        System.out.println(findDirection(dir));
    }
}
