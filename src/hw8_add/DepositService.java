package hw8_add;

public class DepositService {
    public void makeDeposit(Account account, double amount) {
        account.getBill().setAmount(account.getBill().getAmount() + amount);
        System.out.println("Deposit done: " + amount + " Accured " + account.getPerson().getFirstName());
    }
}

