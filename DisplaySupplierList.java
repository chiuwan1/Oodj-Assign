
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class DisplaySupplierList {
    
    static void displaySupplierList(){
        List<String> DisplaySL = new ArrayList<>();
        try (BufferedReader Listreader = new BufferedReader(new FileReader("SupplierListraw.txt"))){
            
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
            String line;
            while ((line = Listreader.readLine())!=null)
            {
                System.out.println(line);
            }

}catch(IOException e) {System.out.println("Error");}
    
    }
    
}
