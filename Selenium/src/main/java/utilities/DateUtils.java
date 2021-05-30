package utilities;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateUtils {

	public static String formatDate(String input, String pattern) {
		
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss z uuuu").withLocale(Locale.US);
		ZonedDateTime zdt = ZonedDateTime.parse(input, f);
//Extract a date-only object, a LocalDate, without any time-of-day and without any time zone.

		LocalDate ld = zdt.toLocalDate();
		DateTimeFormatter fLocalDate = DateTimeFormatter.ofPattern(pattern);
		String formatteddate = ld.format(fLocalDate);

		System.out.println("input: " + input);
		System.out.println("ld: " + ld);
		System.out.println("output: " + formatteddate);

		return formatteddate;

	}
	
	
public static String formatTime(String input, String pattern) {
		
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss z uuuu").withLocale(Locale.US);
		ZonedDateTime zdt = ZonedDateTime.parse(input, f);
//Extract a date-only object, a LocalDate, without any time-of-day and without any time zone.

		LocalDate ld = zdt.toLocalDate();
		DateTimeFormatter fLocalDate = DateTimeFormatter.ofPattern(pattern);
		String formatteddate = ld.format(fLocalDate);

		System.out.println("input: " + input);
		System.out.println("ld: " + ld);
		System.out.println("output: " + formatteddate);

		return formatteddate;

	}

}
