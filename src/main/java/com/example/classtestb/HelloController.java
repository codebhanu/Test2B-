package com.example.classtestb;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label errorText;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    // Static credentials for authentication
    private static final String staticUsername = "YOUR_FIRST_NAME";
    private static final String staticPassword = "456";

    // Counter for failed login attempts
    private int failedAttempts = 0;

    @FXML
    protected void onHelloButtonClick() {
        // Get entered username and password
        String enteredUsername = usernameField.getText();
        String enteredPassword = passwordField.getText();

        if (failedAttempts>=5) {

            errorText.setText("YourAccount is locked!!!");



        }
        else{


        // Check if either username or password is empty
        if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
            // Display error message for empty fields
            errorText.setText("Please Provide Username and Password.");
        } else {
            // Check if entered credentials match static credentials
            if (enteredUsername.equals(staticUsername) && enteredPassword.equals(staticPassword)) {
                // Authentication success
                failedAttempts=0;
                errorText.setText("Success!!!");
                // Here you can navigate to another scene or perform other actions upon successful authentication
            } else {
                // Authentication failure
                errorText.setText("User Name or Password is wrong");
                failedAttempts++;

            }
        }
    }
}
}
