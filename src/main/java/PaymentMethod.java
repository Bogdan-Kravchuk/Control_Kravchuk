public interface PaymentMethod {
    String name();
    boolean pay(double amount);
}
