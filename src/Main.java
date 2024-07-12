public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, куратор!");
        System.out.println("Задача 1");

        int[] spending = new int[5];
        spending[0] = 4584;
        spending[1] = 4152;
        spending[2] = 8668;
        spending[3] = 1623;
        spending[4] = 7618;
        int sum = 0;
        for (int i = 0; i < spending.length; i++) {
            sum += spending[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();

        System.out.println("Задача 2");
        int[] spending1 = new int[5];
        spending1[0] = 2589;
        spending1[1] = 1448;
        spending1[2] = 3963;
        spending1[3] = 1853;
        spending1[4] = 9855;
        int maxSpending = 1;
        int minSpending = 999999;
        for (int i = 0; i < spending.length; i++) {
            final int spend = spending1[i];
            if (spend > maxSpending) {
                maxSpending = spend;
            }
            if (spend < minSpending) {
                minSpending = spend;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpending + " рублей. Максимальная сумма трат за неделю составила " + maxSpending + " рублей.");
        System.out.println();

        System.out.println("Задача 3");
        int[] accounting = {8466, 8462, 8186, 3245, 4563};
        double mid = 0;
        int max = 0;
        for (int i = 0; i < accounting.length; i++) {
            max += accounting[i];
            mid = max / accounting.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей.");
        System.out.println();

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}