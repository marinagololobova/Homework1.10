import java.util.Arrays;
import java.util.IntSummaryStatistics;



public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;

        System.out.println("Задание 1");
        for (int element: arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println("Задание 2");
        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");


        System.out.println("Задание 3");
        int numberOfMonths = 30;
        double averageSum = sum / numberOfMonths;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");


        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}