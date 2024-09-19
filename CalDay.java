import java.util.Scanner;

public class CalDay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day (dd): ");
        int dd = sc.nextInt();

        System.out.println("Enter the month (mm): ");
        int mm = sc.nextInt();

        System.out.println("Enter the year (yyyy): ");
        int yy = sc.nextInt();

        int m_day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Check for leap year and adjust February days
        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0)) {
            m_day[2] = 29;
        }

        // Validate month
        if (mm < 1 || mm > 12) {
            System.out.println("Invalid date: Month must be between 1 and 12");
            return;
        }

        // Validate day
        if (dd < 1 || dd > m_day[mm]) {
            System.out.println("Invalid date: Day must be between 1 and " + m_day[mm]);
            return;
        }

        // Calculate days passed in the current year
        int day_passed = dd;
        for (int i = 1; i < mm; i++) {
            day_passed += m_day[i];
        }

        // Calculate total days passed since year 0
        int total_days = (yy - 1) * 365 + (yy - 1) / 4 - (yy - 1) / 100 + (yy - 1) / 400 + day_passed;

        // Find the number of odd days
        int t_odddays = total_days % 7;

        System.out.println("Number of odd days are " + t_odddays);

        // Determine the day of the week
        switch (t_odddays) {
            case 0:
                System.out.println("The day is Sunday");
                break;
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
        }

        sc.close();
    }
}
