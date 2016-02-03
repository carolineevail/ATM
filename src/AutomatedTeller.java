import java.util.Scanner;

/**
 * Created by Caroline on 2/3/16.
 */
//commenting for git
public class AutomatedTeller {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        System.out.println("Hello!");
        chooseName();
        chooseAction();
    }

    public static void chooseName() throws Exception {
        System.out.println("Please enter your name.");
        String name = scanner.nextLine();

        if (!name.isEmpty()) {
            System.out.println("Thank you, " + name + ".");
        }
        else {
            throw new Exception("Name must be entered.");
        }
    }

    public static void chooseAction() throws Exception {
        System.out.println("What would you like to do? [Check my balance/Withdraw Funds/Cancel]");
        String action = scanner.nextLine();

        if (action.equalsIgnoreCase("Check my balance")) {
            System.out.println("Your balance is $100");
        }
        else if (action.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you and please come again.");
        }
        else if (action.equalsIgnoreCase("Withdraw Funds")) {
            System.out.println("Enter the amount you'd lke to withdraw.");
            String withdrawAmount = scanner.nextLine();
            int withdrawInt = Integer.valueOf(withdrawAmount);
            if (withdrawInt <= 100) {
                System.out.println("Please take your cash.");
            }
            else if (withdrawInt > 100) {
                throw new Exception("You may only withdraw up to $100.");
            }
        }
    }
}
