package FileHandling;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Filereader
{
	public static void main(String[]args)
	{
		try(    // Using multiple resources  
		        FileOutputStream fileOutputStream =new FileOutputStream(System.getProperty("user.dir")+"/src/main/Testfile4.doc");  
		        InputStream input = new FileInputStream(System.getProperty("user.dir")+"/src/main/Testfile4.doc")){  
		        // -----------------------------Code to write data into file--------------------------------------------//  
			String msg = "Welcome to JavaTpoint"
		    		+ "\n"
		    		+"Welcome to Baeldung"
		    		+"\n"
		    		+"Welcome to DurgaSoft Solutions"
		    		+"\n"
		    		+"Welcome to NaveenAutomationlabs";
			byte byteArray[] = msg.getBytes();  // Converting string into byte array      
		        fileOutputStream.write(byteArray);  // Writing  data into file  
		        System.out.println("------------Data written into file--------------");  
		        System.out.println(msg);  
		        // -----------------------------Code to read data from file---------------------------------------------//  
		        // Creating input stream instance  
		        DataInputStream inst = new DataInputStream(input);    
		        int data = input.available();
		        System.out.println("Available"+data);
		        // Returns an estimate of the number of bytes that can be read from this input stream.   
		        byte[] byteArray2 = new byte[data]; //    
		        inst.read(byteArray2);    
		        String str = new String(byteArray2); // passing byte array into String constructor  
		        System.out.println("------------Data read from file--------------");  
		        System.out.println(str); // display file data  
		}catch(Exception exception){  
		       System.out.println(exception);  
		}     
		
	}

}
