package com.example.community.common.util;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
public class NullUtils {
    public static boolean notEmpty(String str){
        return str != null && !"".equals(str);
    }
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
    public static boolean isEmpty(String str){
        return str == null || str.length() == 0;
    }
    public static <T> boolean notEmpty(Collection<T> collection){
        if(collection != null || collection.size() != 0){
            Iterator<T> iterator = collection.iterator();
            if(iterator != null){
                while(iterator.hasNext()){
                    Object next = iterator.next();
                    if(next != null){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static <T> boolean notEmpty(Map<T, T> map){
        return map != null && !map.isEmpty();
    }
    public static boolean notEmpty(byte[] t){
        return t != null && t.length > 0;
    }
    public static boolean notEmpty(short[] t){
        return t != null && t.length > 0;
    }
    public static boolean notEmpty(int[] t){
        return t != null && t.length > 0;
    }
    public static boolean notEmpty(long[] t){
        return t != null && t.length > 0;
    }
    public static boolean notEmpty(String[] t){
        return t != null && t.length > 0;
    }
    public static boolean notEmpty(Object[] t){
        return t != null && t.length > 0;
    }
    public static boolean notEmpty(Object o){
        return o != null && !"".equals(o) && !"null".equals(o);
    }
    public static boolean isEmpty(Object o){
        return o == null || "".equals(o) || "null".equals(o);
    }
    public static void main(String[] args) {
    }
}