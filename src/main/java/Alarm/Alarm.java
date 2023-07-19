package Alarm;

public class Alarm {
public static void main(String[] args) {

    System.out.println(countPeopleInStore(70));
    System.out.println(alertLevel("green"));
    System.out.println(combinedAlert("yellow", 50));
}

    public static String countPeopleInStore (int numberOfCustomers) {
        if (numberOfCustomers > 30 ) {
            return "Zu viele Personen im Laden";
        } else if (numberOfCustomers >= 30) {
            return "Zähle nochmal & keine Personen mehr in den Laden lassen";
        } else {
            return "Maximale Personenzahl nicht überschritten.";
        }
    }

    public static String alertLevel (String colorOfAlarm) {

        switch (colorOfAlarm) {
            case "red":
                return ("Keine Personen erlaubt");
            case "yellow":
                return ("max. 30 Personen erlaubt");
            case "green":
                return ("max. 60 Personen erlaubt");
            default:
                return ("Alarm ist kaputt bitte reparieren");
        }
    }


    public static String combinedAlert (String colorOfAlarm1, int numberOfPeople1) {
        if (colorOfAlarm1 == "red") {
            return "Keine Personen erlaubt";
        }  else if(colorOfAlarm1 == "yellow" && numberOfPeople1 > 30) {
            return "Max. Personenanzahl ist 30. Bitte keinen mehr im Laden lassen";
        } else if (colorOfAlarm1 == "yellow" && numberOfPeople1 <= 30){
            return "Max. Personenanzahl ist 30. Maximale Personenzahl nicht überschritten.";
        } else if (colorOfAlarm1 == "green" && numberOfPeople1 > 60) {
            return "Max. Personenanzahl ist 60. Bitte keinen mehr im Laden lassen";
        } else if (colorOfAlarm1 == "green" && numberOfPeople1 <= 60) {
            return "Max. Personenanzahl ist 60. Maximale Personenzahl nicht überschritten.";
        }
        else {
            return "Bitte Alarm und Personenanzahl nochmal checken";
        }
    }
}


