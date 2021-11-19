import java.util.Scanner;

public class Date {

    int day;
    int month;
    int year;

    public void setDate(){
        Scanner scan = new Scanner(System.in);

        System.out.println("What day were you born");
        day = scan.nextInt();

        System.out.println("What month?");
        month = scan.nextInt();

        System.out.println("What year");
        year = scan.nextInt();
    }
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
