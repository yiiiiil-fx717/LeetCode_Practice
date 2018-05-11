package Leetcode;

public class Leetcode_605 {
	
	public static boolean placeFlowers(int[] flowerbed, int n){
		for(int i = 0; i < flowerbed.length; i++){
			if(flowerbed[i] == 0){
				if(flowerbed.length == 1){
					flowerbed[0] = 1;
					n--;
				}
				else if(i == 0){
					if(flowerbed[i + 1] == 0){
						flowerbed[i] = 1;
						n--;
					}else{
						continue;
					}
				}
				else if(i != 0 && i != flowerbed.length - 1){
					if(flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
						flowerbed[i] = 1;
						n--;
					}else{
						continue;
					}
				}
				else if(i == flowerbed.length - 1){
					if(flowerbed[i - 1] == 0){
						flowerbed[i] = 1;
						n--;
					}else{
						continue;
					}
				}
			}
		}
		return n <= 0;
	}

	public static void main(String[] args) {
		int[] flowerbed = {0};
		int n = 1;
		System.out.println(placeFlowers(flowerbed,n));
	}

}
