package advanced_feature_of_java.textblock;

public class TextBlockExample {
    public static void main(String[] args) {
        String message = "Dear Student, \n"
                + "your registration is successful.\n"
                + "Please check your email.\n"
                + "Thank you.";
        System.out.println(message);

        String message2 = """
                    Dear Student,
                    Your registration is successful.
                    Please check your email.
                    Thank you.
                    """;
        System.out.println(message2);

        String name = "Alice";
        int balance = 85000;

        String message3 = String.format("""
                Dear %s,
                Your account balance is ₦%d.
                """, name, balance);
        System.out.println(message3);
    }
}
