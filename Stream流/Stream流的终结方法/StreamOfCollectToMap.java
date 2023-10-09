package Stream流的终结方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author LiTeng
 * @Date 2023/10/9 15:59
 * Version 1.0
 * @Description Collect方法
 */
public class StreamOfCollectToMap {
    public static void main(String[] args) {

        //注意：如果要收集的数据转换成Map集合，则键不能重复，否则会报错
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌-男-18","周芷若-女-19","赵敏-女-19","张翠山-男-49","张三丰-男-65","张启山-男-25");

        //1.匿名内部类的写法
        /**
         * 需求：收集所有男性的数据，将其名字作为key，年龄作为value返回
         * 解释：
         *      toMap()方法：
         *          参数一（是一个函数）：表示键的生成规则
         *          参数二（是一个函数）：表示值的生成规则
         *
         *          解释参数一：
         *              Function的泛型一：表示流中每一个数据的类型
         *              Function的泛型二：表示转换成Map集合中键的数据类型
         *
         *              方法apply的形参：依次表示流中的每一个数据
         *                      方法体：生成键的代码规则
         *                      返回值：已生成的键
         *
         *          解释参数二：
         *              Function的泛型一：表示流中每一个数据的类型
         *              Function的泛型二：表示转换成Map集合中值的数据类型
         *
         *              方法apply的形参：依次表示流中的每一个数据
         *                      方法体：生成值的代码规则
         *                      返回值：已生成的值
         *
         *
         *
         *
         *
         */
        Map<String, Integer> map = list1.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split("-")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[2]);
            }
        }));

        System.out.println(map);


        System.out.println("===================");

        //2.lambda表达式的写法
        Map<String, String> collect = list1.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(
                        Collectors.toMap(key -> key.split("-")[0], value -> value.split("-")[2])
                );
        System.out.println(collect);

    }

}
