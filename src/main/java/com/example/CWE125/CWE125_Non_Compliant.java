package com.example.CWE125;

public class CWE125_Non_Compliant {
    public static void main(String[] args){
        int[] array = new int[3];
        array[0]=10;
        array[1]=12;
        array[2]=32;
        array[3]=34;

        int seventh = array[7];
        System.out.println(seventh);
    }
}
