public class RemoveVowels {

public static void main(String[] args) {
        String str = "ashvini barode";
        String result = str.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Without vowels: " + result);
    }
}