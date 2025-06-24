package Java2;

import java.io.*;

public class WordcountQ3 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Put <filename> <word>");
            return;
        }

        String filename = args[0];
        String wordToFind = args[1];
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Remove punctuation, split by non-word characters
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(wordToFind)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + wordToFind + "' occurred " + count + " times.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
