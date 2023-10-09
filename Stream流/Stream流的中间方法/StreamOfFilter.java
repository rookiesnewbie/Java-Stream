package Stream流的中间方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author LiTeng
 * @Date 2023/10/9 15:59
 * Version 1.0
 * @Description filter方法
 */
public class StreamOfFilter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张翠山","张三丰","张启山");

        //1.使用匿名内部类实现
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //返回值为true，表示当前数据留下
                //返回值为false，表示当前数据舍弃
                return s.startsWith("张");
            }
        }).forEach(name -> System.out.println(name));

        System.out.println("===============================");

        //2.使用lambda表达式实现
        list.stream().filter(name -> name.startsWith("张")).forEach(name -> System.out.println(name));
    }

}
