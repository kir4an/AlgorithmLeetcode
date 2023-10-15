package Leetcode.Medium.SlidingWindow;

import java.util.HashMap;

public class FruitBasket {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> fruitBasket = new HashMap<>();
        int left = 0;
        int maxFruits = 0;
        int right = 0;

        for(right = 0;right<fruits.length;right++){
            int currentFruit = fruitBasket.getOrDefault(fruits[right],0);
            fruitBasket.put(fruits[right],currentFruit+1);

            while(fruitBasket.size()>2){
                int fruitCount = fruitBasket.get(fruits[left]);
                if(fruitCount == 1){
                    fruitBasket.remove(fruits[left]);
                }else{
                    fruitBasket.put(fruits[left],fruitCount - 1);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits,right - left + 1);
        }
        return maxFruits;
    }
}
