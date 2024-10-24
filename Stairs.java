public class Stairs {

    public  static int ways(int n){

        if(n==1 || n==2){
            return n;
        }

//        int f[]= new int[n+1];
//
//        f[1]=1;
//        f[2]=2;
//
//        for(int i=3;i<=n;i++){
//            f[i] = f[i-1] + f[i-2];
//        }
//
//        return f[n];
        int count1 = ways(n-1);
        int count2 = ways(n-2);
        int totalcount = count1+count2;

        return  totalcount;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(ways(n));
    }
}
