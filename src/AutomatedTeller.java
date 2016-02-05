import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Caroline on 2/3/16.
 */
public class AutomatedTeller {
    public static Scanner scanner = new Scanner(System.in);
    public static HashMap<String, Double> accounts = new HashMap<>();


    public static void main(String[] args) throws Exception {
        System.out.println("Hello!");

        while (true) {

            Account account = new Account();
            account.chooseName();

            if (!accounts.containsKey(account.name)) {
                System.out.println("Would you like to create an account? [yes/no]");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    accounts.put(account.name, 100.0);
                    System.out.println("Account created!");
                } else {
                    throw new Exception("You must have an active account to use this ATM.");

                }
            }

            while (true) {
                boolean shouldContinue = account.chooseAction();
                if (shouldContinue == false) {
                    break;
                }
            }
        }
    }




}
