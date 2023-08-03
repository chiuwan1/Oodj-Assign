package UserLoginSystem;

import java.util.Scanner;

abstract public class Switch_for_SM {

    public static void CallSwitchCase() {
        System.out.println("Sale Manager\nMenu \n\n1. Item Entry \n2. Supplier Entry \n3. Daily sales \n4. Create Purchase Requisition \n5. View Purchase Requisition \n6. View Purchase Order \n0. Log out");
        System.out.println("Enter number to continue: \n");
        Scanner userInput = new Scanner(System.in);
        int UserInput = userInput.nextInt();
        String bullshit = null;
        switch (UserInput) {
            case 1:
                ItemDetails.AddItem();
                break;
            case 2:
                SupplierEntry.runSupplierEntry();
                break;
            case 3:
                DailySales.dailyItemWiseSalesEntry();
                break;
            case 4:
                bullshit = "Create PR will be developed";
                break;
            case 5:
                bullshit = "View PR will be developed";
                break;
            case 6:
                bullshit = "View PO Will be developed";
                break;
            case 0:
                bullshit = "Log out session will be developed";
                break;
            default:
                bullshit = "Invalid number input";
                break;
        }
        System.out.println(bullshit);
    }
}
