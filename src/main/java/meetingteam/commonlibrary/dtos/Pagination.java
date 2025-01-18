package meetingteam.commonlibrary.dtos;

public record Pagination(
    Integer currentPage,
    Integer totalPages,
    Long totalRecords
){}
