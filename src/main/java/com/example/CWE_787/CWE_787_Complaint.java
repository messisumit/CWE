package com.example.CWE_787;

import java.util.Scanner;

public class CWE_787_Complaint {
    public static void main(String[] args) {

        int[] arr = new int[3];

        Scanner sc= new Scanner(System.in);
        for(int i = 0;i<=3;i++) {
            arr[i] = sc.nextInt();           // arr[3] is out of bounds
        }

        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

    }
}
