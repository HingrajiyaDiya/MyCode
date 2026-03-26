package MyPackage;

public class Lab_1_Bank 
{
    private double amount;

    public Lab_1_Bank(double initialAmount) 
    {
        this.amount = initialAmount;
    }

    public void withdraw(double withdrawalAmount) 
    {
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);
        if (withdrawalAmount <= amount) 
        {
            amount -= withdrawalAmount;
        }
    }

    public void deposit(double depositAmount) 
    {
        amount += depositAmount;
    }

    public void displayBalance() 
    {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) 
    {
        Lab_1_Bank bank = new Lab_1_Bank(10000);
        bank.withdraw(2000);
        bank.deposit(5000);
        bank.displayBalance();
    }
}