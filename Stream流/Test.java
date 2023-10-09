import java.util.ArrayList;
import java.util.List;

/**
 * @Author LiTeng
 * @Date 2023/10/9 14:38
 * Version 1.0
 * @Description 练习案例
 */
public class Test {
    /**
     * 按照下面的要求完成集合的创建和遍历，创建一个集合，存储多个字符串元素。存储：张无忌、周芷若、赵敏、张强、张三丰
     *
     * 1、把所有以“张”开头的元素存储到新集合中
     *
     * 2、把以“张”开头的，长度为3的元素再存储到新集合中
     *
     * 3、遍历打印最终结果
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏、");
        list.add("张强");
        list.add("张强");
        list.add("张三丰");

        //1、把所有以“张”开头的元素存储到新集合中
        List<String> list1 = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张")){
                list1.add(name);
            }

        }

        //2、把以“张”开头的，长度为3的元素再存储到新集合中
        List<String> list2 = new ArrayList<>();
        for (String name : list1) {
            if (name.length() == 3){
                list2.add(name);
            }
        }

        //遍历打印最终结果
        System.out.println(list2);
    }

}
