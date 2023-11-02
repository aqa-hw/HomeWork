package hw8_add;

public class PaymentService {
    public void makePayment(Account sender, Account recipient, double amount) {
        if (sender.getBill().getAmount() >= amount) {
            sender.getBill().setAmount(sender.getBill().getAmount() - amount);
            recipient.getBill().setAmount(recipient.getBill().getAmount() + amount);
            System.out.println("Tranfer done: " + amount + " transfer from " + sender.getPerson().getFirstName() + " to " + recipient.getPerson().getFirstName());
        } else {
            System.out.println("Not enough funds.");
        }
    }
}

