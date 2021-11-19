import java.util.Scanner;

public class ATM_main extends Person{

    public static void main(String[] args){
        System.out.println("Welcome to ATM Machine");
        starterMethod();
        
    }

    public static void starterMethod(){
        System.out.println("1). See your Transaction History");
        System.out.println("2). Withdraw Money");
        System.out.println("3). Deposit Money");
        System.out.println("4). Transfer Money");
        System.out.println("5). Quit");
        Scanner scan = new Scanner(System.in);
        int goTo = scan.nextInt();
        switch(goTo) {
            case (1):
                // personal info
                System.out.println("Welcome to ATM Machine");
                Person p = new Person();
                p.setPersonalInfo();
                p.printPersonalInfo();
                break;
            case (2):
                // withdraw money class
                break;
            case (3):
                // deposit money class
                break;
            case (4):
                // transfer money class
                break;
            case(5):
                // quit program class
                break;
        }
    }
}

