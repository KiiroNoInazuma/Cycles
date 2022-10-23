public class Сomet {
    public static void main(String[] args) {
        int sysDate = 2022, forward = 100, back = 200, once = 79;

        for (int x = 0; x <= sysDate + forward; x += once) {
            if (x >= sysDate - back) {
                System.out.println(x);
            }
        }
    }
}
