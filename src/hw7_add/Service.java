package hw7_add;
public class Service {


    public static void plus(Person john, int amount)
    {
        int currentJohnAmount = john.getAccount().getAmount();
        john.getAccount().setAmount(currentJohnAmount + amount);
        System.out.println(john.getAccount().getAmount());
    }

    public static void minus(Person john, int amount) {
        int currentJohnAmount = john.getAccount().getAmount();
        john.getAccount().setAmount(currentJohnAmount - amount);
        System.out.println(john.getAccount().getAmount());
    }

    public static void divide(Person john, int amount) {
        int currentJohnAmount = john.getAccount().getAmount();
        john.getAccount().setAmount(currentJohnAmount / amount);
        System.out.println(john.getAccount().getAmount());
    }
}







