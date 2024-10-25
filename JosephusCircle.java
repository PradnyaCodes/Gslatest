public class JosephusCircle {
    //Recursive approach(Josephus cicle)
    public static int pos(int n, int k){
        //base condition
        if(n==1){
            return 1;
        }
        else {
            //the problem itself has a subproblem
            return (pos(n-1,k)+k-1) % n+1;
        }
    }

    public static void main(String[] args) {

        System.out.println(pos(4,2));

    }
}

