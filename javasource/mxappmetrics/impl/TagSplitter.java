package mxappmetrics.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TagSplitter {
    public static Map<String, String> splitTags(String tags) {
        Map<String, String> result = new HashMap<String,String>();
        Map<String, String> map = Pattern.compile("\\s*,\\s*")
                .splitAsStream(tags != null ? tags : "")
                .map(s -> s.split("=", 2))
                .collect(Collectors.toMap(a -> a[0], a -> a.length > 1 ? a[1] : ""));
        result.putAll(map);
        System.out.println("result: " + result.toString());
        return result;
    }
}
