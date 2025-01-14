package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;
    private List<Integer> a;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        return array.stream().filter(i->i%2==0).collect(Collectors.toList());
    }
    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(i->i%3==0).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> resultList = new ArrayList<>();
        for(int item1:firstList){
            for(int item2:secondList){
                if(item1==item2){
                    resultList.add(item1);
                }

            }
        }
        return resultList;

    }

    public List<Integer> getDifferentElements() {
        return array.stream().distinct().collect(Collectors.toList());
    }
}