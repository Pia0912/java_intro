import java.util.Scanner;
public class BonusAufgabe {
public static void main(String[] args) {
            int a = 3;
            int b = 10;

            int sum = sumTwoNumbers(a, b);
            System.out.println("Summe: " + sum);

            String sumString = getSumString(a, b);
            System.out.println(sumString);

        }

        //Als Methode:
        public static int sumTwoNumbers(int num1, int num2) {
            int sum = num1 + num2;
            return sum;
        }

        public static String getSumString(int num1, int num2) {
            int sum = sumTwoNumbers(num1, num2);
            String sumString = "Summe: " + sum;
            return sumString;
        }


}
