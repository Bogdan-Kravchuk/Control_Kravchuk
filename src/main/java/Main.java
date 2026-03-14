public class Main {

    public static void main(String[] args) {
OrderItem item1 = new OrderItem("1", "Laptop", 500.00);
OrderItem item2 = new OrderItem("2", "Audi", 1_000_000.00);
OrderItem item3 = new OrderItem("3", "smart watch", 100.00);

OrderItem[] items = {item1, item2, item3};


PaymentMethod card = new CardPayment();


OrderProcessing.payment(card, 1000. );

    }
}
