public class Weekend {
    public static void main(String[] args) {
        int daysMonth = 31;
        int weekendNow = 1;
        int sunday;
        for (int saturday = weekendNow; saturday<=daysMonth; saturday+=7){
            sunday = saturday+1;
            System.out.println(saturday+ " - суббота");
            System.out.println(sunday+ " - воскресенье");
        }
    }
}
