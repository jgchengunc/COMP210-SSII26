package L8.recursion;

public class RecursionPracticeSoln {

    public static String upgrade(String s) {
        if (s.length() < 3) return s;
        if (s.startsWith("110")) return "210" + upgrade(s.substring(3));
        return s.charAt(0) + upgrade(s.substring(1));
    }

    public static int pairCount(String s) {
        if (s.length() < 3) return 0;
        if (s.charAt(0) == s.charAt(2)) return 1 + pairCount(s.substring(1));
        return pairCount(s.substring(1));
    }

    boolean sumToTarget(int[] nums, int index, int target) {
        if (target == 0) return true;
        if (index == nums.length || target < 0) return false;
        return sumToTarget(nums, index + 1, target)
                || sumToTarget(nums, index + 1, target - nums[index]);
    }
}
