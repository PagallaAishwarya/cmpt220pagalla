/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aishw
 */
public class ASH97 {
    
    public static void main(String[] args) {

        ACCOUNT account = new ACCOUNT(1122, 20000);
        account.setAnnualInterestRate(4.5);

        System.out.println("Account ID: " + account.getId());
        System.out.println("Account Balance: " + account.getBalance());

        System.out.println("Withdrawing $2,500...");
        account.withdraw(2500);

        System.out.println("Depositing $3,000...");
        account.deposit(3000);

        System.out.println("Displaying updated info.");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Monthly interest rate: " + account.getMonthlyInterestRate());
        System.out.println("Date account was created: " + account.getDateCreated());


    }
}
    

