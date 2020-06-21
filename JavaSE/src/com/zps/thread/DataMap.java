package com.zps.thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zps on 2020/6/10 20:24
 */
public class DataMap {

    private Map<String, List<String>> indexMap = new HashMap<>();

    private Map<String,String> modelData = new HashMap<>();


    public Map<String, List<String>> getIndexMap() {

        return indexMap;
    }

    public Map<String, String> getModelData() {

        return modelData;
    }

    public void loadData(){
        modelData.put("A","a");
        modelData.put("B","b");
        modelData.put("B","c");

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("A");
        arr1.add("B");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("A");
        arr2.add("C");
        indexMap.put("1",arr1);
        indexMap.put("2",arr2);


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(indexMap);
    }

}
