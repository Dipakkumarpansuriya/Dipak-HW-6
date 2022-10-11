package week6hwDipak;
/*20. Write a Java Program to print as below.
"+------------------------+"
"| |"
"| CORNER STORE |"
"| |"
"| 2015-03-29 04:38PM |"
"| |"
"| Gallons: 10.870 |"
"| Price/gallon: $ 2.089 |"
"| |"
"| Fuel total: $ 22.71 |"
"| |"
"+------------------------+"*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class print20 {
    public static void main(String[] args) {
     print20 obj = new print20();
      obj.Print();
    }
    public void Print(){
        System.out.println("\"+------------------------+\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"|      CORNER STORE      |\"");
        System.out.println("\"|                        |\"");
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatobj = DateTimeFormatter.ofPattern("dd/MM/yyy  HH:mm");
       String formatedDate = myDateObj.format(myFormatobj);
        System.out.println("\"|    " + formatedDate + "   |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| Gallons:       10.870  |\"");
        System.out.println("\"| Price/gallon: $ 2.089  |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| Fuel total:  $ 22.71   |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"+------------------------+\"");

    }
}
