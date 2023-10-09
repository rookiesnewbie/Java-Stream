import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author LiTeng
 * @Date 2023/10/9 10:58
 * Version 1.0
 * @Description 创建不可变的Map集合,且参数大于20个
 */
public class ImmutableOfMap11 {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("李白","唐朝");
        hashMap.put("王安石","宋朝");
        hashMap.put("苏轼","宋朝");
        hashMap.put("王维","唐朝");
        hashMap.put("李治","唐朝");
        hashMap.put("李世民","唐朝");
        hashMap.put("诸葛亮","三国");
        hashMap.put("周瑜","三国");
        hashMap.put("小乔","三国");
        hashMap.put("杜甫","唐朝");
        hashMap.put("周敦颐","唐朝");
        hashMap.put("陶渊明","唐朝");
        hashMap.put("曹操","三国");

//        //将hashMap集合转为不可变的集合
//        Map<String, String> map = Map.copyOf(hashMap);
//        Set<String> set = map.keySet();
//        for (String key : set) {
//            String value = map.get(key);
//            System.out.println(key + "=" +value);
//
//        }


        //获取所有的键值对对象
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();

        Map<Object, Object> ofEntries = Map.ofEntries(entries.toArray(new Map.Entry[0]));
        Set<Map.Entry<Object, Object>> entries1 = ofEntries.entrySet();
        for (Map.Entry<Object, Object> entry : entries1) {
            System.out.println(entry);
        }

        System.out.println("=====================");


        //把entries变成一个数组
        Map.Entry[] arr1 = new Map.Entry[0];
        Map.Entry[] array = entries.toArray(arr1);

        Map map = Map.ofEntries(array);

        Set set = map.entrySet();
        for (Object o : set) {
            System.out.println(o);
        }

    }

}
