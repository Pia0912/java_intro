package passwortValidierung;

import java.util.Scanner;
import java.util.Arrays;

public class Passwortvalidierung {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bitte gib dein Passwort ein");

            String password = scanner.nextLine();  // Read user input

            scanner.close();

            String errorMessage = longEnough(password);
            if (errorMessage.isEmpty()) {
                System.out.println("Password is strong enough. Please remember your Password.");
            } else {
                System.out.println("Please try again: " + errorMessage);
            }
        }

        public static String longEnough(String password) {
            if (password.length() < 8) {
                return "Passwort zu kurz. Bitte wähle ein längeres PW.";
            }
            return containsNumber(password);
        }

        public static String containsNumber(String password) {
            if (!password.matches(".*[0-9].*")) {
                return "Passwort zu simple. Bitte noch Zahlen ergänzen.";
            }
            return containsUpperCaseLetter(password);
        }

        public static String containsUpperCaseLetter(String password) {
            if (!password.matches(".*[A-Z].*")) {
                return "Passwort zu simple. Bitte noch Großbuchstaben ergänzen.";
            }
            return containsLowerCaseLetter(password);
        }

        public static String containsLowerCaseLetter(String password) {
            if (!password.matches(".*[a-z].*")) {
                return "Passwort zu simple. Bitte noch Kleinbuchstaben ergänzen.";
            }
            return checkSpecialCharacter(password);
        }

        public static char[] specialCharacters = {'!', '"', '§', '$', '%', '&', '/', '(', ')', '=', '?', '`', '²', '³', '{', '[', ']', '}', 'ß', '´', '+', '*', '~', '#', '-', '_', ',', ';', '.', ':', 'µ', '<', '>', '|', '^', '°', '@', '€'};

        public static String checkSpecialCharacter(String password) {
            char[] charArray = password.toCharArray();
            for (char c : charArray) {
                if (containsSpecialCharacter(c)) {
                    return containsForbiddenWord(password);
                }
            }
            return "Passwort zu einfach. Bitte mach es komplexer. Verwende Sonderzeichen.";
        }

        public static boolean containsSpecialCharacter(char c) {
            for (char specialChar : specialCharacters) {
                if (c == specialChar) {
                    return true;
                }
            }
            return false;
        }

        public static String[] forbiddenWords = {"passwort", "password", "123", "12345"};

        public static String containsForbiddenWord(String password) {
            for (String forbiddenWord : forbiddenWords) {
                if (password.toLowerCase().contains(forbiddenWord)) {
                    return "Passwort zu einfach. Bitte mach es komplexer.";
                }
            }
            return "";

        }


}
