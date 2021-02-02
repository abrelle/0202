package lt.itacademy.java.basics;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        System.out.println("------TASK 6------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three positive integers (all separated by blank space).");
        String info = scan.nextLine();
        String[] infoArr = info.split(" ", 3);
        int x = Integer.parseInt(infoArr[0]);
        int y = Integer.parseInt(infoArr[1]);
        int z = Integer.parseInt(infoArr[2]);
        if(x == z && x == y){
            System.out.println("Triangle is Equilateral Sides: " + x + " " + y + " " + z);
        }
        else if( (x == z && x != y) || (x == y && x != z)|| (y == z && x != y)){
            System.out.println("Triangle is Isosceles. Sides: " + x + " " + y + " " + z);
        }
        else{
            System.out.println("Triangle is Scalene. Sides: " + x + " " + y + " " + z);
        }

        System.out.println("\n\n------TASK 7------");
        destinationInfo(100, 6, 7, 1.25);
    }

    static void destinationInfo(double distance, double fuel, double fuelUsage, double fuelPrice){
        double howMuchWillUse = (distance * fuelUsage) / 100;
        if(howMuchWillUse <= fuel){
            System.out.println("Distance is " + distance + ". Car is able to reach the destination. " +
                    "It will have " + (fuel - howMuchWillUse) + " liters of fuel left.");
        }
        else{
            int shortage = (int) (howMuchWillUse - fuel);
            System.out.println("Distance is " + distance + ". Car is not able to reach the destination. " +
                    "It needs " + shortage + " liters of fuel. It will cost " + (shortage * fuelPrice));
        }

    }
}
