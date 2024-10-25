public class JosephusCircle {

    public static int pos(int n, int k){
        if(n==1){
            return 1;
        }
        else {
            return (pos(n-1,k)+k-1) % n+1;
        }
    }

    public static void main(String[] args) {
        System.out.println(pos(4,2));
    }
}

