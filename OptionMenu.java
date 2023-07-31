import java.util.*;
import java.text.DecimalFormat;

public class OptionMenu extends Accounts {
    Scanner input = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat("'$' ###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<>();

    public  void Login(){
        int i = 1;
        do{
            data.put(12345, 1234);
            data.put(98765, 9876);

            System.out.println("*******************");
            System.out.println("Welcome to IBS ATM");
            System.out.println("*******************");    

            System.out.print("Enter your account number: ");
            setAccountNumber(input.nextInt());
            System.out.print("Enter your PIN number: ");
            setPinNumber(input.nextInt());

            int an = getAcccountNumber();
            int pn = getPinNumber();
                
            if (data.containsKey(an) && data.get(an) == pn) {
                getAcccountType();
            }else{
                System.out.println("Mismatched Account Number and Pin Number");
            }

        } while(i == 1);
    }

    public void getAcccountType(){
        System.out.println("Select your account type:");
        System.out.println("1. Current Account");
        System.out.println("2. Savings Account");
        System.out.println("3. Exit");

        int choice = input.nextInt();

        switch(choice){
            case 1:
                getCurrent();
                break;
            case 2:
                getSavings();
                break;
            case 3:
                System.out.println("Thankyou for visiting us.");
                break;
            default:
                System.out.println("Invalid input.");
                getAcccountType();
                break;  
        }

    }

    public void getCurrent(){
        System.out.println("Current Account: ");
        System.out.println("1. Check Balance ");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance: " + format.format(getCurrentBalance()));
                break;

            case 2:
                getCurrentWithdrawInput();
                break;

            case 3:
                getCurrentDepositInput();
                break;
            
            case 4:
                System.out.println("Thankyou for visiting us.");
                break;

            default:
                System.out.println("Invalid input.");
                getCurrent();
                break; 
            
        }

    }

    public void getSavings(){
        System.out.println("Savings Account: ");
        System.out.println("1. Check Balance ");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance: " + format.format(getSavingsBalance()));
                break;

            case 2:
                getSavingsWithdrawInput();
                break;

            case 3:
                getSavingsDepositInput();
                break;
            
            case 4:
                System.out.println("Thankyou for visiting us.");
                break;

            default:
                System.out.println("Invalid input.");
                getSavings();
                break;
        }

    }

    
}
