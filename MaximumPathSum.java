
//Given a matrix of size m * n,
//    return the maximum path sum in the matrix.
//    [You start from the top-left corner of the matrix and may up, down and diagonally].
//
//Example:
//    Matrix      10 10  2  0 20  4
//                       1  0  0 30  2  5
//                       0 10  4  0  2  0
//                       1  0  2 20  0  4
//
//    // Return 74 [The maximum sum path is 20-30-4-20]
public class MaximumPathSum {

    public static void main(String[] args) {
       int [][] arr  = {{3,2,4,3},{5,13,9,6},{10,13,11,15}};
       int n=3;
       int m=4;
       int max =0;
        int ans=0;
       for(int i=1;i<n;i++){

           for(int j=0;j<m;j++){

               if(j>0 && j<(m-1)){
                   max =  Math.max(arr[i-1][j], Math.max(arr[i-1][j-1],arr[i-1][j+1]));
                   arr[i][j] += max;
               } else if (j>0) {
                   max =  Math.max(arr[i-1][j], arr[i-1][j-1]);
                   arr[i][j] += max;
               }
               else if(j<m-1){
                   max =  Math.max(arr[i-1][j], arr[i-1][j+1]);
                   arr[i][j] += max;
               }
           }



           for(int k=0;k<m;k++){
               ans = Math.max(arr[n-1][k],ans);
           }
       }

        System.out.println(ans);
    }
}
