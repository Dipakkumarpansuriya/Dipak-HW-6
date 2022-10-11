package week6hwDipak;
/*14. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/

import java.text.DecimalFormat;

public class rectangle14 {
    float W = 5.6f;
    float H = 8.5f;

    public static void main(String[] args) {
        perameter();
    }
    public static void perameter(){
        DecimalFormat two = new DecimalFormat("00.00");
        System.out.println("Area is 5.6*8.5 = " + two.format(5.6*8.5));
        System.out.println("Perameter is 2 * (5.6 + 8.5) = " + two.format(2*(5.6+8.5)));
    }
}
