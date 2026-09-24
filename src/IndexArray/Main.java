package IndexArray;

import java.util.Map;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        int[] nums = {4, 5, 4, 5, 2};

        Map<Integer, Integer> map = new HashMap<>();


        for(int element : nums){
            map.merge(element,1,Integer::sum);
        }

        for(int element : nums){
            if(map.get(element) == 1){
                System.out.println(element);
                break;
            }
        }





        /*



            for(int i = 0; i < nums.length - 1; ++i){
                for (int j = i + 1; j < nums.length; ++j){
                    if(nums[i] == nums[j])
                        break;
                    else if((j == nums.length - 1) && (nums[i] != nums[j])){
                        System.out.println(nums[i]);
                        return;
                    }
                }

            }
        */



    }
}
