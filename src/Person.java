import java.util.ArrayList;
import java.util.Scanner;

public class Person{

     ATM_main m = new ATM_main();
     public static String name;
     static int day;
     static int month;
     static int year;




    public void setName(){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        name = scan.next();
    }

    public void setDate(){
        Scanner scan = new Scanner(System.in);

        System.out.println("What day were you born");
        day = scan.nextInt();

        System.out.println("What month?" );
        month = scan.nextInt();

        System.out.println("What year");
        year = scan.nextInt();
    }


    public String toString() {
        return "DOB: " +  month + "/" + day + "/" + year + "\nName: " + name + "\n" + "Your balance: $" + m.currentBalance;
    }


}