package meetingteam.commonlibrary.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocketDto {
    private String dest;
    private String topic;
    private Object payload;
}
