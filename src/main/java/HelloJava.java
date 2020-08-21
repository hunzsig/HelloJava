import com.alibaba.fastjson.JSON;
//import com.tydic.open.DopApiV1;

import java.util.HashMap;
import java.util.Map;

public class HelloJava {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("args[0]", args[0]);
        map.put("key1", "One");
        map.put("key2", "Two");
//        DopApiV1 x = new DopApiV1("1");
        String mapJson = JSON.toJSONString(map);
        System.out.println(mapJson);
    }

}
