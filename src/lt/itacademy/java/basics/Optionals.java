package lt.itacademy.java.basics;

public class Optionals {
    public static final char RECURRING_LETTER = 'a';
    public static void main(String[] args){
        if(isPasswordValid("qwertyebdht66")){
            System.out.println("Password is valid.");
        }
        System.out.println(getNumOfRecurrences(10, "abcac"));
        System.out.println(sumOfString("103", "563"));

    }
    public static boolean isPasswordValid(String pass){
        if(pass.length()<10){
            return false;
        }
        int numDigits = 0;
        char character;
        for(int i = 0; i < pass.length();++i){
            character = pass.charAt(i);
           if(!(Character.isLetter(character) || Character.isDigit(character))){
               return false;
           }
            if(Character.isDigit(character)) {
                numDigits++;
            }
        }
        return numDigits >= 2;
    }

    public static long getNumOfRecurrences(long times, String infString) {
        long numRecurrences = 0;
        long numSubstrings = (times / infString.length());
        long lenLeftoverSubstrings = times % infString.length();

        for(int i = 0; i < infString.length(); i++) {
            if(infString.charAt(i) == RECURRING_LETTER){
                ++numRecurrences;
            }
        }
        numRecurrences *= numSubstrings;

        for(int i = 0; i < lenLeftoverSubstrings; i++) {
            if(infString.charAt(i) == RECURRING_LETTER){
                ++numRecurrences;
            }
        }
        return numRecurrences;
    }

    public static int sumOfString(String x, String y) {
        int xInt = Integer.parseInt(x);
        int yInt = Integer.parseInt(y);
        return xInt + yInt;
    }

}
