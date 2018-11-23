import java.util.Scanner;

public class MyCalculator {
  
    public static void main(String[] args) {
        double n1, n2;
        String operation;
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Ange första siffran");
        n1 = scannerObject. nextDouble();

        System.out.println("Ange andra siffran");
        n2 = scannerObject. nextDouble();

        Scanner op = new Scanner(System.in);
        System.out.println("Ange   +  |  -  |  /  |  *");
        operation = op.next();

        switch (operation)  {
        case "+":
            System.out.println("Svaret är " + (n1 + n2));
            break;

        case "-":
            System.out.println("Svaret är " + (n1 - n2));
            break;

        case "/":
            System.out.println("Svaret är " + (n1 / n2));
            break;

        case "*":
            System.out.println("Svaret är " + (n1 * n2));
            break;

        default:
            System.out.println("fel");

        }
    }
}
