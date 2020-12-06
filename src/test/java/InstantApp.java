import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class InstantApp {

    static ZoneId TEHRAN_ZONE_ID = ZoneId.of("Asia/Tehran");

    public static void main(String[] args) {
        /*Instant now = ZonedDateTime.now(TEHRAN_ZONE_ID).truncatedTo(DAYS).toInstant();
        System.out.println(now);
        System.out.println(java.time.LocalDateTime.now());*/
        Instant now = Instant.now();
        Instant referenceTime = now.minus(3, ChronoUnit.MONTHS);


    }
}
