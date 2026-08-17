package design_pattern.builder;

import jdbc.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentProfile {
    private String fullName;
    private String studentId;
    private String grade;
    private String guardianName;
    private String contactNumber;
    private String address;
    private boolean hasScholarship = false;
    private List<String> enrolledSubjects = new ArrayList<>();

    // compulsory
    private StudentProfile() {}

    public void print() {
        System.out.println("------------Student Profile Information ----------");
        System.out.println("FullName: " + fullName);
        System.out.println("StudentId: " + studentId);
        System.out.println("Grade: " + grade);
        if(guardianName != null) System.out.println("Guardian name: " + guardianName);
        if(contactNumber != null) System.out.println("Contact number: " + contactNumber);
        if(address != null) System.out.println("Address: " + address);
        System.out.println("Has Scholarship: " + hasScholarship);
        if(enrolledSubjects != null) System.out.println("Enrolled subject: " + enrolledSubjects);
    }

    public static class Builder {
        StudentProfile studentProfile = new StudentProfile();

        public Builder(String fullName, String studentId, String grade) {
            studentProfile.fullName = fullName;
            studentProfile.studentId = studentId;
            studentProfile.grade = grade;
        }

        public Builder setFullName(String fullName) {
            studentProfile.fullName = fullName;
            return this;
        }

        public Builder setStudentId(String studentId){
            studentProfile.studentId = studentId;
            return this;
        }

        public Builder setGrade(String grade) {
            studentProfile.grade = grade;
            return this;
        }

        public Builder setGuardianName(String guardianName) {
            studentProfile.guardianName = guardianName;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            studentProfile.contactNumber = contactNumber;
            return this;
        }

        public Builder setAddress(String address) {
            studentProfile.address = address;
            return this;
        }

        public Builder setHasScholarship(boolean hasScholarship) {
            studentProfile.hasScholarship = hasScholarship;
            return this;
        }

        public Builder setEnrolledSubject(List<String> enrolledSubjects) {
            studentProfile.enrolledSubjects = enrolledSubjects;
            return this;
        }

        public StudentProfile build() {
            if(studentProfile.grade.equalsIgnoreCase("A") &&
            studentProfile.enrolledSubjects.size() > 4) {
                studentProfile.hasScholarship = true;
            }
            return studentProfile;
        }
    }

    @Override
    public String toString() {
        return "StudentProfile{" +
                "guardianName='" + guardianName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", grade='" + grade + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                ", hasScholarship=" + hasScholarship +
                ", enrolledSubjects=" + enrolledSubjects +
                '}';
    }
}
