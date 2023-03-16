package com.example.CWE20;


    public class CWE_20_Complaint {

        public static void main(String[] args){
            double price = 50.00;
            int quantity = getQuantity();

            if(quantity >= 1) {
                double total = price * quantity;
                chargeUser(total);
            }
            else {
                System.out.println("Invalid Quantity!!");
            }

        }

        static void chargeUser(double total) {
            double userBal = 200;
            System.out.println(userBal - total);
        }
        static int getQuantity() {
            return -1;
        }

    }


