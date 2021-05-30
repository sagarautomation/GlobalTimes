package enums;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumRunner {

	public static void main(String[] args) {
		
		//Java compiler by default add toString method in this..
		
		Severity sev=Severity.CRITICAL;
		switch (sev) {
		case CRITICAL:
			System.out.println("critical");
			break;
		case HIGH:
			System.out.println("high");
			break;
		}
		
		
		Map<Severity,String> emap=new EnumMap<>(Severity.class);
		emap.put(sev.CRITICAL, "critical");
		emap.put(sev.HIGH, "high");
		emap.put(sev.LOW, "low");
		emap.forEach((k,v)->System.out.println(k));
		




		
		

	}

}
