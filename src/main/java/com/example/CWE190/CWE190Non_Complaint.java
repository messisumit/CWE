package com.example.CWE190;

public class CWE190Non_Complaint {
    public static void main(String[] args){
        int x = 2147483647; // maximum value for an int
        x = x + 1;
        System.out.println(x);
    }
}
