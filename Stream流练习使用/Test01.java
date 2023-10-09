import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author LiTeng
 * @Date 2023/10/9 19:59
 * Version 1.0
 * @Description 练习一
 */
public class Test01 {
    /**
     * 需求：
     *      1、定义一个集合，并添加一些整数 1,2,3,4,5,6,7,8,9,10
     *      2、过滤奇数,只留下偶数。
     *      3、并将结果保存起来
     *
     */
    public static void main(String[] args) {

        // 1、定义一个集合，并添加一些整数 1,2,3,4,5,6,7,8,9,10
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        // 2、过滤奇数,只留下偶数。并将结果保存起来
        List<Integer> collect = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

        System.out.println(collect);


    }

}
