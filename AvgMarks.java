//Given a list of student names and corresponding marks,
//    return the highest average marks (and print the corresponding student name - optional).
//    The marks can be negative as well and a student may have multiple marks.
//
//Example:
// String[][] = {{“Charles”, 84},
//                      {“John”, 100},
//                      {“Andy”, 37},
//                      {“John”, 23},
//                      {“Charles”, 20}};
//
//    //Return 61.5 (which is of John's)
import java.util.*;

public class AvgMarks {

    public static void main(String[] args) {

        String reports[][] = {{"Charles", "84"},
            {"John", "100"},
            {"Andy", "37"},
            {"John", "23"},
            {"Charles", "20"},
                {"Amy", "78"}};

        HashMap<String, List<Integer>> map = new HashMap<>();

        for(int i=0;i<reports.length;i++){
            String cname = reports[i][0];
            String cmarks = reports[i][1];
            int marks = Integer.parseInt(cmarks);
            if(map.containsKey(cname)){
                List<Integer> list = map.get(cname);

                list.add(marks);
            }
            else {
                List<Integer> list1 = new ArrayList<>();
                list1.add(marks);
                map.put(cname,list1);

            }
        }

        System.out.println(map);
        double maxavg=0;
        Set<Map.Entry<String,List<Integer>>> entryset = map.entrySet();
        for(Map.Entry<String,List<Integer>> entry: entryset){
            double avg = entry.getValue().stream().mapToDouble(Integer::doubleValue).average().orElse(0);
            if(avg>maxavg){
                maxavg=avg;
            }


        }



        System.out.println(maxavg);


    }
}
