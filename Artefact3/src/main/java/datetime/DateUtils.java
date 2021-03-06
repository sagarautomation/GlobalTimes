package datetime;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.TimeZone;

public class DateUtils {
	
	 public static void create_a_Date_object_using_the_Calendar_class()
	 {
		 int year = 2016;
	     int month = 0; // January
	     int date = 1;

	     Calendar cal = Calendar.getInstance();
	     // Sets the given calendar field value and the time value
	     // (millisecond offset from the Epoch) of this Calendar undefined.
	     cal.clear();
	     System.out.println();
	     cal.set(Calendar.YEAR, year);
	     cal.set(Calendar.MONTH, month);
	     cal.set(Calendar.DATE, date);

	     System.out.println(cal.getTime());
	     System.out.println();
		 
	 }
	 
	 
	 public static void get_and_display_information_of_a_default_calendar()
	 {
		// Create a default calendar
	        Calendar cal = Calendar.getInstance();
	       // Get and display information of current date from the calendar:
		    System.out.println();
	        System.out.println("Year: " + cal.get(Calendar.YEAR));
	        System.out.println("Month: " + cal.get(Calendar.MONTH));
	        System.out.println("Day: " + cal.get(Calendar.DATE));
	        System.out.println("Hour: " + cal.get(Calendar.HOUR));
	        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
		    System.out.println();
	    }
	 
	 
	 public static void to_get_maximum_value_of_year_month_week_date_from_current_date_of_default_calendar()
	 {
		 
		// Create a default calendar
	        Calendar cal = Calendar.getInstance();
			System.out.println();
			System.out.println("\nCurrent Date and Time:" + cal.getTime());		
			int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
			int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
			int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
			int actualMaxDate = cal.getActualMaximum(Calendar.DATE);
			
			System.out.println("Actual Maximum Year: "+actualMaxYear);
			System.out.println("Actual Maximum Month: "+actualMaxMonth);
			System.out.println("Actual Maximum Week of Year: "+actualMaxWeek);
			System.out.println("Actual Maximum Date: "+actualMaxDate+"\n");
			System.out.println();

		 
	 }
	 
	 
	 public static void to_get_minimum_value_of_year_month_week_date_from_current_date_of_default_calendar()
	 {
		 
		// Create a default calendar
	        Calendar cal = Calendar.getInstance();
			System.out.println();
			System.out.println("\nCurrent Date and Time:" + cal.getTime());		
			int actualMaxYear = cal.getActualMinimum(Calendar.YEAR);
			int actualMaxMonth = cal.getActualMinimum(Calendar.MONTH);
			int actualMaxWeek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
			int actualMaxDate = cal.getActualMinimum(Calendar.DATE);
			
			System.out.println("Actual Minimum Year: "+actualMaxYear);
			System.out.println("Actual Minimum Month: "+actualMaxMonth);
			System.out.println("Actual Minimum Week of Year: "+actualMaxWeek);
			System.out.println("Actual Minimum Date: "+actualMaxDate+"\n");
			System.out.println();

		 
	 }
	 
	 
	 public static void to_get_current_time_in_new_york()
	 {
		 
	        Calendar calNewYork = Calendar.getInstance();
	        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
	        System.out.println("Hours of day"+calNewYork.get(Calendar.HOUR)+
	        		"Minutes of day"+calNewYork.get(Calendar.MINUTE)
	        		+"seconds of day"+calNewYork.get(Calendar.SECOND));
	        


		 
	 }
	 
	 
	 public static void to_get_current_full_date_and_time()
	 {
		 
	        Calendar cal = Calendar.getInstance();
	        String date=String.valueOf(cal.get(Calendar.DATE)+"-"+String.valueOf(cal.get(Calendar.MONTH)+1))+"-"+String.valueOf(cal.get(Calendar.YEAR));
	        System.out.println(date);
	        


		 
	 }
	 
	 
	 public static void to_get_current_last_day_of_current_month()
	 {
		 
	        Calendar cal = Calendar.getInstance();
	        int lastDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	        System.out.println(lastDay);
	 
	 }
	 
	 
	 public static void to_getname_of_first_and_last_day_of_month()
	 {
		 
		 YearMonth ym = YearMonth.of(2021, 6);

		 String firstDay = ym.atDay(1).getDayOfWeek().name();
		 String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
		 System.out.println();
		 System.out.println(firstDay);
	 	 System.out.println(lastDay);
		 System.out.println();
	 
	 }
		 
	 
	 
	 public static void main(String[]args)
	 {
		 DateUtils.to_getname_of_first_and_last_day_of_month();
		 
	 }
	 
	 

}
