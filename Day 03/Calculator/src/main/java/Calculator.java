import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Menu menuObj = new Menu();
        Calculations calculationsObject = new Calculations();
        menuObj.displayMenu();

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        System.out.println(choice);
        if (choice > 0 || choice <= 5) {
            switch (choice) {
                case 1:
                    System.out.println(calculationsObject.add());
                    break;
                case 2:
                    System.out.println(calculationsObject.sub());
                    break;
                case 3:
                    System.out.println(calculationsObject.mul());
                    break;
                case 4:
                    System.out.println(calculationsObject.div());
                    break;
                case 5:
                    System.out.println(calculationsObject.mod());
                    break;
            }
        } else {
            System.out.println("error");
        }
    }

}
