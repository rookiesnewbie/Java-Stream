import java.util.Set;

/**
 * @Author LiTeng
 * @Date 2023/10/9 10:57
 * Version 1.0
 * @Description 创建不可变的Set集合
 */
public class ImmutableOfSet {

    public static void main(String[] args) {
        /**
         * 创建不可变的set集合
         *  "李白","铠","兰陵王","小乔","大乔","孙策","周瑜","诸葛亮"
         */

        Set<String> set = Set.of( "李白","铠","兰陵王","小乔","大乔","孙策","周瑜","诸葛亮");

        for (String s : set) {
            System.out.print(s +" ");
        }


    }

}
