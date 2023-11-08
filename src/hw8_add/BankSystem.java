package hw8_add;

public class BankSystem {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", "Johnson", "alice@email.com", "1234567890");
        Person person2 = new Person("Bob", "Smith", "bob@email.com", "9876543210");

        Bill bill1 = new Bill(1000.0);
        Bill bill2 = new Bill(500.0);

        Account account1 = new Account(bill1, person1);
        Account account2 = new Account(bill2, person2);

        PaymentService paymentService = new PaymentService();
        paymentService.makePayment(account1, account2, 200.0);

        System.out.println("Account status " + account1.getPerson().getFirstName() + ": " + account1.getBill().getAmount());
        System.out.println("Account status " + account2.getPerson().getFirstName() + ": " + account2.getBill().getAmount());

        DepositService depositService = new DepositService();
        depositService.makeDeposit(account1, 300.0);

        System.out.println("Account status " + account1.getPerson().getFirstName() + ": " + account1.getBill().getAmount());

        TransferPayment transferPayment = new TransferPayment();
        transferPayment.transfer(account2, account1, 100.0);

        System.out.println("Account status " + account1.getPerson().getFirstName() + ": " + account1.getBill().getAmount());
        System.out.println("Account status " + account2.getPerson().getFirstName() + ": " + account2.getBill().getAmount());
    }
}

