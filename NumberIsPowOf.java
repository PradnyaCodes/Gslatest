//Check whether a number is a power of 10.
public class NumberIsPowOf {

    /* Returns true if y is a power of x */
    public static boolean checkPow(int x, int y){
        if(x==1){
            return (y==1);
        }

        int pow=1;
        while(pow<y){
            pow = pow * x;
        }

        return (pow==y);
    }
    public static void main(String[] args) {

        System.out.println(checkPow(10,1));//true: 10**0=1;
    }
}
