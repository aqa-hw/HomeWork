public class hw5 {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";
        System.out.println(concatenateWithPlus(hello, world));
        System.out.println(concatenateWithConcat(hello, world));
        System.out.println(concatenateWithStringBuilder(hello, world));

        String input = "Concatenation";
        String middle = findMiddle(input);
        System.out.println("Middle value: " + middle);

        String name = "Walter";
        String lastName = "White";
        String faculty = "Chemistry";
        String formattedString = formatStudentString(name, lastName, faculty);
        System.out.println(formattedString);

        String word1 = "oko";
        String word2 = "мадам";
        String word3 = "hello";
        System.out.println(word1 + " является палиндромом: " + isPalindrome(word1));
        System.out.println(word2 + " является палиндромом: " + isPalindrome(word2));
        System.out.println(word3 + " является палиндромом: " + isPalindrome(word3));

        String phoneNumber1 = "+380637777777";
        String phoneNumber2 = "380637777777";
        String phoneNumber3 = "+38063abc1234";

        System.out.println(phoneNumber1 + " Is valid phone number: " + isPhoneNumberValid(phoneNumber1));
        System.out.println(phoneNumber2 + " Is valid phone number: " + isPhoneNumberValid(phoneNumber2));
        System.out.println(phoneNumber3 + " Is valid phone number: " + isPhoneNumberValid(phoneNumber3));
    }

    //Task#1
    public static String concatenateWithPlus(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static String concatenateWithConcat(String str1, String str2) {
        return str1.concat(" ").concat(str2);
    }

    public static String concatenateWithStringBuilder(String str1, String str2) {
        StringBuilder builder = new StringBuilder();
        builder.append(str1).append(" ").append(str2);
        return builder.toString();
    }

    //Task#2
    public static String findMiddle(String input) {
        int length = input.length();
        int middleStart = (length - 2) / 2;
        int middleEnd = middleStart + 2;

        return input.substring(middleStart, middleEnd);
    }

    //Task#3
    public static String formatStudentString(String name, String lastName, String faculty) {
        return String.format("Student %s %s %s", name, lastName, faculty);
    }

    //Add_task#1
    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();

        return str.equals(reversed.toString());
    }

    //Add_task#2
    public static boolean isPhoneNumberValid(String phoneNumber) {
        String phoneRegex = "^\\+\\d{12}$"; // +, за которым идут 12 цифр
        return phoneNumber.matches(phoneRegex);
    }
}