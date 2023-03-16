package com.example.CWE190;

public class CWE190_Complaint {
    public static void main(String[] args){
        long x = 2147483647; // by changing datatype we can print the incremented value of max integer
        x = x + 1;
        System.out.println(x);
    }
}
