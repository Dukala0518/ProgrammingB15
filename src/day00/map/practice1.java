package day00.map;

import java.util.Map;

public class practice1 {
    /*
    Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
     If both keys are present, append their 2 string values together and store the result under the key "ab".


mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}

    */
    public Map<String,String> myMap (Map<String, String> jjj){

        if(jjj.containsKey("a") && jjj.containsKey("b")){

            jjj.put("ab",jjj.get("a")+jjj.get("b"));

        }
        return jjj;
    }
}
