package exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

import org.apache.tools.ant.util.LazyFileOutputStream;

import FileHandling.Filereader;

public class Trywithresource 
{
	public static void m1()
	{
		//try with resources ensures that the resource(object) is closed after the end of operations.
		//we can pass any object that implement java.lang.AutoCloseable, 
		//which includes all objects which implement java.io.Closeable.
		try(FileOutputStream fo=new FileOutputStream(System.getProperty("user.dir")+"/src/main/Testfile4.doc"))
		{
			String name="My name is sagar";
			fo.write(name.getBytes());
			System.out.println("message written successfully");
			
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	public static void m2()
	{
		//try with multiple resources..
		try(FileOutputStream fo=new FileOutputStream(System.getProperty("user.dir")+"/src/main/Testfile4.doc");
			BufferedReader br=new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/main/Testfile4.doc")))
		{
			    String msg = "Welcome to JavaTpoint"
			    		+ "\n"
			    		+"Welcome to Baeldung"
			    		+"\n"
			    		+"Welcome to DurgaSoft Solutions"
			    		+"\n"
			    		+"Welcome to NaveenAutomationlabs";
		        byte byteArray[] = msg.getBytes();  // Converting string into byte array 
		        fo.write(byteArray);  // Writing  data into file 
		        String line=br.readLine();
		        while(line!=null)
		        {
		        	System.out.println(line);
		        	line=br.readLine();
		        }
		        
			
		}
		catch(Exception e)
		{
			
		}
	}

	public static void main(String[] args) 
	{
		Trywithresource.m2();

	}

}
