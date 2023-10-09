import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @Author LiTeng
 * @Date 2023/10/9 14:47
 * Version 1.0
 * @Description 数组获取stream流
 */
public class StreamDemo4 {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6,7,8,9};

        Arrays.stream(arr).forEach(num -> System.out.println(num));

//        Stream.of(arr).forEach(num -> System.out.println(num));

    }

    }
