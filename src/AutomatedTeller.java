import java.util.Scanner;

/**
 * Created by Caroline on 2/3/16.
 */
//commenting for git
public class AutomatedTeller {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        System.out.println("Hello!");

        Account account = new Account();
        account.chooseName();
        account.chooseAction();
    }




}
