package Stream流的中间方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author LiTeng
 * @Date 2023/10/9 15:59
 * Version 1.0
 * @Description Concat方法
 */
public class StreamOfConcat {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌","周芷若","赵敏","张翠山","张三丰","张启山");

        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"张良","诸葛亮");


        //使用Concat将list1和list2两个集合合并，注意要合并的集合数据类型必须一致
        Stream.concat(list1.stream(),list2.stream()).forEach(list -> System.out.println(list));

    }

}
