package lt.itacademy.java.basics;


public class Loops {
    public static final int HOURS = 24;
    public static final int MINUTES = 60;
    public static void main(String[] args) {
        System.out.println("------TASK 8------");
        int days = 365;
        int hours = 0;
        int minutes = 0;
        for(int i = 0; i < days; ++i){
            for(int j = 0; j < HOURS; ++j){
                hours++;
                for(int m = 0; m < MINUTES; ++m){ //no multiplication at all ;)
                    minutes++;
                }
            }
        }
        System.out.println("There are " + hours + " hours or " + minutes +" minutes in one year.");
        System.out.println("------TASK 9------");
        hours = 0;
        minutes = 0;
        int daysCouter = 0;
        int hoursCounter,minsCounter;
        while(daysCouter < days){
            hoursCounter = 0;
            while(hoursCounter < HOURS){
                hours++;
                minsCounter = 0;
                while (minsCounter < MINUTES){
                    minutes++;
                    minsCounter++;
                }
                hoursCounter++;
            }
            daysCouter++;
        }
        System.out.println("There are " + hours + " hours or " + minutes +" minutes in one year.");


        System.out.println("------TASK 10------");
        int num = 6;
        System.out.println("Factorial of number " + num + " is " + getFactorial(num) +".");
    }
    public static int getFactorial(int number){
        int factorial = 1;
        for(int j = number; j >0; --j){
            factorial *= j;
        }
        return factorial;
    }
}
