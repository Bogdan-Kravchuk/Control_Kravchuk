public class PayPalPayment implements PaymentMethod {

    @Override
    public String name() {
        return "PayPal payment";
    }

    @Override
    public boolean pay(double amount) {
        if (amount < 0 || amount < 200)
            return false;
        else
            return true;
    }


}
