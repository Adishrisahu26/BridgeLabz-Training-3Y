public class LibraryBookTracker {

    public static void main(String[] args) {
        int[] dailyBorrows = { 125, 88, 0, 142, 210, 115, 95 };
        String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        int totalBorrows = 0;
        int maxBorrows = -1; 
        String busiestDay = "";
        boolean hasHoliday = false;

        System.out.println("--- Weekly Borrowing Report ---");

        for (int i = 0; i < dailyBorrows.length; i++) {
            int currentDayBorrows = dailyBorrows[i];
            System.out.println(daysOfWeek[i] + ": " + currentDayBorrows + " books");

            totalBorrows += currentDayBorrows;

            if (currentDayBorrows > maxBorrows) {
                maxBorrows = currentDayBorrows;
                busiestDay = daysOfWeek[i];
            }

            if (currentDayBorrows == 0) {
                hasHoliday = true;
            }
        }

    
        double averageBorrows = (double) totalBorrows / dailyBorrows.length;

        System.out.println("\n--- Analysis ---");
        System.out.println("Total books borrowed this week: " + totalBorrows);

        System.out.println("Day with the highest borrowings: " + busiestDay + " (" + maxBorrows + " books)");

        if (hasHoliday) {
            System.out.println("There was at least one day with zero borrowings (possible holiday).");
        } else {
            System.out.println("There were no days with zero borrowings.");
        }

        System.out.println("Average daily borrowings: " + String.format("%.2f", averageBorrows));
    }
}

