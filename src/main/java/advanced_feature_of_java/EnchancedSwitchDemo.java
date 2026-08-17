package advanced_feature_of_java;

public class EnchancedSwitchDemo {
    public static void main(String[] args) {
        int day = 6;

        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println("day type: " + dayType);
    }
}
