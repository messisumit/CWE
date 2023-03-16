package com.example.CWE306;

import java.util.Objects;

public class CWE_306_Complaint {
    public static void main(String[] args) {

        BankAccount user1 = createBankAccount("authKey","123","saving","Owner",300);
        user1.getOwnerName();
    }

    public static BankAccount createBankAccount(String authenticationKey,String accountNumber,
                                                String accountType, String accountOwnerName, double balance) {
        BankAccount account = new BankAccount();
        if (Objects.equals(authenticationKey, "authKey")) {
            account.setAccountNumber(accountNumber);
            account.setAccountType(accountType);
            account.setAccountOwnerName(accountOwnerName);
            account.setBalance(balance);
        }
        return account;
    }
}

class BankAccount1 {

    String accountNumber;
    String accountType;
    String accountName;
    double balance;
    public void setAccountNumber(String accNo) {
        accountNumber = accNo;
    }

    public void setAccountType(String accType) {
        accountType = accType;
    }

    public void setAccountOwnerName(String accName) {
        accountName = accName;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public void getOwnerName(){
        System.out.println(accountName);
    }
}

