package lt.itacademy.java.basics;

public class Optionals {
    public static final char RECURRING_LETTER = 'a';
    public static void main(String[] args){
        System.out.println(isPasswordValid("qwertyebdht66"));
        System.out.println(getNumOfRecurrences(10, "abcacabcac"));
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

    public static int getNumOfRecurrences(long times, String infString) {
        int j = 0;
        int numRecurrences = 0;
        for(int i = 0; i < times; i++){
            if(j >= infString.length()){
                j = 0;
            }
            if(infString.charAt(j) == RECURRING_LETTER){
                ++numRecurrences;
            }
            ++j;
        }
        return numRecurrences;
    }

    public static int sumOfString(String x, String y) {
        int xInt = Integer.parseInt(x);
        int yInt = Integer.parseInt(y);
        return xInt + yInt;
    }

}
