package com.example.CWE416;

public class CWE_416_Complaint {
    public static void main(String[] args) {

        CWE_416_Complaint obj = new CWE_416_Complaint();
        obj.getStatus();
        obj = null;
        System.gc();

        if(obj!=null)
        {
            obj.getStatus();
        }

        System.out.println("Object is null");   // obj is used after it is free

    }

    void getStatus(){
        System.out.println("Method of Complaint Class");
    }

}
