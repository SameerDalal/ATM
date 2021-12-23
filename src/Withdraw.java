public class Withdraw {

    public static int Withdraw(int amountToWithdraw){

        ATM_main m = new ATM_main();

            System.out.println("Your current balance is: $" + m.currentBalance);

            m.currentBalance = m.currentBalance - amountToWithdraw;

            System.out.println("Your new balance is: $" + m.currentBalance);

            return m.currentBalance;
    }
}
