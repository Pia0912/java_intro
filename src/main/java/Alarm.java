public class Alarm {
    public static void main(String[] args) {
        System.out.println(countPeople(34));
        String alertLevel = "green";
        alertLevel(alertLevel);


    }
    public static String countPeople(int numberOfCustomers){
        if (numberOfCustomers >30) {
            return ("Zu viele Personen im Laden");
        }else if (numberOfCustomers == (30)) {
            return("Zähle nochmal & keine Personen mehr in den Laden lassen");
        } else {
            return("Maximale Personenzahl nicht überschritten.");
        }
    }

    public static void alertLevel(String colorOfAlarm) {
        switch (colorOfAlarm) {
            case "red":
                System.out.println("Keine Personen erlaubt.");
                break;
            case "yellow":
                System.out.println("max 30 Personen erlaubt.");
                break;
            case "green":
                System.out.println("max 60 Personen erlaubt.");
                break;
            default:
                String undefined= "Alarm ist kapputt.";
                break;
        }


    }

}

