package week6hwDipak;

/*16. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101*/
public class binary16 {


    public static void main(String[] args) {
        Binary();
    }

    public static void Binary() {
        String x = "10";
        String y = "11";
        int decimal1 = Integer.parseInt(x, 2);
        int decimal2 = Integer.parseInt(y, 2);
        int decimal3 = decimal1 + decimal2;
        String binary = Integer.toBinaryString(decimal3);
        System.out.print("Sum of two binary number: ");
        System.out.println(binary);


    }

}
