package hw8_2;

public class Enum {
    public enum Time {
        BREAKFAST("Time to eat your breakfast"),
        LUNCH("Time to eat your lunch"),
        DINNER("Time to eat your dinner");

        private String message;

        Time(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
