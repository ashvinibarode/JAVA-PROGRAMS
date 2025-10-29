import java.util.*;

public class CRUDArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        list.set(1, "Orange"); // Update
        list.remove("Mango");  // Delete
        System.out.println("Final List: " + list);
    }
}