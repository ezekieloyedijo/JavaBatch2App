package design_pattern.factory;

public class Teacher implements UserService{
    @Override
    public void create() {
        System.out.println("Teacher user created");
    }
}
