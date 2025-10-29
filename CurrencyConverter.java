public class CurrencyConverter {
    public static void main(String[] args) {
        double inr = 1000;
        double usd = inr / 83.2;
        double eur = inr / 90.5;
        System.out.println("INR " + inr + " = USD " + usd);
        System.out.println("INR " + inr + " = EUR " + eur);
    }
}
