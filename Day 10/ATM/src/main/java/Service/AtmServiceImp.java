package Service;

import Utils.AtmUtils;
import jdk.jshell.execution.Util;

public class AtmServiceImp implements AtmService {
    public void withDraw(){

        System.out.println();

    }
    public void balance(){
        long balnce = AtmUtils.initialBalance;


    }
    public void deposit(){

    }
    public void PrintMainMenu() {
        while (true) {
            System.out.println("Welcome To ATM");
            System.out.println("1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. BankBalance");
            System.out.println("4. Exit");

            int Choice = 0;
            switch (Choice) {
                case 1:
                    System.out.println("Enter The Amount");

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("*Please Enter Valid Input*");
                    break;


            }
        }
    }
}
