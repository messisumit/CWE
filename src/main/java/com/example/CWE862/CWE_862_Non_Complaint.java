package com.example.CWE862;

import java.util.*;

public class CWE_862_Non_Complaint {
    // Method that requires authorization
    public void sensitiveOperation(User user, String resource) {
        System.out.println("Unsafe Operation::"+resource);
    }

    // Example usage
    public static void main(String[] args) {
        User user = new User("user", Arrays.asList("read:file1", "write:file2"));
        CWE_862_Non_Complaint service = new CWE_862_Non_Complaint();
        service.sensitiveOperation(user, "write:file1");
    }
}


class User {

    private String username;
    private List<String> permissions;

    public User(String username, List<String> permissions) {
        this.username = username;
        this.permissions = permissions;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getPermissions() {
        return permissions;
    }
}


