package meetingteam.commonlibrary.services;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CircuitBreakerFallbackHandler {
    protected void handleBodilessFallback(Throwable throwable) throws Throwable {
        handleError(throwable);
    }

    protected void handleError(Throwable throwable) throws Throwable {
        log.error("Circuit breaker records an error. Detail {}", throwable.getMessage());
        throw throwable;
    }

    protected <T> T handleTypedFallback(Throwable throwable) throws Throwable {
        handleError(throwable);
        return null;
    }
}
