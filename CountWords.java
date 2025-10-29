public class CountWords {
    public static void main(String[] args) {
        String sentence = "Ashvini barode";
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Total words: " + words.length);
    }
}

