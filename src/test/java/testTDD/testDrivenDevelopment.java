package testTDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testDrivenDevelopment {


        @Test
        public void testSmallerThanZero(){

            //When
            boolean actual = TDD.testDrivenDevelopment.smallerThanZero(100);

            //Then
            boolean expexted = false;


            Assertions.assertEquals(actual, expexted);



        }

    @Test
    public void testSumSquareOrSubstract(){
        //When
        int actual = TDD.testDrivenDevelopment.sumSquareOrSubstract(3,1, true);
        //Then
        int expected = 2;


        Assertions.assertEquals(actual, expected);

    }
}


