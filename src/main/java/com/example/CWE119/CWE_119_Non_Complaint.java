package com.example.CWE119;

public class CWE_119_Non_Complaint {
    public static void main(String[] args){
        String input = "abcdefghijkl12345"; // user input
        byte[] buffer = new byte[10];
        System.arraycopy(input.getBytes(), 0, buffer, 0, input.length());
        for(int i=0;i<buffer.length;i++){
            System.out.println(buffer[i]);
        }
    }
}
