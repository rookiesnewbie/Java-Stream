package Stream流的终结方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @Author LiTeng
 * @Date 2023/10/9 15:59
 * Version 1.0
 * @Description ForEach方法
 */
public class StreamOfForEach {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌","周芷若","赵敏","张翠山","张三丰","张启山");

        //1.匿名内部类的写法
        /**
         * Consumer的泛型：流中的数据类型
         * 重写accept方法的形参：liu中的每一个数据，方法体用于处理逻辑
         */
        list1.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("==================================");

        //2.lambda形式实现
        list1.stream().forEach(s -> System.out.println(s));

    }

}
