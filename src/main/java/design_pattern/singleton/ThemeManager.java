package design_pattern.singleton;

// 1 object -
// How will the object be created and accessed
public class ThemeManager {
    private static final ThemeManager instance
            = new ThemeManager();
    private boolean darkMode = false;

    private ThemeManager() {}

    public static ThemeManager getInstance() {
        return instance;
    }

    public void toggleTheme() {
        darkMode = !darkMode;
    }

    public boolean isDarkMode() {
        return darkMode;
    }


}
