package Leetcode;

public class Leetcode_739 {
	public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length == 0 || temperatures == null){
            return temperatures;
        }
        for(int i = 0; i < temperatures.length; i++){
            int j = i;
            while(j < temperatures.length && temperatures[i] >= temperatures[j]){
                j++;
            }
            if(j == temperatures.length){
                temperatures[i] = 0;
            }else{
                temperatures[i] = j - i;
            }
        }
        temperatures[temperatures.length - 1] = 0;
        return temperatures;
    }
}
