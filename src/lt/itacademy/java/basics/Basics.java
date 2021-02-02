package lt.itacademy.java.basics;
import java.lang.Math;
import java.util.Scanner;

public class Basics {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name, surname and age (all separated by blank space).");
        String info = scan.nextLine();
        String[] infoArr = info.split(" ", 3);
        String name = infoArr[0];
        String surname = infoArr[1];
        int age = Integer.parseInt(infoArr[2]);
        System.out.println("Hello I am " + name + " " + surname + " " + age +
                ". I am attending IT Academy 2021!");

        System.out.println("------TASK 2------");
        char h = 'H';
        int one = 1;
        int three = 3;
        char w = 'w';
        char zero = '0';
        float pointTwo = 2.0F;
        boolean notFalse = true;
        System.out.println(h +""+ three +""+ one +""+ one +""+ zero + " "+ w +""+ zero + 'r' + one + 'd' + " " + pointTwo + " " + notFalse);
        System.out.println("------TASK 3------");
        maths(-3, -56);

    }
    static void maths(int x, int y){
        System.out.println("Numbers are " + x + " and " + y);
        System.out.println("Sum " + (x + y));
        System.out.println("Difference " + (x - y));
        System.out.println("Product " + (x * y));
        System.out.println("Distance " + Math.abs(x-y));

        int max, min = 0;
        if (x >= y){
            max = x;
            min = y;
        }
        else{
            max = y;
            min = x;
        }
        System.out.println("Maximum " + max);
        System.out.println("Minimum " + min);
    }

}
