import java.util.HashMap;
import java.util.Map;

/**
 * 使用map接口，键值对的形式保存数据
 * Created by Archer on 2016/3/29.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();

        map.put("key1","Archer");
        map.put("key2","www");
        map.put("key3","eoe");
        map.put("key4","Android");
        map.put("key5","Hello");

        String string=map.get("key1");
        System.out.println(string);
    }
}
