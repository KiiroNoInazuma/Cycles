public class Happy_ticket {
    int total = 0;
    int partFirst = 1;
    int partSecond = 999999;

    int digitSum(int part) {
        return part % 1000 / 100 + part % 100 / 10 + part % 10;
    }

    void transformation(int ext) {
        System.out.print(ext % 1000 / 100 + "" + ext % 100 / 10 + "" + ext % 10);

    }

    public static void main(String[] args) {
        int first;
        int second;
        System.out.println("Билеты со счастливыми номерами: ");
        Happy_ticket ht = new Happy_ticket();
        for (int x = ht.partFirst; x <= ht.partSecond; x++) {
            first = x % 1000;
            second = x / 1000;
            if (ht.digitSum(first) == ht.digitSum(second)) {
                if (first < 100 || second < 100) {
                    ht.transformation(first);
                    ht.transformation(second);
                } else {
                    System.out.print(first);
                    System.out.print(second + "\t");
                }
                ht.total++;
                System.out.println();
            }
        }
        System.out.println("Всего счастливых билетов: " + ht.total);
    }
}


