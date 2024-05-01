import java.util.*;
public class ATMInterface
{
    public static void Balance(int balance)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("\nWant to check balance?\nType YES or NO\n");
        String balanceView = s.next();
        if(balanceView.equals("YES") || balanceView.equals("yes"))
        {
            System.out.print("Your Balance is " + balance);
            ATM(balance);
        }
        else
        {
            System.out.print("Thanks for attempting");
            ATM(balance);
        }
    }
    public static void ATM(int balance)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("\n1.Withdraw\n");
        System.out.print("2.Deposit\n");
        System.out.print("3.Check Balance\n");
        System.out.print("4.EXIT\n");
        System.out.print("Enter your Choice:");
        int choice = s.nextInt();
        switch(choice)
        {
            case 1:
            {

                System.out.print("Enter the withdrawn amount:");
                int withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.print("Please collect your money " + withdraw);
                    Balance(balance);
                }
                else
                {
                    System.out.print("Insufficient Balance");
                }
                break;
            }
            case 2:
            {
                System.out.print("Enter the deposit amount:");
                int deposit = s.nextInt();
                balance = balance + deposit;
                System.out.print("Your amount has been deposited");
                Balance(balance);
                break;
            }
            case 3:
            {
                System.out.print("Your balance is " + balance);
                ATM(balance);
                break;
            }
            case 4:
            {
                System.out.print("Thanks for Attempting!");
                break;
            }
            default:
            {
                System.out.print("Invalid Key!");
                break;
            }
            
        }

    }
    public static void main(String[] args)
    {
        System.out.print("----- Welcome to Automated Teller Machine Interface -----");
        ATM(10000);
    }
}