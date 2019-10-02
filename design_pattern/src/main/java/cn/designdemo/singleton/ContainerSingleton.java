package cn.designdemo.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例
 */
public class ContainerSingleton {

    private static Map<String,Object> singletonMap = new HashMap<String, Object>();

    public static void putInstance(String key,Object value){
        if (StringUtils.isNoneBlank(key) && value != null){
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key,value);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }


}
