import java.util.Scanner;

public class Calculations {

    public int add() {
        Scanner scanner = new Scanner(System.in);
        int numbOne = scanner.nextInt();
        int numbTwo = scanner.nextInt();
        return numbOne + numbTwo;
    }

    public int sub() {
        Scanner scanner = new Scanner(System.in);
        int numbOne = scanner.nextInt();
        int numbTwo = scanner.nextInt();
        return numbOne-numbTwo;
    }

    public int mul() {
        Scanner scanner = new Scanner(System.in);
        int numbOne = scanner.nextInt();
        int numbTwo = scanner.nextInt();
        return numbOne*numbTwo;
    }

    public int div() {
        Scanner scanner = new Scanner(System.in);
        int numbOne = scanner.nextInt();
        int numbTwo = scanner.nextInt();
        return numbOne/numbTwo;
    }

    public int mod() {
        Scanner scanner = new Scanner(System.in);
        int numbOne = scanner.nextInt();
        int numbTwo = scanner.nextInt();
        return numbOne%numbTwo;
    }
}
