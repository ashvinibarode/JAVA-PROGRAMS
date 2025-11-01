import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] quiz = {
            {"What is the capital of India?", "Delhi", "Mumbai", "Chennai", "Kolkata", "1"},
            {"Which language runs on JVM?", "Python", "C++", "Java", "Go", "3"}
        };

        int score = 0;

        for (String[] q : quiz) {
            System.out.println("\n" + q[0]);
            for (int i = 1; i <= 4; i++) {
                System.out.println(i + ". " + q[i]);
            }

            System.out.print("Answer: ");
            int ans = sc.nextInt();

            if (String.valueOf(ans).equals(q[5])) {
                score++;
            }
        }

        System.out.println("\nYour Score: " + score);
        sc.close();
    }
}