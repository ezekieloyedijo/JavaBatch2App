package design_pattern.factory;

public class Main {
    public static void main(String[] args) {
        UserService admin = UserFactory.createUser("admin");
        UserService student = UserFactory.createUser("student");
        UserService teacher = UserFactory.createUser("teacher");
    }
}
