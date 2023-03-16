package com.example.CWE476;


// NULL Pointer Dereference
public class CWE_476_Non_Complaint {
    public static void main(String[] arg) {
        CWE_476_Non_Complaint cwe7 = new CWE_476_Non_Complaint();
        String name = cwe7.getName();
        if(name.length()>0)                 // length function is called on a null variable
            System.out.println(name);
    }

    public String getName(){
        return null;
    }
}

