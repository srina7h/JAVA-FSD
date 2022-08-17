public class Deposit {
    public Deposit(int amount) {
        long balance = Util.initialBalance;
        System.out.println("SUCCESFULLY WITHDRAWAL");
        Util.initialBalance = balance + amount;
        System.out.println("Your Current Balance Is : "+Util.initialBalance );

    }
}