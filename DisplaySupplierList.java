
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DisplaySupplierList {

    static void displaySupplierList() {
        List<String> DisplaySL = new ArrayList<>();
        try (BufferedReader Listreader = new BufferedReader(new FileReader("SupplierList.txt"))) {

            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-15s | %-15s | %-25s | %-25s | %s\n", "Supplier Code", "Supplier Name", "Supplier Phone Number", "Supplier Email Address", "Item ID");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            String line;
            while ((line = Listreader.readLine()) != null) {
                String[] displaySupplierList = line.split(";");
                String SupplierCode = displaySupplierList[0];
                String SupplierName = displaySupplierList[1];
                String SupplierPN = displaySupplierList[2];
                String SupplierEA = displaySupplierList[3];
                String ItemID = displaySupplierList[4];
                //System.out.println(line); 
                System.out.printf("%-15s | %-15s | %-25s | %-25s | %s\n", SupplierCode, SupplierName, SupplierPN, SupplierEA, ItemID);
            }

        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
