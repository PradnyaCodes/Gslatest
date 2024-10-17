public class TrappingRainWater {

    public static int waterTrapped(int [] height){
        int n =height.length;
        int [] prefix = new int[n];
        int [] suffix = new int[n];
        int total=0;
        prefix[0] = height[0];
        for(int i=1;i<n;i++){
            prefix[i] = Math.max(prefix[i-1],height[i]);
        }
        suffix[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            suffix[i] = Math.max(suffix[i+1],height[i]);
        }

        for(int i=0;i<n;i++){
            total+= Math.min(prefix[i],suffix[i])-height[i];
        }

        return total;
    }

    public static void main(String[] args) {
        //int [] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height ={4,2,0,3,2,5};
        System.out.println(waterTrapped(height));
    }
}
