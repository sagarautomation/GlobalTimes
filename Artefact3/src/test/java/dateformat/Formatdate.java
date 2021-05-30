package dateformat;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Formatdate {
	
	//Mon Feb 08 00:00:00 IST 2021

	public static void main(String[] args) throws ParseException {
		
		// EEEEE MMMMM yyyy HH:mm:ss.SSSZ	Saturday November 2012 10:45:42.720+0100
		
		/*String input ="Sun Dec 31 19:00:00 IST 1899";

		DateTimeFormatter f = DateTimeFormatter.ofPattern( "E MMM dd HH:mm:ss z uuuu" )
		                                       .withLocale( Locale.US);
		ZonedDateTime zdt = ZonedDateTime.parse( input , f );
		//Extract a date-only object, a LocalDate, without any time-of-day and without any time zone.

		LocalDate ld = zdt.toLocalDate();
		DateTimeFormatter fLocalDate = DateTimeFormatter.ofPattern( "dd/mm/yyyy" );
		String output = ld.format( fLocalDate) ;  
		
		System.out.println( "input: " + input );
		System.out.println( "zdt: " + zdt );
		System.out.println( "ld: " + ld );
		System.out.println( "output: " + output ); */
		
		
		/*String oldstring = "2011-01-18 00:00:00.0";
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(oldstring);
		System.out.println(date);
		
		String strDate = "2013-02-21";

	    DateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
	    Date da = (Date)inputFormatter.parse(strDate);
	    System.out.println("==Date is ==" + da);
	    
	    DateFormat outputFormatter = new SimpleDateFormat("dd-MM-yyyy");
	    String strDateTime = outputFormatter.format(da);
	    System.out.println("==String date is : " + strDateTime);
	    
	    
	    String dateString="Sun Dec 31 10:00:00 IST 1899";
	    String timeString = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss z uuuu"))
	            .format(DateTimeFormatter.ofPattern("HH:mm"));
	    System.out.println(timeString+" "+"AM");*/
		
		List<Integer>num=Arrays.asList(1,2,3,4,5);
		
		
		
		
		

		
		
		 

	}

}
