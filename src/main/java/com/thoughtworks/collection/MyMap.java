package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(i->i*3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream().map(i->letters[i-1]).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return array.stream().map(i->{
            int a1 = i/26;
            int a2 = i%26;
            String b1 = "";
            String b2 = "";
            if(a1!=0&&a2!=0) {
                b1 = letters[a1-1];
            }
            if(a1!=0&&a2==0){
                b2 = letters[25];
            }
            if(a2!=0&&i>26) {
                b2 = letters[a2-1];
            }
            return b1+b2;
        }).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
