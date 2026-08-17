package design_pattern.builder;

public class StudentProfileMain {
    public static void main(String[] args) {
        StudentProfile studentProfile = new StudentProfile
                .Builder("Ayo Tolu", "std1", "A")
                .setAddress("Plot 22 Yomi Ajetunmobi Avenue")
                .setContactNumber("08123234344")
                .build();

        studentProfile.print();
    }
}
