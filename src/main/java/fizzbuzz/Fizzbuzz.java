package fizzbuzz;

public class Fizzbuzz {

public static void main(String[] args) {
    System.out.println(fizzbuzz(15));
}

        public static String fizzbuzz (int numbers) {
            if (numbers % 5 ==0 && numbers % 3 == 0) {
                return "fizzbuzz";
            } else if (numbers % 3 == 0) {
                return "fizz";
            } else if (numbers % 5 == 0) {
                return "buzz";
            } else {
                return Integer.toString(numbers);
            }
        }

}
