package Stream流的终结方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author LiTeng
 * @Date 2023/10/9 15:59
 * Version 1.0
 * @Description Collect方法
 */
public class StreamOfCollectToSet {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌","周芷若","赵敏","张翠山","张三丰","张启山","张翠山");

        Set<String> list= list1.stream().collect(Collectors.toSet());
        System.out.println(list);
    }

}
