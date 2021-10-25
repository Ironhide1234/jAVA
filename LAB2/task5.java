public class Main {
    public static void main(String[] args) {
        int[] days = new int[] {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 314,334};
        int[] daysLeap = new int[] {0, 31, 59, 91, 121, 152, 182, 213, 244, 274, 315,335};
        String[] months = new String[] {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        int day = Integer.parseInt(args[0]);
        boolean leapYear = Boolean.parseBoolean(args[1]);
        int counter = 0;
        if (leapYear) {
            while (daysLeap[counter++] <= day) ;
            System.out.println(months[counter - 2] + " " + day % daysLeap[counter - 2]);
        } else {
            while (days[counter++] <= day) ;
            System.out.println(months[counter - 2] + " " + day % days[counter - 2]);
        }
    }
}