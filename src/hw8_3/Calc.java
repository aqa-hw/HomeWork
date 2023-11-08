package hw8_3;
    public enum Calc {
        ADD {
            public double apply(double x, double y) {
                return x + y;
            }
        },
        SUBTRACT {
            public double apply(double x, double y) {
                return x - y;
            }
        },
        MULTIPLY {
            public double apply(double x, double y) {
                return x * y;
            }
        },
        DIVIDE {
            public double apply(double x, double y) {
                if (y != 0) {
                    return x / y;
                } else {
                    throw new ArithmeticException("Divided by zer0");
                }
            }
        },
        POWER {
            public double apply(double x, double y) {
                return Math.pow(x, y);
            }
        };

        public abstract double apply(double x, double y);
    }
