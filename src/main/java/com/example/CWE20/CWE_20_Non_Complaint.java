package com.example.CWE20;


//  improper input validation

public class CWE_20_Non_Complaint {
    public static void main(String[] args){
        CWE_20_Non_Complaint obj = new CWE_20_Non_Complaint();

        double price = 50.00;
        int quantity = obj.getQuantity();
        double total = price * quantity;

        obj.chargeUser(total);
    }

    void chargeUser(double total){
        double userBal = 200;
        System.out.println(userBal - total);
    }
    int getQuantity(){
        return -1;
    }
}
