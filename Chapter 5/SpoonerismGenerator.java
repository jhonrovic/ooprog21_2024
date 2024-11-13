import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        SpoonerismGenerator generator = new SpoonerismGenerator();
        generator.run();
    }

    // Method to get a word from the user
    private String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    // Method to find the index of the first vowel in a word
    private int vowelIndex(String word) {
        String vowels = "aeiouAEIOU"; // Include both lowercase and uppercase
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; // Return -1 if no vowel is found
    }

    // Method to run the main logic
    private void run() {
        String word1 = getWord("Word 1: ");
        String word2 = getWord("Word 2: ");

        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);

        // Check if both words are valid for spoonerizing
        if (index1 == -1 || index2 == -1 || index1 == 0 || index2 == 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            // Create the spoonerized words
            String spoonerizedWord1 = createSpoonerizedWord(word1, word2, index1, index2);
            String spoonerizedWord2 = createSpoonerizedWord(word2, word1, index2, index1);

            // Print the result
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " and " + spoonerizedWord2);
        }
    }

    // Method to create a spoonerized word
    private String createSpoonerizedWord(String sourceWord, String targetWord, int sourceIndex, int targetIndex) {
        StringBuilder result = new StringBuilder();
        
        // Add the initial consonants from targetWord
        for (int i = 0; i < targetIndex; i++) {
            result.append(targetWord.charAt(i));
        }
        // Add the rest of sourceWord from the first vowel
        for (int i = sourceIndex; i < sourceWord.length(); i++) {
            result.append(sourceWord.charAt(i));
        }
        
        return result.toString();
    }
}
