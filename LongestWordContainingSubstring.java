public class LongestWordContainingSubstring {

    // Optimized solution with O(n) complexity
    public static int findLongestWordLength(String[] dict, String toSearch) {
        int maxLength = 0;

        // Traverse each word in the dictionary
        for (String word : dict) {
            // Check if the word contains the substring in an optimized way
            if (word.contains(toSearch)) {
                // Update maxLength if this word's length is greater
                maxLength = Math.max(maxLength, word.length());
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";

        // Call the function and output the result
        int result = findLongestWordLength(dict, toSearch);
        System.out.println("The length of the longest word containing the substring '" + toSearch + "' is: " + result);
    }
}