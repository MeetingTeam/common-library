package meetingteam.commonlibrary.utils;

import java.util.List;
import java.util.Random;

public class FileUtil {
    public static String generateUniqueFileName(String originName) {
        Random rand = new Random();
        String filename= originName.substring(0, originName.lastIndexOf("."));
        String filetype=originName.substring(originName.lastIndexOf(".")+1);
        return filename+"_"+rand.nextInt(100000)+"."+filetype;
    }

    public static boolean isImageUrl(String fileName){
        List<String> imageExtensions= List.of("png", "jpeg", "bmp","jpg", "svg");
        String filetype=fileName.substring(fileName.lastIndexOf(".")+1);
        return imageExtensions.contains(filetype);
    }
}
