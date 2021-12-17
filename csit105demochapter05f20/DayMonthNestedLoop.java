package csit105demochapter05f20;

/**
 * This program demonstrates nested loop using month/day Date Written:
 * 10/24/2004 Date modified:	10/22/2006 - tidied up
 *
 * @author Stephen Brower
 */
public class DayMonthNestedLoop {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int month, day, lastDay;

        for (month = 10; month <= 12; month++) {
            switch (month) {
                case 9:
                case 4:
                case 6:
                case 11:
                    lastDay = 30;
                    break;
                case 2:
                    lastDay = 28;
                    break;
                default:
                    lastDay = 31;
            }

            for (day = 1; day <= lastDay; day++) {
                System.out.printf("Date is %d/%d\n", month, day);
            }
        }
    }
}
