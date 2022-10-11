package week6hwDipak;

/*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.*/

public class statoins4 {
    int a = 10;
    int b = 20;
    static String name = "Dipak";
    static String surname = "Pansuriya";

    public static void main(String[] args) {
        statoins4 obj = new statoins4();
        obj.myName();
        myNumber();
    }
    public void myName() {
        System.out.println(a);
        System.out.println(b);
    }
    public static void myNumber() {
        System.out.println(name);
        System.out.println(surname);
    }

}