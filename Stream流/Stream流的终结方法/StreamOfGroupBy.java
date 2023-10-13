package Stream流的终结方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author LiTeng
 * @Date 2023/10/9 15:59
 * Version 1.0
 * @Description GroupingBy方法,作用：按某个字段进行分组，返回一个Map聚合
 */
public class StreamOfGroupBy {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌-男-18","周芷若-女-19","赵敏-女-19","张翠山-男-49","张三丰-男-65","张启山-男-25");

        Map<Integer, List<String>> collect = list1.stream().collect(Collectors.groupingBy(user -> Integer.parseInt(user.split("-")[2])));

        System.out.println(collect);


    }

}
