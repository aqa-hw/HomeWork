package hw9_1;

public class Car {
    public class InvalidMakeException extends Exception {
        public InvalidMakeException(String message) {
            super(message);
        }
    }

    public class InvalidModelException extends Exception {
        public InvalidModelException(String message) {
            super(message);
        }
    }

    public class InvalidYearException extends Exception {
        public InvalidYearException(String message) {
            super(message);
        }
    }

    public class InvalidPriceException extends Exception {
        public InvalidPriceException(String message) {
            super(message);
        }
    }

    private String make;
        private String model;
        private int year;
        private double price;

        public String getMake() {
            return make;
        }

        public void setMake(String make) throws InvalidMakeException {
            if (make != null && !make.isEmpty()) {
                this.make = make;
            } else {
                throw new InvalidMakeException("Wrong maker");
            }
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) throws InvalidModelException {
            if (model != null && !model.isEmpty()) {
                this.model = model;
            } else {
                throw new InvalidModelException("Wrong model");
            }
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) throws InvalidYearException {
            if (year >= 1900 && year <= 2023) {
                this.year = year;
            } else {
                throw new InvalidYearException("Wrong year");
            }
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) throws InvalidPriceException {
            if (price >= 0) {
                this.price = price;
            } else {
                throw new InvalidPriceException("Wrong price");
            }
        }
    }


