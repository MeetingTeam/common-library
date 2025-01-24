package meetingteam.commonlibrary.utils;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.List;

public class AuthUtil {
    public static String getUserId(){
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication == null) throw new AccessDeniedException("Permission denied");

        String userId = authentication.getName();
        if(userId == null) throw new AccessDeniedException("Permission denied");
        return userId;
    }

    public static List<String> getUserRoles(){
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication == null) throw new AccessDeniedException("Permission denied");

        return authentication.getAuthorities().stream()
                .map(grantedAuthority -> grantedAuthority.getAuthority())
                .toList();
    }

    public static String getJwtToken(){
        return ((Jwt) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal())
                .getTokenValue();
    }
}
