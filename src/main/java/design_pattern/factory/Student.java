package design_pattern.factory;

public class Student implements UserService{
    @Override
    public void create() {
        System.out.println("Student user created");
    }
}
