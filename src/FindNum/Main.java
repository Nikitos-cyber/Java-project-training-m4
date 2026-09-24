package FindNum;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;
        for(int i = 0; i < nums.length - 1;  ++i){
            for(int j = i + 1; j < nums.length; ++j){
                if(target == (nums[i]+ nums[j])){
                    System.out.println("nums = " + java.util.Arrays.toString(nums));
                    System.out.println("target = " + target);
                    System.out.println("Реузультат: [ " + nums[i] + ", " + nums[j] + " ] ");
                    return;
                }
            }
        }
    }

}
