package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<>();
        if(left>right){
            for(int i=left;i>=right;i--){
                list.add(i);
            }
        }else {
            for(int i=left;i<=right;i++){
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = new ArrayList<>();
        if(left>right){
            for(int i=left;i>=right;i--){
                if(i%2==0) {
                    list.add(i);
                }
            }
        }else {
            for(int i=left;i<=right;i++){
                if(i%2==0) {
                    list.add(i);
                }
            }
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<array.length;i++) {
            if(array[i]%2==0) {
                list.add(array[i]);
            }
        }
        return list;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list = new ArrayList<>();
        for(int i:firstArray) {
            for (int j : secondArray){
                if(i==j){
                    list.add(i);
                }
            }
        }
        return list;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> list = new ArrayList<>();
        for(int i:firstArray) {
            list.add(i);
        }

        for (int j:secondArray){
            if(list.indexOf(j)==-1) {
                list.add(j);
            }
        }
        return list;
    }
}
