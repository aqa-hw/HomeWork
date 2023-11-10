package hw9_1;

public class Car {
        private String make;
        private String model;
        private int year;
        private double price;

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            if (make != null && !make.isEmpty()) {
                this.make = make;
            } else {
                throw new IllegalArgumentException("Wrong maker");
            }
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            if (model != null && !model.isEmpty()) {
                this.model = model;
            } else {
                throw new IllegalArgumentException("Wrong model");
            }
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            if (year >= 1900 && year <= 2023) {
                this.year = year;
            } else {
                throw new IllegalArgumentException("Wrong year");
            }
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if (price >= 0) {
                this.price = price;
            } else {
                throw new IllegalArgumentException("Wrong price");
            }
        }
    }


