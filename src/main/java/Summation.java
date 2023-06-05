import java.util.Scanner;
public class Summation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib den ersten Wert ein: ");
        int num1 = scanner.nextInt();

        System.out.print("Gib den zweiten Wert ein: ");
        int num2 = scanner.nextInt();

        int sum = sumTwoNumbers(num1, num2);
        System.out.println("Die Summe der beiden Werte ist: " + sum);

        System.out.println(checkIfGreaterThan100(num1, num2));

        scanner.close();
    }

    public static int sumTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }


    public static boolean checkIfGreaterThan100(int num1, int num2) {
        if (num1 > 100 || num2 > 100) {
            return true;
        } else
            return false;
    }
}


