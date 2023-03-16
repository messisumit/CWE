package com.example.CWE416;


// Use After Free


public class CWE416_Non_Complaint {
    public static void main(String[] args) {

        CWE416_Non_Complaint obj = new CWE416_Non_Complaint();
        obj.getStatus();
        obj = null;
        System.gc();
        obj.getStatus();    // obj is used after it is free

    }

    void getStatus(){
        System.out.println("Method of NonComplaint Class");
    }
}
