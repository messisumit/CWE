package com.example.CWE798;


//   Use of Hard-coded Credentials
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CWE_798_Complaint {
    public static void main(String[] arg) throws IOException {
        String passInvalid = "InvalidPassword";
        System.out.println(validatePassword(passInvalid));

        String passValid = "Admin";
        System.out.println(validatePassword(passValid));

    }

    private static String validatePassword(String password) throws IOException {
        FileInputStream input = new FileInputStream("src/main/resources/config.properties");
        Properties prop = new Properties();
        prop.load(input);
        final String key = prop.getProperty("password");
        if(password.equals(key)){
            return "Access Granted";
        }
        return "Access Denied";
    }
}

