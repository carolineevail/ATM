/**
 * Created by Caroline on 2/3/16.
 */
public class Account {
    String name;
    String action;

    public void chooseName() throws Exception {
        System.out.println("Please enter your name.");
        name = AutomatedTeller.scanner.nextLine();

        if (!name.isEmpty()) {
            System.out.println("Thank you, " + name + ".");
        }
        else {
            throw new Exception("Name must be entered.");
        }
    }

    public void chooseAction() throws Exception {
        System.out.println("What would you like to do? [Check my balance/Withdraw Funds/Cancel]");
        action = AutomatedTeller.scanner.nextLine();

        if (action.equalsIgnoreCase("Check my balance")) {
            System.out.println("Your balance is $100");
        }
        else if (action.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you and please come again.");
        }
        else if (action.equalsIgnoreCase("Withdraw Funds")) {
            System.out.println("Enter the amount you'd lke to withdraw.");
            String withdrawAmount = AutomatedTeller.scanner.nextLine();
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
