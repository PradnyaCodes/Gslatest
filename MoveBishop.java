public class MoveBishop {
    //We are given a chess board and a piece with a fixed position (immoveable). We also have a bishop on the board which,
    // well of course, can only move diagonally.
    //    - Return "YES" if we can reach the immoveable piece using the bishop, else return "NO".
    //    - If "YES", return the number of minimum steps it takes for the bishop to reach the immoveable piece.

    public static String Bishop(int bishopX, int bishopY, int targetX, int targetY) {

        if ((bishopX + bishopY) % 2 != (targetX + targetY) % 2) {
            return "NO";
        }
        if (bishopX == targetX && bishopY == targetY) {
            return "YES, 0";
        }

        if (Math.abs(bishopX - targetX) == Math.abs(bishopY - targetY)) {
            return "YES, 1";
        }
        return "YES, 2";
    }


    public static void main(String[] args) {
        int x = 4;
        int y =2;
        int targetx = 0;
        int targetY =0;
        System.out.println(Bishop(x,y,targetx,targetY));
    }
}
