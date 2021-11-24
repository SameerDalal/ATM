import java.util.Scanner;




public class ATM_main extends Deposit{

    public static void main(String[] args){
        System.out.println("Welcome to ATM Machine");
        starterMethod();

    }

    public static void starterMethod(){

        // creating objects
        Person p = new Person();
        Scanner scan = new Scanner(System.in);

        System.out.println("1). New User");
        System.out.println("2). Existing User");
        int newUser = scan.nextInt();


        if (newUser == 1){
            // personal info
            System.out.println("Welcome to ATM Machine");
            p.setName();
            p.setDate();
            p.toString();
            p.printPersonalInfo();
            System.out.println("What would you like to do next??");
            goTo();
        } else {
            goTo();
        }




        // need to check if the user is a new user or not

    }
    public static void goTo(){
        Deposit d = new Deposit();
        Person p = new Person();
        Scanner scan = new Scanner(System.in);


        System.out.println("1). Deposit Money");
        System.out.println("2). Withdraw Money");
        System.out.println("3). Transfer Money");
        System.out.println("4). Array Profile");
        System.out.println("5). Quit");
        int goTo = scan.nextInt();

        switch(goTo){
            case (1):
                // deposit money class
                d.depositAmount();
                goTo();
                break;
            case (2):
                // withdraw money class
                break;
            case (3):
                // transfer money class
                break;
            case (4):
                // access profile class
                p.printPersonalInfo();
                break;
            case (5):
                // quit program
                break;
        }
    }
}

