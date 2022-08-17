public class Withdraw {
    public Withdraw(int amount) {
        long balance = Util.initialBalance;
        if (amount < balance) {
            System.out.println("***Successfully Withdrawal***");
            Util.initialBalance = balance - amount;
            System.out.println("Current Balance is :" + Util.initialBalance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
