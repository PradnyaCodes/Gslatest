
import java.util.Stack;

public class  TrappingWaterByStack {
    public static int trap(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int trappedWater = 0;

        for (int current = 0; current < heights.length; current++) {
            // Process stack while the current height is greater than the height of the top index
            while (!stack.isEmpty() && heights[current] > heights[stack.peek()]) {
                int top = stack.pop(); // Pop the top index

                // If the stack becomes empty, no left boundary exists
                if (stack.isEmpty()) {
                    break;
                }

                int distance = current - stack.peek() - 1; // Width of the water trap
                int boundedHeight = Math.min(heights[current], heights[stack.peek()]) - heights[top];
                trappedWater += distance * boundedHeight;
            }

            stack.push(current); // Push the current index onto the stack
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped water: " + trap(heights)); // Output: 6
    }
}
