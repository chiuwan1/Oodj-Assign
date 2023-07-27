package assignment;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class SupplierEntry
{
    private String SupplierCode;
    private String SupplierName;
    private String SupplierPhoneNumber;
    private String SupplierEmailAddress;
    private String SupplierAddress;
    private String ItemID;
    
    public SupplierEntry(String SupplierCode,String SupplierName,String SupplierPhoneNumber, String SupplierEmailAddress,String SupplierAddress, String ItemID)
    {
        this.SupplierCode = SupplierCode;
        this.SupplierName = SupplierName;
        this.SupplierPhoneNumber = SupplierPhoneNumber;
        this.SupplierEmailAddress = SupplierEmailAddress;
        this.SupplierAddress = SupplierAddress;
        this.ItemID = ItemID;
    }
    
    public String getSupplierCode(){return SupplierCode;}
    public String getSupplierName(){return SupplierName;}
    public String getSupplierPhoneNumber(){return SupplierPhoneNumber;}
    public String getSupplierEmailAddress(){return SupplierEmailAddress;}
    public String getSupplierAddress(){return SupplierAddress;}
    public String getItemID(){return ItemID;}
    
    public void setSupplierCode(String SupplierCode){this.SupplierCode = SupplierCode;}
    public void setSupplierName(String SupplierName){this.SupplierName = SupplierName;}
    public void setSupplierPhoneNumber(String SupplierPhoneNumber){this.SupplierPhoneNumber = SupplierPhoneNumber;}
    public void setSupplierEmailAddress(String SupplierEmailAddress){this.SupplierEmailAddress = SupplierEmailAddress;}
    public void setSupplierAddress(String SupplierAddress){this.SupplierAddress = SupplierAddress;}
    public void setItemID(String ItemID){this.ItemID = ItemID;}
    
    
    @Override
    public String toString() {
        return  SupplierCode + ";" + SupplierName + ";" + SupplierPhoneNumber + ";" + SupplierEmailAddress + ";" + SupplierAddress + ";" +ItemID;
    }



    public static void runSupplierEntry(){
        Scanner SupplierInputs = new Scanner(System.in);
 
        System.out.println("Supplier Entry");
        System.out.println("Enter Supplier Code:");
        String SupplierCode = SupplierInputs.nextLine();
        System.out.println("Enter Supplier Name:");
        String SupplierName = SupplierInputs.nextLine();
        System.out.println("Enter Supplier Phone Number:");
        String SupplierPhoneNumber = SupplierInputs.nextLine();
        System.out.println("Enter Supplier Email Address:");
        String SupplierEmailAddress = SupplierInputs.nextLine();
        System.out.println("Enter Supplier Address:");
        String SupplierAddress = SupplierInputs.nextLine();
        System.out.println("Enter Item ID:");
        String ItemID = SupplierInputs.nextLine();
        
        
        SupplierDetails Supplier = new SupplierDetails(SupplierCode, SupplierName, SupplierPhoneNumber, SupplierEmailAddress, SupplierAddress, ItemID);
        
        boolean validInput = false;
        while(!validInput){        
        System.out.println("Would you like to save the record?[yes/no]");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim().toLowerCase();

        switch (input) {
            case "yes" -> 
            {
                try(FileWriter writer = new FileWriter("SupplierList.txt", true)){
                writer.write(String.format("%-20s %-20s %-20s %-20s %-20s %-20s%n", "Supplier Code","Name","Phone Number","Email","Address", "Item ID"));
                writer.write(String.format("%-20s %-20s %-20s %-20s %-20s %-20s%n",SupplierCode, SupplierName, SupplierPhoneNumber, SupplierEmailAddress, SupplierAddress, ItemID));
                writer.write(System.lineSeparator());
                }
                catch(IOException e){
                    System.out.println("Error while saving the record!");
                }
                
                System.out.println("The list is saved as SupplierList.txt");
                validInput = true;
            }
            case "no" -> {System.out.println("Are you sure to discard the record?"); validInput = true;
            }
            default -> System.out.println("Invalid input.Please enter yes or no");
            
        }

        }

}
}
