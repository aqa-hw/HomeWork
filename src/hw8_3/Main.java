package hw8_3;

public class Main {
    public static void main(String[] args) {
        double operand1 = 5.0;
        double operand2 = 2.0;

        for (Calc operation : Calc.values()) {
            System.out.println(operand1 + " " + operation + " " + operand2 + " = " + operation.apply(operand1, operand2));
        }
    }
}

