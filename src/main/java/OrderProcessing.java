public class OrderProcessing {

    public static void payment(PaymentMethod paymentMethod, double amount, OrderItem orderItem, String promocode) {
        boolean payment = paymentMethod.pay(amount);
        String discount = "SPRING15";
        double price;
        if (discount.equals(promocode)) {
            price = orderItem.getPrice() - orderItem.getPrice()*0.15;
        }
        else {
            price = orderItem.getPrice();
        }
        amount = amount - price;
        System.out.println("Оплата успішна! Решта: " +amount);

    }

}
