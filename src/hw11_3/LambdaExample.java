package hw11_3;


public class LambdaExample {
    public static void main(String[] args) {

        MathOperation addition = (x, y) -> x + y;


        MathOperation subtraction = (x, y) -> x - y;


        MathOperation multiplication = (x, y) -> x * y;


        MathOperation division = (x, y) -> {
            if (y != 0) {
                return x / y;
            } else {
                System.out.println("Divided by zer0");
                return 0;
            }
        };


        int x = 6;
        int y = 2;

        System.out.println("Addition: " + operate(x, y, addition));
        System.out.println("Subtration: " + operate(x, y, subtraction));
        System.out.println("Multipl.: " + operate(x, y, multiplication));
        System.out.println("Division: " + operate(x, y, division));
    }

    private static int operate(int x, int y, MathOperation operation) {
        return operation.calculate(x, y);
    }
}
