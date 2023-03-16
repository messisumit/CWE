package com.example.CWE798;


//   Use of Hard-coded Credentials

public class CWE_798_Non_Complaint {
    public static void main(String[] arg) {
        String passInvalid = "InvalidPassword";
        System.out.println(validatePassword(passInvalid));

        String passValid = "Admin";
        System.out.println(validatePassword(passValid));

    }

    private static String validatePassword(String password) {

        if(password.equals("Admin")){
            return "Access Granted";
        }
        return "Access Denied";
    }
}

