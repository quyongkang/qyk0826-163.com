package com.action;

public class Test01 {
	public static void main(String[] args) {
		int[] arr = { -1, 3, -1, -0, -11, -4, 2, 0, -1, -1, 3, 2, -1, -11 };
		int a = 0;
		int b = arr.length - 1;
		while (true) {
			if (arr[a] > 0) {
				a++;
			}
			if (arr[b] <= 0) {
				b--;
			}
			if (a >= b) {
				break;
			}
			if (arr[a] <= 0 && arr[b] > 0) {
				arr[a]=arr[b]^arr[a];
				arr[b]=arr[a]^arr[b];
				arr[a]=arr[a]^arr[b];
			}
		}
		for(int i : arr){
			System.out.println(i+",");
		}
	}
}
