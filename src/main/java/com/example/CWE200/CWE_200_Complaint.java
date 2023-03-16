package com.example.CWE200;

import java.util.*;
// Exposure of Sensitive Information to an Unauthorized Actor
public class CWE_200_Complaint {
    // Method that requires authorization
    public void sensitiveOperation(User user, String resource) {
        // Check if user is authorized to access the resource
        if (user.getPermissions().contains(resource)) {
            System.out.println("Safe Operation:: "+resource);
        } else {
            throw new UnauthorizedAccessException("User is not authorized to access the resource.");
        }
    }

    // Example usage
    public static void main(String[] args) {
        User user = new User("johndoe", Arrays.asList("read:file1", "write:file2"));
        CWE_200_Complaint service = new CWE_200_Complaint();
        try {
            service.sensitiveOperation(user, "read:file1");
        } catch (UnauthorizedAccessException ex) {
            // Handle unauthorized access exception
            // ...
        }
    }
}

class User1 {

    private String username;
    private List<String> permissions;

    public User1(String username, List<String> permissions) {
        this.username = username;
        this.permissions = permissions;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getPermissions() {
        return Arrays.asList("read:file1","write:file2");
    }
}
class UnauthorizedAccessException1 extends RuntimeException {

    public UnauthorizedAccessException1(String message) {
        super(message);
    }
}




