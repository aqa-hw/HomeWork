package hw8_add;

public class TransferPayment {
    public void transfer(Account sender, Account recipient, double amount) {
        PaymentService paymentService = new PaymentService();
        paymentService.makePayment(sender, recipient, amount);
    }
}
