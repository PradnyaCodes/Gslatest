import java.util.Scanner;

public class SumOfFractions {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int den1 = s.nextInt();
        int num2 = s.nextInt();
        int den2 = s.nextInt();
        int sum, d,min;

        if(den1==den2){
            sum = num1+num2;
            d=den1;
            System.out.println(sum+"/"+d);
        }
        else {
            d=den1*den2;
            den1=d/den1;
            den2=d/den2;
            num1 = num1*den1;
            num2 = num2* den2;
            sum = num1+num2;
            System.out.println(sum);
            min = Math.min(sum,d);
            System.out.println(d);
            int div=1;
            for(int i=2;i<=min;i++){
                if(sum%i==0 && d%i==0){
                   div=i;
                }
            }
            sum = sum/div;
            d = d/div;

            if(sum%d==0){
                sum = sum/d;
                System.out.println(sum);
            }
            else {
                System.out.println(sum+"/"+d);
            }
        }

    }
}
