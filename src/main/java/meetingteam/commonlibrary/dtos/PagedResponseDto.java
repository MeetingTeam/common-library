package meetingteam.commonlibrary.dtos;

import java.util.List;

public record PagedResponseDto<T>(
        List<T> data,
        Pagination pagination
) {}
