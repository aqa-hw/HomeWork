public class hw4 {
    public static void main(String[] args) {
        printUnicodeSymbols();

        System.out.println(pow());

        System.out.println(getSum(5, 10, 2));

        int a = 10;
        int b = 5;
        int sum = add(a, b);
        int product = multiply(a, b);
        int difference = subtract(a, b);
        double quotient = divide(a, b);
        System.out.println("Sum: " + sum);
        System.out.println("Multiply: " + product);
        System.out.println("Subtract: " + difference);
        System.out.println("Divide: " + quotient);


    }
//Task#1
    public static char[] printUnicodeSymbols() {
        char[] symbols = {'\u1377', '\u00AE', '\u2665'};

        for (char symbol : symbols) {
            System.out.print(symbol + " ");
        }
        return symbols;
    }
//Task#2
    public static int getSum(int a, int b) {
        return a + b;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }

    public static String getSum(String a, String b) {
        return a + b;
    }
    public static int getSum(int a, int b, int c) {
        return a + b * c;
    }

    public static double getSum(double a, double b, double c) {
        return a + b - c;
    }

    public static String getSum(String a, String b, String c) {
        return a + b + c;
    }
    //Task#3
    public static double pow() {
        int a1 = 5;
        int b1 = 3;
        var с = Math.pow(a1, b1);
        return с;
    }
    //Task#4
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}




