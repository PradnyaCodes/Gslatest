public class HundredBulbs {

    public static void main(String[] args) {

        int n=100;
        //1->1 odd factor->onn->off finally --> perfect square
        //2->1,2 even factor, onn->onn finally
        //3->1,3 even factor, onn->onn finally
        //4->1,2,4  odd factor onn->off finally   --> perfect square
        //5->1,5  even factor, onn->onn finally
        //6->1,2,3,6 even factor, onn->onn finally
        //7->1,7  even factor, onn->onn finally
        //8->1,2,4,8 even factor, onn->onn finally
        //9->1,3,9  odd factor onn->off finally   --> perfect square
        //10->1,2,5,10 even factor, onn->onn finally
        //for 10 iterations no. of perfect squares is 3->sqrt of 3
        double bulbsOn = Math.sqrt(n);
        System.out.println(Math.floor(bulbsOn));

    }
}
