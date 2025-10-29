import java.time.LocalTime;

public class digitalclock {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            LocalTime time = LocalTime.now();
            System.out.print("\rCurrent Time: " + time);
            Thread.sleep(1000);
        }
    }
}
