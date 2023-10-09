import java.util.List;

/**
 * @Author LiTeng
 * @Date 2023/10/9 10:57
 * Version 1.0
 * @Description 创建不可变的List集合
 */
public class ImmutableOfList {

    public static void main(String[] args) {
        /**
         * 创建不可变的List集合
         *  "李白","铠","兰陵王","小乔","大乔","孙策","周瑜","诸葛亮"
         */

        //一旦创建完成，就不能修改
        List<String> list = List.of("李白","铠","兰陵王","小乔","大乔","孙策","周瑜","诸葛亮");

        for (String s : list) {
            System.out.print(s + " ");
        }

        list.add("lisi");
        list.set(0,"lisi");
        list.remove("铠");


    }

}
