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
 * @Description joining 方法 ,作用：将stream流转换成字符串，并使用指定的字符进行拼接
 */
public class StreamOfCollectToJoin {
    public static void main(String[] args) {

        //注意：如果要收集的数据转换成Map集合，则键不能重复，否则会报错
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌-男-18","周芷若-女-19","赵敏-女-19","张翠山-男-49","张三丰-男-65","张启山-男-25");

        String collect = list1.stream().collect(Collectors.joining(";"));

        System.out.println(collect);

    }

}
