
package oodjassignment;
import java.util.Scanner;

public class Switch_for_admin {
    System.out.println("Admin\nMenu \n\n1. Register New User\n2. User List \n3. View Item List \n4. View Supplier List \n5. View PR\n6. View PO \n0. Log out");
        System.out.println("Enter number to continue: \n");
        Scanner userInput = new Scanner(System.in);
        int UserInput = userInput.nextInt();
        String bullshit;
        switch(UserInput){
            case 1: bullshit = "Register New User will be developed"; break;
            case 2: bullshit = "User list list will be developed";break;
            case 3: bullshit = "View Item list be developed";break;
            case 4: bullshit = "View Supplier List will be developed";break;
            case 5: bullshit = "View PR will be developed";break;
            case 6: bullshit = "View PO will be developed";break;
            case 0: bullshit = "Log out session will be developed";break;
            default: bullshit = "Invalid number input"; break;
        }
        System.out.println(bullshit);
}
    
