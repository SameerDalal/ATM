import java.util.Scanner;

public class Person {

     public Date dateOfBirth;
     public String name;


    public void setPersonalInfo(){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name");
        name = scan.next();

        System.out.println("What is your date of birth?");
        dateOfBirth = new Date();
        dateOfBirth.setDate();

    }
     public void printPersonalInfo(){
        System.out.println(dateOfBirth);
        System.out.println(name);
     }
}