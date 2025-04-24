package AssignmentPurpose.Task2.Account;

import java.util.Scanner;

public class Account {
    private double  balance;

    public Account() {
        balance = 0.0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount >0){
            balance += amount;
            System.out.println("Deposit  amount: "+ amount);

        }else
            System.out.println("Invalid amount is try to deposit");
    }

    public void withdraw(double withdrawAmount){
        if (withdrawAmount >0 && withdrawAmount <= balance){
            balance -= withdrawAmount;
            System.out.println("Withdraw amount is: "+ withdrawAmount);
        }else {
            System.out.println("Insufficient amount!");
        }
    }
    public void display(){
        System.out.println("Balance amount is ₹: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Opening amount:");
        double initialAmount = scanner.nextDouble();
        Account account = new Account(initialAmount);

        System.out.println("Enter Deposit amount ");
        double deposit = scanner.nextDouble();

        account.deposit(deposit);
        //System.out.println(deposit);//for testing


        System.out.println("Enter withdraw amount ");
        double  withdraw = scanner.nextDouble();
        account.withdraw(withdraw);
        //System.out.println(withdraw);// for testing

        account.display();







    }
}
