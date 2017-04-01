/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aishw
 */
public class ASH1103 {

    public static void main(String[] args) {

        ACCOUNT account = new ACCOUNT(111, 200);
        CHECKINGACCOUNT checkingACCOUNT = new CHECKINGACCOUNT(112, 250);
        SAVINGSACCOUNT savingsACCOUNT = new SAVINGSACCOUNT(113, 300);

        System.out.println(account);
        System.out.println(checkingACCOUNT);
        System.out.println(savingsACCOUNT);
    }

}

    
