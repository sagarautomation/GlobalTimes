package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.nio.file.Files;
import java.nio.file.Paths;



public class FileCreation
{
	static FileCreation var;
	
		
	public static void m1() throws IOException
	{
		File tempfile=File.createTempFile("Test1", ".doc");
		System.out.println(tempfile.getAbsolutePath());
		//This will create file in the below path
		//C:\Users\SAGAR\AppData\Local\Temp\Test118408629502563876869.doc

			
	}
	
	public static void m2() throws IOException
	{
		
		File f=File.createTempFile("Testfile", ".doc",new File(System.getProperty("user.dir")+"/src/main"));
		
	}
	
	
	public static void m3() throws IOException
	{
		File f=new File(System.getProperty("user.dir")+"/src/main/Testfile2.txt");
		if(f.createNewFile())
		{
			System.out.println("Filesuccessfully created");
			
	
			
		}
		else
		{
			System.out.println("File already exists");
		}
		
		
	}
	
	
	public static void m4() throws IOException
	{
		File f=null;
		f=new File(System.getProperty("user.dir")+"/src/main/Testfile1.doc");
		System.out.println(f.getAbsolutePath());
		FileOutputStream fo=new FileOutputStream(f, true);
		String s="\n"+"Get busy living"
				+"\n"
				+"OR"
				+"\n"
				+"Get busy dying";
				
		fo.write(s.getBytes());
		fo.write('\n'); //insert a newline
		
		
		System.out.println("Written");
		fo.close();
		
		
	}
	
	public static void m5() throws IOException
	{
		
		//File f=new File("D:/data1");
		//f.mkdir(); //create directory name data1
		
		//File f=new File("D:/Selenium/Java/API");
		//f.mkdirs();  //create multiple directories 
		File file = new File("c:\\test\\newFile");
		System.out.println(file.getName());
		
		/*byte byteVar = 50;
		byteVar = byteVar * 70;
		System.out.println(byteVar);*/
		
		/*int num1 = 10;
		double num2 = 10.10;
		boolean b = (num1 = num2);
		System.out.println(b);*/
		
		/*LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(20);
		list.add(40);
		list.add(12);
		list.add(60);
		list.addFirst(90);
		System.out.println(list);*/
		
		Integer intObj = 50;
		if(intObj < 70){
		System.out.println(intObj);
		}
		
		
		
		
	}
	
	public static void bufferwriter() throws IOException
	{
		//Problem with Buffered writer and File writer is calling
		//new line and inserting "\n"
		//It overwrites the existing contents
		FileWriter fw=new FileWriter(System.getProperty("user.dir")+"/src/main/Testfile3.doc");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("sagar");
		bw.newLine();
		bw.write("sapkota");
		bw.newLine();
		bw.write("sagar");
		bw.newLine();
		bw.write("sapkota");
		bw.append("appendcharseq");
		bw.newLine();
		char[]ch= {'a','b','c','d','e'};
		bw.write(ch);
		bw.newLine();
		bw.write(66);//print b
		bw.close();
		//int a[ ] [ ] = new int [ ] [4];
	
	}
	
	
	public static void m7() throws IOException
	{
		//create directory with current timestamp..
		//create files with current timestamp..
		//copy and paste the content of another file
		System.out.println(LocalDateTime.now());
		File f=new File(System.getProperty("user.dir")+"/"+"testfolder1");
		if(!f.exists())
		{
			f.mkdir();
			f.createTempFile(LocalDateTime.now().toString().replaceAll("[^a-z A-Z 0-9]", ""), ".doc", f);
			
		}
		else
		{
			f.createTempFile(LocalDateTime.now().toString().replaceAll("[^a-z A-Z 0-9]", ""), ".doc", f);

		}
	    	
	}
	
	
	
	public static void m8() throws IOException
	{
		//create directory with current timestamp..
		//create files with current timestamp..
		//copy and paste the content of another file
		File f=new File(System.getProperty("user.dir")+"/"+"testfolder2");
		String toCopy="My name is Sagar";
				
		if(!f.exists())
		{
			f.mkdir();	
		}
		
		
		File contentfile=f.createTempFile(LocalDateTime.now().toString().replaceAll("[^a-z A-Z 0-9]", ""), ".doc", f);
		FileOutputStream fo=new FileOutputStream(contentfile, true);
		
				
		fo.write(toCopy.getBytes());

		System.out.println("Written");
		fo.close();
	    	
	}
	
	
	public static void m9() throws IOException
	{
		//create directory with current timestamp..
		//create files with current timestamp..
		//copy and paste the content of another file
		Files.createDirectory(Paths.get(System.getProperty("user.dir")+"/"+"testfolder4"));
		
	    	
	}
	

	public static void main(String[] args) throws IOException 
	{
		FileCreation.m9();
		
		
	}
	

}
