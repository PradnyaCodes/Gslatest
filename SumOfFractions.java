import java.util.Scanner;

public class SumOfFractions {
    public static String sumOfFractions(int n1, int d1, int n2, int d2){
        int sum=0;
        int d;
        if(d1==d2){
            sum = n1+n2;
            d = d1;
            if(sum%d==0){
                sum = sum/d;
                d =d/d;
            }
            return sum+"/"+d;
        }
        else{
            d = d1*d2;
            d1 = d/d1;
            d2 = d/d2;
            n1 = n1*d1;
            n2 = n2*d2;
            sum = n1+n2;
            int res = Math.min(sum,d);
            int div=1;
            for(int i=2;i<res;i++){
                if(sum%i==0 && d%i==0){
                    div=i;
                }
            }
            sum=sum/div;
            d=d/div;
            return sum+"/"+d;
        }

    }

    public static void main(String[] args) {
        int n1 = 1; int d1=3;
        int n2 = 3; int d2 = 9;
        System.out.println(sumOfFractions(n1,d1,n2,d2));
    }
}
