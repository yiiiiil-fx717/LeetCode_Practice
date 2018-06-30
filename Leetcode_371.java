package Leetcode;

public class Leetcode_371 {
	public int getSum(int a, int b) {
        int[] list = {a, b};
        return IntStream.of(list).sum();
    }
}
