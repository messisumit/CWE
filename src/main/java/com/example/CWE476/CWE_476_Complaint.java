package com.example.CWE476;


//  CWE-476: NULL Pointer Dereference
public class CWE_476_Complaint {
    public static void main(String[] arg) {
        String name = getName();

        if((name!=null) && name.length()>0)       // check for null and empty name
            System.out.println(name);
    }
    public static String getName(){
        return null;
    }
}
