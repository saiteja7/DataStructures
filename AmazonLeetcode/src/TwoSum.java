import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[] args) {
		int[] a = {2,7,11,15};
		
		System.out.println(getTargetSum(a, 9).toString());
		
	}

	//only works when elements are in sorted ascending order
    public static int[] twoSum(int[] nums, int target) {
		int[] a = new int[2];
		int start = 0;
		int end = nums.length;
		while (start <= end) {
			int sum = nums[start] + nums[end - 1];
			if (sum == target) {
				a[0] = nums[start];
				a[1] = nums[end - 1];
				for(int i=0;i<a.length;i++) {
					System.out.println(a[i]);
				}
				return a;
			} else if (sum < target) {
				start++;
			} else if (sum > target) {
				end--;
			}
		}
		return a;
  
    }
    
    public static int[] getTargetSum(int[] nums, int target) {
    	HashMap< Integer, Integer> map = new HashMap();
    	for(int i=0;i<nums.length;i++) {
    		int complement = target - nums[i];
    		if(map.containsKey(complement)) {
    			return new int[] {map.get(complement),i};
    		}
    		map.put(nums[i], i);
    	}
    	
    	return null;
    }
}
