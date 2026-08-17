package advanced_feature_of_java;

public class OldSwitchDemo {
    public static void main(String[] args) {
        int day = 6;
        String dayType;

        switch(day) {
            case 1:
                dayType = "Weekday";
                break;
            case 2:
                dayType = "Weekday";
                break;
            case 3:
                dayType = "Weekday";
                break;
            case 4:
                dayType = "Weekday";
                break;
            case 5:
                dayType = "Weekday";
                break;
            case 6:
                dayType = "Weekend";
                break;
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid day";

        }
        System.out.println("Day type: " + dayType);
    }
}
