package stream的使用步骤;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @Author LiTeng
 * @Date 2023/10/9 14:47
 * Version 1.0
 * @Description 双列集合获取stream流
 */
public class StreamDemo3 {
    public static void main(String[] args) {
       Map<String, String> hashMap = new HashMap<>();

        hashMap.put("李白","唐朝");
        hashMap.put("王安石","宋朝");
        hashMap.put("苏轼","宋朝");
        hashMap.put("王维","唐朝");
        hashMap.put("李治","唐朝");
        hashMap.put("李世民","唐朝");
        hashMap.put("诸葛亮","三国");

        //通过keySet()获取stream流，keySet()只能获取到Ma集合中的key
        hashMap.keySet().stream().forEach(key -> System.out.println(key));

        System.out.println("============================================");

        //通过entrySet()获取stream流，entrySet()能获取到Ma集合中的key-value键值对
        hashMap.entrySet().stream().forEach(map -> System.out.println(map));

    }

    }
