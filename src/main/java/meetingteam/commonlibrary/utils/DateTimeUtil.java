package meetingteam.commonlibrary.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class DateTimeUtil {
    public static String format(LocalDateTime time) {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm dd/MM/YYYY");
        return formatter.format(time);
    }

    public static List<LocalDate> getWeekRange(Integer week){
        var today= LocalDate.now();
        Integer currentDayOfWeek=today.getDayOfWeek().getValue();

        var startDate=today.plusDays(week* 7+1-currentDayOfWeek);
        var endDate=startDate.plusDays(6);

        return List.of(startDate,endDate);
    }

    public static Date convertToDate(LocalDateTime time) {
        return Date.from(time.atZone(ZoneId.systemDefault())
                .toInstant());
    }

    public static LocalDateTime convertToLocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }
}
