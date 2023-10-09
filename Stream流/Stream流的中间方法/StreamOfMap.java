package Stream流的中间方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @Author LiTeng
 * @Date 2023/10/9 15:59
 * Version 1.0
 * @Description Map方法
 */
public class StreamOfMap {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌-18", "周芷若-19", "赵敏-19", "张翠山-56", "张三丰-65", "张启山-31");

        /**
         * 需求：取出集合中的年龄数据，如18，19等转换成int类型
         */

        //1.使用匿名内部类的写法
        //function中的第一个参数为集合的数据类型，第二的参数为要转换成的数据类型，重写的apply方法的形参为集合中的每一个数据，返回值类型为要转换成的数据类型
        list1.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] split = s.split("-");
                Integer age = Integer.valueOf(split[1]);
                return age;
            }
        }).forEach(age -> System.out.println(age));


        System.out.println("===========================");

        //2.使用lambda表达式实现
        list1.stream().map(s -> {
            String[] split = s.split("-");
            Integer age = Integer.valueOf(split[1]);
            return age;
        }).forEach(age -> System.out.println(age));

        System.out.println("=======================");

        //方式二的简写形式
        list1.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(System.out::println);
    }

}
