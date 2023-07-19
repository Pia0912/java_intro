public class StringMethoden {
    public static void main(String[] args) {
            System.out.println(checkLongerThan20("hallihallo weristda?.........ich bin da"));
            System.out.println(checkIfFancy("the world is ugly"));
        }

        public static boolean checkLongerThan20 (String wordCheck){
            if(wordCheck.length() > 20) {
                return true;
            }else {
                return false;
            }
        }

        public static boolean checkIfFancy (String wordCheck2) {
            if(wordCheck2.contains("fancy")){
                return true;
            }else {
                return false;
            }
        }


}
