package com.example.CWE119;

public class CWE119_Complaint {
    public static void main(String[] args) {
        String input = "bcdefghijklmnop";
        byte[] buffer = new byte[10];
        if(input.length() <= buffer.length){
            System.arraycopy(input.getBytes(), 0, buffer, 0, input.length());
        }
        for (int i = 0; i < buffer.length; i++) {
            System.out.println(buffer[i]);
        }
    }
}
