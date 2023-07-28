/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chella;

/**
 *
 * @author hp
 */

import java.awt.*;
import java.awt.event.*;

public class UserRegistrationForm extends Frame implements ActionListener {
   // TextFields for user input
   private TextField firstNameTxt, lastNameTxt, dobTxt, placeTxt, contactTxt;
   // Checkbox for gender selection
   private Checkbox maleCb, femaleCb;
   // Submit button
   private Button submitBtn;

   public UserRegistrationForm() {
      // Set title for the window
      setTitle("User Registration Form");

      // Set layout for the window
      setLayout(new GridLayout(7, 2));

      // Add labels and text fields for user input
      add(new Label("First Name:"));
      firstNameTxt = new TextField(20);
      add(firstNameTxt);

      add(new Label("Last Name:"));
      lastNameTxt = new TextField(20);
      add(lastNameTxt);

      add(new Label("Date of Birth:"));
      dobTxt = new TextField(20);
      add(dobTxt);

      add(new Label("Gender:"));
      Panel genderPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
      maleCb = new Checkbox("Male");
      femaleCb = new Checkbox("Female");
      genderPanel.add(maleCb);
      genderPanel.add(femaleCb);
      add(genderPanel);

      add(new Label("Place:"));
      placeTxt = new TextField(20);
      add(placeTxt);

      add(new Label("Contact Number:"));
      contactTxt = new TextField(20);
      add(contactTxt);

      // Add the submit button
      submitBtn = new Button("Submit");
      add(submitBtn);

      // Add action listener to the submit button
      submitBtn.addActionListener(this);

      // Set the size of the window and make it visible
      setSize(400, 300);
      setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == submitBtn) {
         // Retrieve the user input and store it in variables
         String firstName = firstNameTxt.getText();
         String lastName = lastNameTxt.getText();
         String dob = dobTxt.getText();
         String gender = maleCb.getState() ? "Male" : "Female";
         String place = placeTxt.getText();
         String contact = contactTxt.getText();

         // Print the user input to the console
         System.out.println("First Name: " + firstName);
         System.out.println("Last Name: " + lastName);
         System.out.println("Date of Birth: " + dob);
         System.out.println("Gender: " + gender);
         System.out.println("Place: " + place);
         System.out.println("Contact Number: " + contact);
      }
   }

   public static void main(String[] args) {
      // Create a new instance of the UserRegistrationForm class
      new UserRegistrationForm();
   }
}
