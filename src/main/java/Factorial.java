public class Factorial {
//*Schreibe eine Funktion, welche die Fakultät einer Zahl berechnet. Nutze dafür eine for Schleife
        public static void main (String[] args){


            System.out.println("5! = " + factorial(5));

        }
        public static int factorial(int number){
            int result = 1;
            for (int i = 1;i <= number;i++){
                result = result * i;
            }
            return result;
        }
        //oder
        // public static int factorial(int number1) {
        // int result = 1;
        // int i = 1;
        // while (i <= number1) {
        //     result = result * i;
        //     i++;
        // }
        //return result;
        //}



}

