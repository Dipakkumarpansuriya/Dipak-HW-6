package week6hwDipak;

/*3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.*/

public class instosta3 {
    int a=10;
    static String name = "Dipak";

    public static void main(String[] args) {
        instosta3 obj = new instosta3();
        obj.myNumber();
        myName();
    }
    public void myNumber(){
        System.out.println(a);
    }
    public static void myName(){
        System.out.println(instosta3.name);
    }
}

