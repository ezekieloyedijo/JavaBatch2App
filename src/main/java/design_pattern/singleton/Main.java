package design_pattern.singleton;

public class Main {
    public static void main(String[] args) {
        ThemeManager themeManager = ThemeManager.getInstance();
        ThemeManager themeManager2 = ThemeManager.getInstance();
    }
}
