package advanced_feature_of_java.compactnumber;

import java.text.NumberFormat;
import java.util.Locale;

public class AnalyticsReport {
    public static void main(String[] args) {
        NumberFormat longFormatter =
                NumberFormat.getCompactNumberInstance(
                        Locale.US,
                        NumberFormat.Style.LONG
                );
        longFormatter.setMaximumFractionDigits(2);

        long pageViews = 2534000;
        long downloads = 784500;
        long activeUsers = 12000;

        System.out.println("Analytics Report:");
        System.out.println("Page Views: "+ longFormatter.format(pageViews));
        System.out.println("Downloads: " + longFormatter.format(downloads));
        System.out.println("Active Users: " + longFormatter.format(activeUsers));
    }
}
