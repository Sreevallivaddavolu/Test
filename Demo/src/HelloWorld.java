import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.print("Hello Git Hub!");
		String v_envTimeZoneId=TimeZone.getDefault().getID();
		System.out.println("\n"+v_envTimeZoneId);
		TimeZone tz = TimeZone.getTimeZone(v_envTimeZoneId);
		System.out.println("\n"+tz);
		String ofset=tz.toZoneId().getId();
		System.out.println(ofset);
		LocalDateTime dt = LocalDateTime.now();
		ZoneId zone = ZoneId.of(v_envTimeZoneId);
	    ZonedDateTime zdt = dt.atZone(zone);
	    ZoneOffset offset = zdt.getOffset();
	    System.out.println(offset);
	}

}
