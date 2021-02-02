package lt.itacademy.java.basics;
import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a positive number.");
    int input = scan.nextInt();
    System.out.println("------TASK 4------");
    if(input >= 0){
        System.out.println("Cube's volume:" + input*input*input);
        System.out.println("Cube's perimeter:" + 12*input);
    }
    else{
        System.out.println("You've entered a negative number.");
    }
        System.out.println("------TASK 5------");
        System.out.println(covert(2.4, 4));

    }
    static double covert(double feet, int inches) {
        double in = 2.54;
        return (12 * feet * in) + (inches * in);
    }
}
