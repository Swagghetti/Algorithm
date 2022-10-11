/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ucarr
 */
public class PA1 {

    /**
     * @param args the command line arguments
     */
    
     
    private LinkedList list;
    private Map<String,Long> statusInformations ;
    
    private File file;
    private int index;
    private TimeCounter timer;
    
    
  
            
    public PA1(File filePointer) 
    { 
        //init
        this.file = filePointer;
        this.timer = new TimeCounter();
        this.statusInformations = new HashMap<String,Long>();
        this.index = 0;
        this.list = new LinkedList(); 
 
        //builtList();
     
    }
    
    public void builtList1() throws FileNotFoundException{  
        
        TimeCounter tc = new TimeCounter();  
        TimeCounter tc2 = new TimeCounter();
        
        // Start with the empty list. 
        LinkedList list = new LinkedList(); 
   
       
        tc2.startTimer();
        
        // Insert the values 
      
        Scanner scanner = new Scanner(this.file);
            
        while(scanner.hasNextInt()){
            LinkedList.insert(list, scanner.nextInt());
        }
        scanner.close();
    
        
        tc2.stopTimer();
        long x = tc2.getElepsedTime();   
        System.out.println("The integer list structure is built in "+x+" milliseconds.");
        
        
        tc.startTimer();
        LinkedList.insertAtHead(list, 0);
        tc.stopTimer();
        long y = tc.getElepsedTime(); 
        System.out.println("An integer is inserted into the first index of the integer list in "+y+" milliseconds.");
        
        
        tc.startTimer();
        LinkedList.InsertAtPos(list, LinkedList.readAtPos(list, 900000).data , 900000);
        tc.stopTimer();
        long z = tc.getElepsedTime(); 
        System.out.println("An integer is inserted into the 900,000th index of the integer list in "+z+" milliseconds.");
        
       
        tc.startTimer();
        int value1 = LinkedList.readAtPos(list, 900000).data;
        tc.stopTimer();
        long w = tc.getElepsedTime(); 
        System.out.println("An integer, which is "+value1+", is read from the index 900,000 of the integer list in "+w+" milliseconds.");
        
        
        tc.startTimer();
        int value2 = LinkedList.readAtPos(list, 9).data;
        tc.stopTimer();
        long h = tc.getElepsedTime(); 
        System.out.println("An integer, which is "+value2+", is read from the index 9 of the integer list in "+h+" milliseconds.");
        
        
    }
    
    
    public void builtList2() throws FileNotFoundException{  
        
        TimeCounter tc = new TimeCounter();  
        TimeCounter tc2 = new TimeCounter();
        
        // Start with the empty list. 
        LinkedList list = new LinkedList(); 
   
       
        tc2.startTimer();
        
        // Insert the values 
      
        Scanner scanner = new Scanner(this.file);
            
        while(scanner.hasNextInt()){
            LinkedList.insert(list, scanner.nextInt());
        }
        scanner.close();
    
        
        tc2.stopTimer();
        long x = tc2.getElepsedTime();   
        System.out.println("The integer list structure is built in "+x+" milliseconds.");
        
        
        tc.startTimer();
        LinkedList.insertAtHead(list, 0);
        tc.stopTimer();
        long y = tc.getElepsedTime(); 
        System.out.println("An integer is inserted into the first index of the integer list in "+y+" milliseconds.");
        
        tc.startTimer();
        LinkedList.InsertAtPos(list, LinkedList.readAtPos(list, 45000000).data , 45000000);
        tc.stopTimer();
        long z = tc.getElepsedTime(); 
        System.out.println("An integer is inserted into the 45,000,000 index of the integer list in "+z+" milliseconds.");
        
       
        tc.startTimer();
        int value1 = LinkedList.readAtPos(list, 45000000).data;
        tc.stopTimer();
        long w = tc.getElepsedTime(); 
        System.out.println("An integer, which is "+value1+", is read from the index 45,000,000 of the integer list in "+w+" milliseconds.");
        
        
        tc.startTimer();
        int value2 = LinkedList.readAtPos(list, 9).data;
        tc.stopTimer();
        long h = tc.getElepsedTime(); 
        System.out.println("An integer, which is "+value2+", is read from the index 9 of the integer list in "+h+" milliseconds.");
        
        
    }
    
    
}
