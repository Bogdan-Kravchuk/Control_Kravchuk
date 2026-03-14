public class BankTransferPayment implements PaymentMethod{


    @Override
    public String name() {
        return "Bank Transfer Payment";
    }

    @Override
    public boolean pay(double amount) {

        if (amount < 0)
        return false;
        else
          amount = amount- (amount*0.015);



        System.out.println("Amount with commission: " + amount);
        return true;
    }
}
