public class Run {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
//        int target = 6;
//        int[] nums = {3,2,4};
//        int[] nums = {3,3};

        int[] Output;
        Output = Solution.twoSum(nums, target);
        System.out.print("[" + Output[0] + "," + Output[1] + "]");

    }
}
