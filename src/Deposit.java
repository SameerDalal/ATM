import java.util.Scanner;

public class Deposit {

     public int currentBalance;

    public void depositAmount(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Your currently have $" + currentBalance);
        System.out.println("Enter amount you would like to deposit");
        int amountDeposited = scan.nextInt();

        currentBalance = currentBalance + amountDeposited;

        System.out.println("Your new balance is $" + currentBalance);
    }

}
