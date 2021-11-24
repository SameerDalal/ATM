import java.util.ArrayList;
import java.util.Scanner;

public class Person{

     public String name;
     int day;
     int month;
     int year;


    ArrayList<ArrayList<String>> storeinfo = new ArrayList();


    public void setName(){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        name = scan.next();

        ArrayList<String> nameArray = new ArrayList<String>();
        nameArray.add(name);
        storeinfo.add(nameArray);
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
        String DOB = month + "/" + day + "/" + year;

        ArrayList<String> DOBArray = new ArrayList<>();
        DOBArray.add(DOB);
        storeinfo.add(DOBArray);

        return month + "/" + day + "/" + year;
    }

     public void printPersonalInfo(){
        System.out.println(storeinfo.get(0));
        System.out.println("Name: " + storeinfo.get(0).get(0));

     }
}