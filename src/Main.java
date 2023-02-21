import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задача1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] numbers2 = {1.57, 7.654, 9.986};
        byte[] bNumbers = new byte[3];
        bNumbers[0] = 25;
        bNumbers[1] = 63;
        bNumbers[2] = 95;
        System.out.println(numbers[2]);
        System.out.println(numbers2[2]);
        System.out.println(bNumbers[2]);
    }

    private static void task2() {
        System.out.println("Задача2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] numbers2 = {1.57, 7.654, 9.986};
        byte[] bNumbers = new byte[3];
        bNumbers[0] = 25;
        bNumbers[1] = 63;
        bNumbers[2] = 95;
        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println(numbers2[0] + ", " + numbers2[1] + ", " + numbers2[2]);
        System.out.println(bNumbers[0] + ", " + bNumbers[1] + ", " + bNumbers[2]);
    }

    private static void task3() {
        System.out.println("Задача3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = numbers.length - 1; i >= 0; i = i - 1) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] numbers2 = {1.57, 7.654, 9.986};
        for (int d = numbers2.length - 1; d >= 0; d = d - 1) {
            System.out.print(numbers2[d]);
            if (d != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        byte[] bNumbers = new byte[3];
        bNumbers[0] = 25;
        bNumbers[1] = 63;
        bNumbers[2] = 95;
        for (int b = bNumbers.length- 1; b >= 0; b = b - 1) {
            System.out.print(bNumbers[b]);
            if (b != 0) {
                System.out.print(", ");
            }
        }
    }
    private static void task4() {
        System.out.println();
        System.out.println("Задача4");
        int[] numbers = {1, 2, 3};
       for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] % 2 != 0) {
               numbers[i] ++;
           }
    }
        System.out.println(Arrays.toString(numbers));
}
    }