
package oodjassignment;
import java.util.Scanner;

public class Switch_for_PM {
    System.out.println("Purcahse Manager \nMenu \n\n1. Item List \n2. Supplier List \n3. Purchase Requisition \n4. Generate Purcahse Order \n5. View Purchase Order \n0. Log out");
        System.out.println("Enter number to continue: \n");
        Scanner userInput = new Scanner(System.in);
        int UserInput = userInput.nextInt();
        String bullshit;
        switch(UserInput){
            case 1: bullshit = "Item list will be developed"; break;
            case 2: bullshit = "Supplier list will be developed";break;
            case 3: bullshit = "PR be developed";break;
            case 4: bullshit = "Generate PR will be developed";break;
            case 5: bullshit = "View PO will be developed";break;
            case 0: bullshit = "Log out session will be developed";break;
            default: bullshit = "Invalid number input"; break;
        }
        System.out.println(bullshit);
}
    

