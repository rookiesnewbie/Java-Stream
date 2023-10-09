package Stream流的中间方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author LiTeng
 * @Date 2023/10/9 15:59
 * Version 1.0
 * @Description skip方法
 */
public class StreamOfSkip {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张翠山","张三丰","张启山");

        //1.获取集合中从第3个到结束的所有数据
        list.stream().skip(2).forEach(name -> System.out.println(name));

    }

}
