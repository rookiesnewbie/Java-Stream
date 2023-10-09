import java.util.Map;
import java.util.Set;

/**
 * @Author LiTeng
 * @Date 2023/10/9 10:58
 * Version 1.0
 * @Description 创建不可变的Map集合
 */
public class ImmutableOfMap {
    public static void main(String[] args) {
        /**
         * 创建不可变的Map集合
         *  "李白","铠","兰陵王","小乔","大乔","孙策","周瑜","诸葛亮"
         */

        Map<String,String> map = Map.of( "李白","铠","兰陵王","小乔","大乔","孙策","周瑜","诸葛亮");

        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);

            System.out.println(key + "=" + value);
        }
    }

}
