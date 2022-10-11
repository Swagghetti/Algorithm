package assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ucarr
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        System.out.println("FOR 1Mint.txt ");
        // FOR 1Mint.txt 
        Using_array array1 = new Using_array(new File("1Mint.txt"), 1000000);
        array1.read(900_000);
        array1.printStatus();
        System.out.println();
        
        PA2 A2 = new PA2();
        A2.printStatus();
        
        System.out.println();
        DynamicArrayCustom dymArray1 = new DynamicArrayCustom(array1.array);
        dymArray1.insertFirst(45);
        
        dymArray1.getAtIndex(9);
        dymArray1.printStatus();

System.out.println();
        System.out.println("FOR 50Mint.txt");
        // FOR 50Mint.txt
        Using_array array2 = new Using_array(new File("50Mint.txt"), 50_000_000);
        array2.idx = 45_000_000;
        array2.read(45_000_000);
        array2.printStatus();
        System.out.println();
        
        PA2 A22 = new PA2();
        A22.printStatus();

        System.out.println();
        DynamicArrayCustom dymArray2 = new DynamicArrayCustom(array2.array);
        dymArray2.fileIndex = 45_000_000;
        dymArray2.insertFirst(45);
        dymArray2.printStatus();
        
    }

}
