package stream的使用步骤;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Author LiTeng
 * @Date 2023/10/9 14:47
 * Version 1.0
 * @Description 一堆零散的数据获取stream流
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5).forEach(num -> System.out.println(num));

        System.out.println("=============");
        Stream.of("A","B","C","D","E").forEach(num -> System.out.println(num));
    }

    }
