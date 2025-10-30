import java.util.*;

class Product {
    String name;
    int qty;

    Product(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    public String toString() {
        return name + " (" + qty + ")";
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        ArrayList<Product> items = new ArrayList<>();
        items.add(new Product("Laptop", 5));
        items.add(new Product("Mouse", 10));

        items.forEach(System.out::println);
    }
}

