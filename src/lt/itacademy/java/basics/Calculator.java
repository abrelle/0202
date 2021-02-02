package lt.itacademy.java.basics;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Please enter name of figure (Rectangle, Triangle, Square) and length of sides" +
                    "(all separated by spaces).");
            String info = scan.nextLine();
            String[] figure = info.split(" ");
            int x = 0, y = 0, z = 0;
            switch (figure[0]) {
                case "Rectangle":
                    x = Integer.parseInt(figure[1]);
                    y = Integer.parseInt(figure[2]);
                    if (x <= 0 || y <= 0) {
                        System.out.println("Length cannot be non-positive.");
                    } else {
                        System.out.println(figure[0] + " perimeter is " + 2 * (x + y) + " and area is " + x * y + ".");
                    }
                    break;
                case "Triangle":
                    x = Integer.parseInt(figure[1]);
                    y = Integer.parseInt(figure[2]);
                    z = Integer.parseInt(figure[3]);
                    if (x <= 0 || y <= 0 || z <= 0) {
                        System.out.println("Length cannot be non-positive.");
                    } else {
                        int perimeter = x + y + z;
                        int s = perimeter / 2;
                        int root = s * (s - x) * (s - y) * (s - z);
                        double area = Math.sqrt(root);
                        System.out.println(figure[0] + " perimeter is " + perimeter + " and area is " + area + ".");
                    }

                    break;
                case "Square":
                    x = Integer.parseInt(figure[1]);
                    if (x <= 0) {
                        System.out.println("Length cannot be non-positive.");
                    } else {
                        System.out.println(figure[0] + " perimeter is " + 4 * x + " and area is " + x * x + ".");
                    }
                    break;

                default:
            }
            System.out.println("Would you like to continue? Type y or n .");
            String choice = scan.nextLine();
            if (choice.equals("n")) {
                break;
            }
        }
    }

}

