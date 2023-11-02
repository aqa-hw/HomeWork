package hw7_add;
public class Person {
    private String name;
    private Bill account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bill getAccount() {
        return account;
    }

    public void setAmount(Bill account) {
        this.account = account;
    }

    public Person(String name, Bill amount) {
        this.name = name;
        this.account = amount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}