package com.example.CWE306;

public class CWE_306_Non_Complaint {
    public static void main(String[] args) {
        BankAccount user1 = createBankAccount("123","saving","Owner",300);
        user1.getOwnerName();
    }

    public static BankAccount createBankAccount(String accountNumber, String accountType,
                                                String accountOwnerName, double balance) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(accountNumber);
        account.setAccountType(accountType);
        account.setAccountOwnerName(accountOwnerName);
        account.setBalance(balance);

        return account;
    }
}

class BankAccount {

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

