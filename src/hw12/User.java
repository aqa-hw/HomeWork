package hw12;

import java.util.Arrays;
import java.util.List;

public class User {


    private String name;
    private String surname;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public User(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Billy", "Smith", 25, "aaa@aaa.com"),
                new User("Bobby", "Smith", 30, "bbb@bbb.com"),
                new User("Eddy", "Johnson", 28, "ccc@ccc.com")
        );

        List<String> uniqueSurnames = users.stream()
                .filter(user -> user.getAge() > 26)
                .map(User::getSurname)
                .distinct()
                .toList();
        uniqueSurnames.forEach(System.out::println);
        String firstName = users.stream()
                .filter(user -> user.getSurname().length() < 8)
                .map(User::getName)
                .findFirst()
                .orElseThrow(() -> new CustomException("No matching names found"));

        System.out.println("First filtered name: " + firstName);
    }
    static class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }
}



