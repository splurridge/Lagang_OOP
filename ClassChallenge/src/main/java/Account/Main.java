/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

/**
 *
 * @author francisjameslagang
 */
public class Main {
    public static void main(String[] args) {
        Account person = new Account();
        person.setAccountNumber(22104403);
        person.setAccountBalance(5000);
        person.setCustomerName("Francis James Lagang");
        person.setEmail("22104403@usc.edu.ph");
        person.setPhoneNumber("09763505481");
        
        /*
        * Calling the methods
        */
        
        person.depositFunds(2000); // Adds Php 2,000 to the current balance
        System.out.println(person.getAccountBalance()); // Output becomes Php 7,000
        
        person.withdrawFunds(1500); // Deducts Php 1,500 to current balance
        System.out.println(person.getAccountBalance()); // Output becomes Php 5,500
      
        System.out.println(person); // Outputs the details of person
    } 
}
