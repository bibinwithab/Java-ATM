import java.text.DecimalFormat;
import java.util.Scanner;

public class Accounts{
    private int AccountNumber;
    private int PinNumber;

    private double currentBalance = 0;
    private double savingsBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat("'$' ###,##0.00");

    public int setAccountNumber(int AccountNumber){
        this.AccountNumber = AccountNumber;
        return AccountNumber;
    }
    public int getAcccountNumber(){
        return AccountNumber;
    }

    
    public int setPinNumber(int PinNumber){
        this.PinNumber = PinNumber;
        return PinNumber;
    }
    public int getPinNumber(){
        return PinNumber;
    }
    
    
    public double getCurrentBalance(){
        return currentBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }

    
    public double CurrentWithdraw(double amount){
        currentBalance = currentBalance-amount;
        return currentBalance;
    }
    public double SavingsWithdraw(double amount){
        savingsBalance = savingsBalance-amount;
        return savingsBalance;
    }

    public double CurrentDeposit(double amount){
        currentBalance = currentBalance+amount;
        return currentBalance;
    }
    public double SavingsDeposit(double amount){
        savingsBalance = savingsBalance+amount;
        return savingsBalance;
    }

    public void getCurrentWithdrawInput(){
        System.out.println("Available Balance: " + format.format(currentBalance));

        System.out.print("Enter the amount to be withdrawn: \n" );
        double amount = input.nextDouble();

        if((currentBalance - amount) >= 0){
            CurrentWithdraw(amount);
            System.out.println("New Available Balance: " + format.format(currentBalance));
        }else{
            System.out.println("Insufficient Funds.");
        }
    }
    public void getCurrentDepositInput(){
        System.out.println("Avaiable Balance: ");

        System.out.print("Enter the amount to be deposited: \n");
        double amount = input.nextDouble();

        CurrentDeposit(amount);
        System.out.println("New Available Balance: " + format.format(currentBalance));
    }


    public void getSavingsWithdrawInput(){
        System.out.println("Available Balance: " + format.format(savingsBalance));

        System.out.print("Enter the amount to be withdrawn: \n" );
        double amount = input.nextDouble();

        if((savingsBalance - amount) >= 0){
            SavingsWithdraw(amount);
            System.out.println("New Available Balance: " + format.format(savingsBalance));
        }else{
            System.out.println("Insufficient Funds.");
        }
    }
    public void getSavingsDepositInput(){
        System.out.println("Avaiable Balance: ");

        System.out.print("Enter the amount to be deposited: \n");
        double amount = input.nextDouble();

        SavingsDeposit(amount);
        System.out.println("New Available Balance: " + format.format(savingsBalance));
    }

    public void exit(){
        System.out.println("Thankyou for visiting us.");
        System.exit(1);
    }
    
}
