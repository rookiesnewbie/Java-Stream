package stream的使用步骤;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @Author LiTeng
 * @Date 2023/10/9 14:47
 * Version 1.0
 * @Description 单列集合获取stream流
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Collections.addAll(list,"张无忌","周芷若","赵敏","张翠山","张三丰");

        //复杂的写法
        Stream<String> stream = list.stream();
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //形参s是list中的每一个数据
                System.out.println(s);
            }
        });

        System.out.println("======================");

        //简单的写法
        list.stream().forEach(name -> System.out.println(name));

    }

    }
