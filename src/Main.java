
/**
 Write a program that accepts a string as input, capitalizes the first letter of each word in the
string, and then returns the result string.
 */

public class Main {

    public static String capitalizeWords(String text) {
        // Split the string into words.
        String[] words = text.split("\\s+");

        // Capitalize the first letter of each word.
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }

        // Join the words back into a string.
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String text = "hello world, how are you?";
        String capitalizedText = capitalizeWords(text);
        System.out.println(capitalizedText); // Output: Hello World, How Are You?
    }

}