import java.util.*;

public class Name {
    
    // Method to sort characters of a word
    private static String sortChars(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // Method to find the longest anagram pair
    public static String[] findLongestAnagramPair(List<String> words) {
        Map<String, List<String>> map = new HashMap<>();
        String[] longestPair = new String[2];
        int maxLength = 0;

        // Group words by their sorted character sequence
        for (String word : words) {
            String key = sortChars(word);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        // Check each group for anagram pairs
        for (List<String> group : map.values()) {
            if (group.size() > 1) {
                for (int i = 0; i < group.size(); i++) {
                    for (int j = i + 1; j < group.size(); j++) {
                        String w1 = group.get(i);
                        String w2 = group.get(j);
                        if (w1.length() > maxLength) {
                            maxLength = w1.length();
                            longestPair[0] = w1;
                            longestPair[1] = w2;
                        }
                    }
                }
            }
        }

        return longestPair;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
            "listen", "silent", "enlist", "google", "gogole",
            "rat", "tar", "art", "bored", "robed"
        );

        String[] result = findLongestAnagramPair(words);

        if (result[0] != null) {
            System.out.println("Longest Anagram Pair: " + result[0] + " , " + result[1]);
        } else {
            System.out.println("No anagram pair found.");
        }
    }
}
