public class Deposit extends ATM_main {



    public static int depositAmount(int amountDeposited){
        System.out.println("Your previous balance was: $" + currentBalance);

        currentBalance = currentBalance + amountDeposited;

        System.out.println("Your new balance is: $" + currentBalance);

        return currentBalance;
    }

}
