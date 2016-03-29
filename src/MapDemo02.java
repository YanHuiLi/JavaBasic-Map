import java.util.*;

/**
 * 使用map接口，键值对的形式保存数据
 * Created by Archer on 2016/3/29.
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();

        map.put("key1","Archer");
        map.put("key2","www");
        map.put("key3","eoe");
        map.put("key4","Android");
        map.put("key5","Hello");
/**

        if (map.containsKey("key11")){
            System.out.println("key存在");
        }else{
            System.out.println("不存在");
        }

        if(map.containsValue("Archer")){
            System.out.println("value存在");
        }else{
            System.out.println("value不存在");
        }
 */
        /**
        //得到所有key返回的是一个set集合
       Set<String> s= map.keySet();
        //通过迭代器来输出

        s.forEach(System.out::println);
        */

        //得到所有值 value
        Collection<String> collection= map.values();

        collection.forEach(System.out::println);



    }
}
