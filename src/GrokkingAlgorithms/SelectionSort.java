package GrokkingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static int findSmallest(List<Integer> array){
        int minValue = array.get(0);
        int minIndex = 0;
        for (int i = 1; i <array.size() ; i++) {
            if(array.get(i)<minValue){
                minValue = array.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(151,5,7,12,9,21,14));
        System.out.println(findSmallest(array));
    }
}
