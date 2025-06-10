package com.example.community.common.util;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import java.io.Serializable;
import java.util.List;
public class CloneUtil {
    public static <T,K> T clone(K source, Class<T> clazz) {
        T t = BeanUtils.instantiateClass(clazz);
        BeanUtils.copyProperties(source, t);
        return t;
    }
}
