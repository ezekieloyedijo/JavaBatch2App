package design_pattern.factory;

public class Admin implements UserService{
    @Override
    public void create() {
        System.out.println("Admin user created");
    }
}
