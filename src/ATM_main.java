import java.util.Scanner;




public class ATM_main {

    public static int currentBalance;

    public static void main(String[] args){
        starterMethod();

    }

    public static void starterMethod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1). Continue with ATM Machine \n2). Quit program");
        int proceed = scan.nextInt();

        if (proceed == 1) {
            System.out.println("Welcome to ATM Machine");
            // creating objects
            Person p = new Person();
            // personal info
            p.setName();
            p.setDate();
            p.toString();
            currentBalance = 0;
            goTo();
        } else {
            System.exit(0);
        }
    }


    public static void goTo(){
        // objects
        Person p = new Person();
        Withdraw w = new Withdraw();
        Deposit d = new Deposit();
        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to do next?? \n 1). Deposit Money \n 2). Withdraw Money \n 3). Your Profile \n 4). Exit from your Account");
        int goTo = scan.nextInt();

        switch(goTo){
            case (1):
                // deposit money class
                System.out.println("Amount to deposit: ");
                int amt = scan.nextInt();
                d.depositAmount(amt);
                goTo();
                break;
            case (2):
                if (currentBalance <= 0){
                    System.out.println("You need to have some balance before you can withdraw!!");
                    goTo();
                } else {
                    System.out.println("Amount to withdraw: ");
                    int amt1 = scan.nextInt();
                    w.Withdraw(amt1);
                    goTo();
                }
                break;
            case (3):
                // access profile class
                System.out.println(p.toString());
                goTo();
                break;
            case (4):
                starterMethod();
                break;
        }
    }
}

