import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author LiTeng
 * @Date 2023/10/9 19:59
 * Version 1.0
 * @Description 练习二
 */
public class Test02 {
    /**
     * 需求：
     *      创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
     *      "zhangsan，23"
     *      "lisi，24”
     *      "wangwu，25”
     *       保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23","lisi,24","wangwu,25");

        Map<String, String> collect = list.stream().filter(p -> Integer.parseInt(p.split(",")[1]) >= 24)
                .collect(Collectors.toMap(key -> key.split(",")[0], value -> value.split(",")[1]));

        System.out.println(collect);
    }

}
