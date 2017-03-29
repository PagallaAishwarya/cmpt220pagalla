/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aishw
 */
public class SAVINGSACCOUNT extends ACCOUNT {

    protected double OVERDRAFT_LIMIT = 0;

    public SAVINGSACCOUNT(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (mBalance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "SAVINGSACCOUNT{" +
                "mBalance=" + mBalance +
                '}';
    }
}
