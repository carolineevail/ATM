/**
 * Created by Caroline on 2/3/16.
 */
public class Account {
    String name;
    String action;

    public Account() {

    }


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

    public boolean chooseAction() throws Exception {
        System.out.println("What would you like to do? [Check my Balance/Withdraw Funds/Delete Account/Cancel]");
        action = AutomatedTeller.scanner.nextLine();


        Double balance = AutomatedTeller.accounts.get(name);
        if (action.equalsIgnoreCase("Check my Balance")) {
            System.out.println("Your balance is $" + balance + ".");
        }
        else if (action.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you and please come again.");
            return false;
        }
        else if (action.equalsIgnoreCase("Withdraw Funds")) {
            System.out.println("Enter the amount you'd lke to withdraw.");
            String withdrawAmount = AutomatedTeller.scanner.nextLine();

            int withdrawInt = Integer.valueOf(withdrawAmount);
            if (withdrawInt <= balance) {
                System.out.println("Please take your cash.");
                AutomatedTeller.accounts.put(name, balance - withdrawInt);
            }
            else if (withdrawInt > balance) {
                throw new Exception("You may only withdraw up to " + balance + ".");
            }
        }

        else if (action.equalsIgnoreCase("Delete Account")) {
            AutomatedTeller.accounts.remove(name);
            System.out.println("Your account has been deleted.");
            return false;
        }

        return true;
    }
}
