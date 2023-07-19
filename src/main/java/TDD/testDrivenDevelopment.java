package TDD;

public class testDrivenDevelopment {


        public static void main(String[] args) {
            System.out.println(smallerThanZero(-0.2F));
            System.out.println(sumSquareOrSubstract(4, 6, false));

        }

        public static boolean smallerThanZero(float number) {
            return number < 0;
        }


    public static int sumSquareOrSubstract(int number2, int number3, boolean a) {
        if (number2 > number3 && a == false) {
            return number2 + number3;
        } else if (a == true){
            return number2 - number3;
        }
        else {
            return number2 * number3;
        }
    }


}
