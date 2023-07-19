package testFizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFizzbuzz {

        @Test

        public void testFizzbuzz(){
            //When
            String actual = fizzbuzz.Fizzbuzz.fizzbuzz(50);


            //Then
            String expected = "buzz";

            Assertions.assertEquals(actual, expected);

        }

}
