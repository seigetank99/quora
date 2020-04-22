package com.billy.UniQuery.utils;

import java.util.List;
import java.util.Map;

public class TextUtils {
    public static String trim(String content){
        if (content.length()<=115){
            return content;
        }else{
            return content.substring(0,114);
        }
    }
    public static List<Map<String,Object>> trimMap(List<Map<String,Object>> mapList){
        for (Map<String,Object> map:mapList){
            for (Map.Entry<String,Object> entry:map.entrySet()){
                if (entry.getKey().equals("answer")){
                    Map<String,Object> answerMap=(Map<String,Object>) entry.getValue();
                    for (Map.Entry<String,Object> answerEntry:answerMap.entrySet()){
                        if (answerEntry.getKey().equals("content")){
                            String trimmedContent=trim((String) answerEntry.getValue());
                            answerMap.put("content", trimmedContent);
                        }
                    }
                }
            }
        }
        return mapList;
    }
    public static boolean phoneOrUsername(String content){
        if (content.length()<11&&content.length()>3){
            return false;
        }
        return true;
    }
}
