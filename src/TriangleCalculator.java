import java.util.Scanner;

public class TriangleCalculator {

    public static void main(String args[]) {

        Scanner keyboard = new Scanner(System.in);

        double length1;
        double length2;
        double length3;


        System.out.println("Enter the length of the 3 sides of a triangle: ");
        length1 = keyboard.nextDouble();
        length2 = keyboard.nextDouble();
        length3 = keyboard.nextDouble();
        keyboard.nextLine();

        if (checkEquilateral(length1,length2,length3)) {
            System.out.println("This triangle is Equilateral.");
        }else {
            System.out.println("This triangle is not Equilateral.");
            if (checkRightTriangle(length1,length2,length3)) {
                System.out.println("This triangle is a right triangle.");
            } else {
                System.out.println("This triangle is not a right triangle.");
            }
        }
    }

    // check if the triangle is equilateral
    public static boolean checkEquilateral(double length1, double length2, double length3){

        if (length1 == length2) {
            if (length2 == length3) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    //check if the triangle is right
    public static boolean checkRightTriangle(double length1, double length2, double length3){

        double square1, square2, square3;

        square1 = Math.pow(length1, 2);
        square2 = Math.pow(length2, 2);
        square3 = Math.pow(length3, 2);

        if (square1 == (square2 + square3)) {
            return true;
        }else if (square2 == (square1+square3)) {
            return true;
        }else if (square3 == (square1+ square2)) {
            return true;
        }else {
            return false;
        }
    }



}