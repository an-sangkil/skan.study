package org.example.plain;

import java.util.HashMap;
import java.util.Map;

public class HashTest {

    public static void main(String args[]) {

        Map<String,String> map = Map.of("key1", "value1","key2", "value2");

        String keyName="key1";

        if (map.containsKey(keyName)) {
            System.out.println(map.get(keyName));
        }

    }
}
