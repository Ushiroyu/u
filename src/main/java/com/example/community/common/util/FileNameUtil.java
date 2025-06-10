package com.example.community.common.util;
import java.util.UUID;
public class FileNameUtil {
    public static String getSuffix(String fileName){
        return fileName.substring(fileName.lastIndexOf("."));
    }
    public static String getPrefix(String fileName){
        return fileName.substring(0,fileName.lastIndexOf("."));
    }
    public static String getFileName(String fileOriginName){
        String prefix = FileNameUtil.getPrefix(fileOriginName);
        String uuid = "_" + UUID.randomUUID().toString().substring(26);
        String suffix = FileNameUtil.getSuffix(fileOriginName);
        return  prefix + uuid + suffix;
    }
}
