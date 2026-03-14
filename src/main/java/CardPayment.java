public class CardPayment implements PaymentMethod {
    @Override
    public String name() {
        return "Card Payment";
    }

    @Override
    public boolean pay(double amount) {
        if (amount < 0 || amount < 25_000)
            return false;
        else
            return true;
    }


    public void payment(double amount, OrderItem orderItem, String promocode) {
        boolean payment = pay(amount);
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

