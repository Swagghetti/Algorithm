package assignment1;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author ucarr
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        System.out.println("FOR 1Mint.txt ");
        // FOR 1Mint.txt 
        Using_array array1 = new Using_array(new File("1Mint.txt"), 1000000);
        array1.read();
        array1.printStatus();
        System.out.println();
        PA1 A1 = new PA1();
        array1.read();
        A1.printStatus();
        System.out.println();
        DynamicArrayCustom dymArray1 = new DynamicArrayCustom(array1.array);
        dymArray1.printStatus();
/*
System.out.println();
        System.out.println("FOR 50Mint.txt");
        // FOR 50Mint.txt
        Using_array array2 = new Using_array(new File("50Mint.txt"), 50000000);
        array2.read();
        array2.printStatus();
        System.out.println();
        PA1 A2 = new PA1();
        A2.printStatus();
        System.out.println();
        DynamicArrayCustom dymArray2 = new DynamicArrayCustom(array2.array);
        dymArray2.printStatus();
        */
    }

}
