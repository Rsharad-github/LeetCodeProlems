import java.util.*;

public class Q21longestPalindrome {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> countMap = new HashMap<>();
        int palindromeLength = 0;
        int singleCenter = 0;

        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        for (String word : countMap.keySet()) {
            String reversed = new StringBuilder(word).reverse().toString();

            if (!word.equals(reversed)) {
                // Form pairs with their reverse (e.g., "ab" + "ba")
                if (countMap.containsKey(reversed)) {
                    int pairCount = Math.min(countMap.get(word), countMap.get(reversed));
                    palindromeLength += pairCount * 4;
                    countMap.put(word, countMap.get(word) - pairCount);
                    countMap.put(reversed, countMap.get(reversed) - pairCount);
                }
            } else {
                // For palindromic words like "aa", "bb"
                int pairs = countMap.get(word) / 2;
                palindromeLength += pairs * 4;
                countMap.put(word, countMap.get(word) % 2); // Update remaining

                // If one remains, consider it for the center
                if (countMap.get(word) == 1) {
                    singleCenter = 2; // Only one such word can be in the center
                }
            }
        }

        return palindromeLength + singleCenter;
    }
}