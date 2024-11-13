public class JosephusCircle {

    // Iterative function to find the Josephus position
    public static int findpos(int n,int k){
        int position=0;
        // Compute position for each group size from 2 up to n
        for(int i=2;i<n;i++){
            position = (position+k)%n;
        }
        // Convert 0-based index to 1-based index
        return position+1;
    }

    // Recursive function to find the Josephus position
    public  int pos(int n, int k){
        // Base case: when there's only one student, they are the survivor
        if(n==1){
            return 0;//0 based index
        }
        else {
            // Recursive call: find position for n-1 students, then adjust for n
            return (pos(n - 1, k) + k) % n;

        }
    }

    public static void main(String[] args) {
        int noOfStudents = 4;
        int song_Length = 2;
        JosephusCircle jc = new JosephusCircle();
        int res = jc.pos(noOfStudents,song_Length)+1;
        System.out.println(res);
        System.out.println("by ierative:");
        System.out.println(findpos(noOfStudents,song_Length));

    }
}
