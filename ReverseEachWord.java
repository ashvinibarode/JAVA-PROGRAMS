public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "Ashvini Barode";
        String[] words = sentence.split(" ");
        for (String w : words) {
            String rev = new StringBuilder(w).reverse().toString();
            System.out.print(rev + " ");
        }
    }
}

