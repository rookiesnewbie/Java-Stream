package Stream流的终结方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author LiTeng
 * @Date 2023/10/9 15:59
 * Version 1.0
 * @Description Count方法
 */
public class StreamOfCount {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌","周芷若","赵敏","张翠山","张三丰","张启山");

        long count = list1.stream().count();//统计stream集合中数据的个数
        System.out.println(count);


    }

}
