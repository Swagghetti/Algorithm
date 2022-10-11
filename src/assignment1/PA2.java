package assignment1;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ucarr
 */
public class PA2 {

    /**
     * @param args the command line arguments
     */
    
    static LinkedList2 l1 = new LinkedList2();
    private Map<String,Long> statusInformations ;
    
    private TimeCounter timer;
    
    int idx = 900_000;
    
    public PA2() throws IOException 
    { 
       
        this.timer = new TimeCounter();
        this.statusInformations = new HashMap<String,Long>();
        
        
        this.timer.startTimer();
        // Insert the values 
        readFile("1Mint.txt");
        
        this.timer.stopTimer();
        this.statusInformations.put("built_time",this.timer.getElepsedTime());
        
        //System.out.println("The integer list structure is built in "+x+" milliseconds.");
        
        
        this.timer.startTimer();
        l1.insert(new node(46));
        this.timer.stopTimer();
        this.statusInformations.put("insert_head",this.timer.getElepsedTime());
        //System.out.println("An integer is inserted into the first index of the integer list in "+y+" milliseconds.");
        
        
        this.timer.startTimer();
        int index = idx , data = 0000; 
        l1.head = l1.InsertAtIndex(l1.head, index, data);
        this.timer.stopTimer();
        this.statusInformations.put("insert_nineht",this.timer.getElepsedTime());
        //System.out.println("An integer is inserted into the 900,000th index of the integer list in "+z+" milliseconds.");
        
        this.timer.startTimer();        
        l1.printAtIndex(idx);
        long nineht = l1.printAtIndex(idx); //900000
        this.timer.stopTimer();
        this.statusInformations.put("d_value",nineht);
        this.statusInformations.put("read_nineht",this.timer.getElepsedTime()); 
        //System.out.println("An integer, which is the_value, is read from the index 900,000 of the integer list in "+w+" milliseconds.");
        
        this.timer.startTimer();
        long nine = l1.printAtIndex(9);
        this.timer.stopTimer();
        this.statusInformations.put("e_value",nine);
        this.statusInformations.put("read_nine",this.timer.getElepsedTime()); 
        //System.out.println("An integer, which is the_value, is read from the index 9 of the integer list in "+h+" milliseconds.");
     
    }
    
     public void printStatus(){
        System.out.println("The integer list structure is built in "+ this.statusInformations.get("built_time") +" milliseconds.");
        System.out.println("An integer is inserted into the first index of the integer list in "+this.statusInformations.get("insert_head")+" milliseconds.");
        System.out.println("An integer is inserted into the " + idx + "th index of the integer list in "+this.statusInformations.get("insert_nineht")+" milliseconds.");
        System.out.println("An integer, which is "+this.statusInformations.get("d_value")+" , is read from the index  " + idx + "  of the integer list in "+this.statusInformations.get("read_nineht")+" milliseconds.");
        System.out.println("An integer, which is "+this.statusInformations.get("e_value")+" , is read from the index 9 of the integer list in "+this.statusInformations.get("read_nine")+" milliseconds.");
    }
     
     
     static void readFile(String name) throws FileNotFoundException, IOException {
        try ( // Open the file
                 FileInputStream fstream = new FileInputStream(name)) {
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            //Read File Line By Line

            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
                //System.out.println(strLine);
                int index = Integer.parseInt(strLine);
                int numbers = Integer.parseInt(strLine);
                l1.insert(new node(numbers));
               

            }
//Close the input stream
        }
    }
}
