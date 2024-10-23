import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintPascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1));
        for(int i=0;i<numRows-1;i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j=0;j<ans.get(i).size()-1;j++){
                list.add(ans.get(i).get(j)+ans.get(i).get(j+1));
            }
            list.add(1);
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        int numRows=5;
        System.out.println(generate(numRows));
    }
}
