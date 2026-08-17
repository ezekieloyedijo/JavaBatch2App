package advanced_feature_of_java.compactnumber;

import java.text.NumberFormat;
import java.util.Locale;

// CompactNumberFormat converts large numbers into short,
// human-readable strings like 1.2K, 3.5M
public class DashboardCompactNumber {
    public static void main(String[] args) {
        NumberFormat compactFormatter =
                NumberFormat.getCompactNumberInstance(Locale.US,
                        NumberFormat.Style.SHORT);
        compactFormatter.setMaximumFractionDigits(1);

        long totalUsers = 1254300;
        long totalTransactions = 98765432;
        long totalLoans = 1200;

        System.out.println("Dashboard Metrics:");
        System.out.println("Total Users: " + compactFormatter.format(totalUsers));
        System.out.println("Total Transactions: " + compactFormatter.format(totalTransactions));
        System.out.println("Total Loans: " + compactFormatter.format(totalLoans));

    }
}
