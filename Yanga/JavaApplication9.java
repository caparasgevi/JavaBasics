/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;
import java.io.*;

/**
 *
 * @author Admin
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		//declaration
		int c;
		int b = 12;
		int l = 12;

		System.out.print("Amount of cookies: ");
		c = Integer.parseInt(input.readLine());
		
		if (c >= 144 )
		    
		   {System.out.println("Amount of boxes: "+ c/ b);
		    System.out.println("Amount of containers: "+ (c / b) / 12);
		    System.out.println("Amount of leftovers is: "+ c% l);}
		
		else if (c < 144 && c >= 12)
		        
		   {System.out.println("Amount of boxes: "+ c/ b);
		    System.out.println("Amount of containers: 1");
		    System.out.println("Amount of leftovers is: "+ c% l);}
		       
		else
		    System.out.println("Your order cannot be processed because it does not meet the minimum cookie requirement for one package.");
    }
    
}
