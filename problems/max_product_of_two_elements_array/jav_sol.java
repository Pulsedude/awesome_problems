package max_product_of_two_elements_array;

import java.util.*;


class CoolSolution {
    public int maxProduct(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                result = Math.max(result, (arr[i] - 1) * (arr[j] - 1));
            }
        }
        return result;
    }
}

public class jav_sol {
    public static void main(String[] args) {
        CoolSolution coolSol = new CoolSolution();
        int[] target_arr = new int[4];
        
        // dynamic array
        ArrayList<Integer> d_arr = new ArrayList<>();

        d_arr.add(3);
        d_arr.add(4);
        d_arr.add(5);
        d_arr.add(2);

        for (int i = 0 ; i < d_arr.size(); i++) {
            target_arr[i] = d_arr.get(i);
        }
        System.out.println(coolSol.maxProduct(target_arr));
    }
}
