package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        if(leftBorder>rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;

        }
        for(int i=leftBorder;i<=rightBorder;i++) {
            if(i%2==0){
                sum += i;
            }
        }
        return sum;

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        if(leftBorder>rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;

        }
        for(int i=leftBorder;i<=rightBorder;i++) {
            if(i%2==1){
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        List<Integer> list = arrayList.stream().map(item->item*3+2).collect(Collectors.toList());

        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()) {
            sum+= iter.next();
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        return arrayList.stream().map(item->{
            if(item%2==1) {
                return item * 3 + 2;
            }
            return item;
        }).collect(Collectors.toList());

    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(item->item%2==1).mapToInt(i->i*3+5).sum();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int sum = 0;
        int count = 0;
        Iterator<Integer> iter = arrayList.iterator();
        while(iter.hasNext()) {
            int elem = iter.next();
            if(elem%2==1) {
                sum += elem;
                count++;
            }
        }
        int average = sum/count;

        return average;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(item->item%2==0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
