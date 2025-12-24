package MyPackage;

public class HelloWorld {

    //declare private variable
    private double balance;

    //declare method1
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //declare method2
    public double getBalance() {
        return balance;
    }

    //main method
    public static void main(String[] args) {
        //object create
        HelloWorld acc = new HelloWorld();
        //call method
        acc.setBalance(5000);
        System.out.println(acc.getBalance());
    }
}