import java.util.*;

public class Q25VerticalPrint {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int maxLen = 0;
        for (String word : words) {
            maxLen = Math.max(maxLen, word.length());
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < maxLen; i++) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (i < word.length()) {
                    sb.append(word.charAt(i));
                } else {
                    sb.append(' ');
                }
            }
            // Remove trailing spaces
            result.add(trimRight(sb.toString()));
        }

        return result;
    }

    // Helper method to remove trailing spaces from a string
    private String trimRight(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        return s.substring(0, i + 1);
    }
}