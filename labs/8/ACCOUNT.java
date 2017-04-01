/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aishw
 */
import java.util.ArrayList;
import java.util.Date;

public class ACCOUNT {
    protected String mName;
    protected int mId;
    protected double mBalance;
    protected double mAnnualInterestRate; // AnnualInterestRate is percentage.
    protected Date mDateCreated;
//JA    protected ArrayList<Transaction> mTransactions;


    public ACCOUNT() {
        mDateCreated = new Date();
//JA        mTransactions = new ArrayList<>();
    }

    public ACCOUNT(int id, double balance) {
        this();
        mId = id;
        mBalance = balance;
    }

    public ACCOUNT(String name, int id, double balance) {
        this(id, balance);
        mName = name;

    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public double getBalance() {
        return mBalance;
    }

    public void setBalance(double balance) {
        mBalance = balance;
    }

    public double getAnnualInterestRate() {
        return mAnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        mAnnualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return mDateCreated;
    }

    public double getMonthlyInterestRate() {
        return mBalance * (mAnnualInterestRate / 12) / 100;
    }

    public void withdraw(double amount) {
//JA        mTransactions.add(new Transaction('W', amount, mBalance, "withdraw"));
        mBalance -= amount;
    }

    public void deposit(double amount) {
//JA        mTransactions.add(new Transaction('D', amount, mBalance, "deposit"));
        mBalance += amount;
    }

    @Override
    public String toString() {
        return "ACCOUNT name: " + mName + "\n" + "Interest rate: " + mAnnualInterestRate; //JA + "\n" + mTransactions;
    }

//    public ArrayList<Transaction> getTransactions() {
//        return new ArrayList<>(mTransactions);
//    }

}

