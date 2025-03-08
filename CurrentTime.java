import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class CurrentTime{
	public static void main(String[] args){
		//define the time zone;
		ZoneId gmt=ZoneId.of("GMT");
		ZoneId ist=ZoneId.of("Asia/Kolkata");
		ZoneId pst=ZoneId.of("America/Los_Angeles");
		
		//get current time in different zones
		ZonedDateTime gmtTime=ZonedDateTime.now(gmt);
		ZonedDateTime istTime=ZonedDateTime.now(ist);
		ZonedDateTime pstTime=ZonedDateTime.now(pst);
		
		//define 
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
		
		System.out.println("Current time in GMT"+ gmtTime.format(formatter));
		System.out.println("Current time in GMT"+ istTime.format(formatter));
		System.out.println("Current time in GMT"+ pstTime.format(formatter));
		
	}
	
	
}

//output
//Current time in GMT2025-03-07 09:23:50 GMT
//Current time in GMT2025-03-07 14:53:50 IST
//Current time in GMT2025-03-07 01:23:50 GMT-08:00
