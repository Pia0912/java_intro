package TestAlarm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlarmTest {
    @Test
        void testCountPeopleInStore() {
            //Given int numberOfPeople = 30;

            //When
            String actual = Alarm.Alarm.countPeopleInStore(32);

            //Then
            String expected = "Zu viele Personen im Laden";


            Assertions.assertEquals(actual, expected);
        }

        @Test
        void testCombinedAlert(){


            //When
            String actual = Alarm.Alarm.combinedAlert("yellow", 50);


            //Then
            String expected = "Max. Personenanzahl ist 30. Bitte keinen mehr im Laden lassen";


            Assertions.assertEquals(actual, expected);
        }



}
