package Leetcode;

public class Leetcode_350 {
	public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int pointer1 = 0;
        int pointer2 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(pointer1 < nums1.length && pointer2 < nums2.length){
            if(nums1[pointer1] < nums2[pointer2]){
                pointer1++;
            }else{
                if(nums1[pointer1] > nums2[pointer2]){
                    pointer2++;
                }else{
                    list.add(nums1[pointer1]);
                    pointer1++;
                    pointer2++;
                }
            }
        }
        int[] result = new int[list.size()];
        int i = 0;
        for(int nums : list){
            result[i] = nums;
            i++;
        }
        return result;
    }
}
