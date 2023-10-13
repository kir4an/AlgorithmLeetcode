package Leetcode.Easy.Arrays;

public class Convert1DArrayInto2DArray {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length;

        //Edge Case

        if(m*n!=len){
            return new int[0][0];
        }

        int[][] result=new int[m][n];

        int current=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j] = original[current];
                current++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] original = new int[]{1,2,3,4};
        System.out.println(construct2DArray(original,2,2));
    }
}

