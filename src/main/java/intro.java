import java.lang.reflect.Array;
import java.util.Arrays;

public class intro {
    public static void main(String[] args){
        String myFirstStringVariable ="Hello cgn-23-2!!";

        myFirstStringVariable = "Hello World!!!";

        int myFirstIntegerValue = 3;
        int mySecondIntegerValue = 3 * myFirstIntegerValue;
        String sum = "Summe: ";

        System.out.println(sum + mySecondIntegerValue);

        char myFirstChar = 'p';

 //Float Ungenauigkeit
        //
        double myFirstDoubleValue = 0.1;
        double mySecondDoubleValue = 0.7;
        double sum1 = mySecondDoubleValue + myFirstDoubleValue;

        System.out.println(sum1);

        float myFirstFloatValue = 0.1f;
        float mySecondFloatValue = 0.7f;
        float sum2 = myFirstFloatValue + mySecondFloatValue;

        System.out.println(myFirstFloatValue + mySecondFloatValue);

        System.out.println(sum1 == sum2);


 //Test Berechnungen
 //
        float myThirdFloatValue = 0.23f;
        float myFourthFloatValue = 0.123456789f;
        double myThirdDoubleValue = 0.1;
        double sum3 = myThirdFloatValue + myThirdDoubleValue;


        System.out.println(myThirdDoubleValue / myThirdFloatValue);
        System.out.println(sum3);
        System.out.println(myFourthFloatValue*myThirdFloatValue);

        float a = 0.5f;
        double b = 0.5;
        System.out.println(a == b);


 //mehrere Namen in einer Variable
 //
        String[] names = new String[5];
        names[0] = "Pia";
        names[1] = "Felix";
        names[2] = "Anne";
        names[3] = "Caro";
        names[4] = "Nils";

        System.out.println(names[3]);



        int[] data = new int[3];
        data[0] = 123;
        data[1] = 234;
        data[2] = 345;


        System.out.println(data[0]);
        System.out.println(data[2]);
 //oder
 //
        System.out.println(data[0] + " " + data[2]);


        System.out.println(data[0] + data[1]);


        System.out.println(Array.getLength(data));
  //oder
  //
        System.out.println(data.length);


        System.out.println(Arrays.toString(data));




    }
}
