import java.util.*;

public class AreaFind {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Press the  find of area : \n 1 press for Circle: \n 2 press for Square: \n 3 Press for Rectangle:\n 4 Press for Triangle:");
        System.out.println("Enter the Chooice");
        int Chooice = sc.nextInt();

        switch (Chooice) {
            case 1:
                System.out.println("Enter the radious of circle");
                int r = sc.nextInt();
                double ar = 3.14 * r;
                System.out.println("The arae of circle is " + ar);
                break;

            case 2:
                System.out.println("Enter the side of square");
                int s = sc.nextInt();
                double side = s * s;
                System.out.println("The area of square is " + side);
                break;

            case 3:
                System.out.println("Enter the Rectangle of length");
                float l = sc.nextFloat();
                System.out.println("Enter the width");
                float w = sc.nextFloat();
                double re = l * w;
                System.out.println("The Rectangle is: " + re);
                break;

            case 4:
                System.out.println("Enter the base of triangle ");
                float b = sc.nextFloat();
                System.out.println("Enter the height of triangle");
                float h = sc.nextFloat();
                double trin = (b * h) / 2;
                System.out.println("The Area of triangle is : " + trin);

                break;
            default:
                System.out.println("Please Enter the valid area");

        }
    }

}
