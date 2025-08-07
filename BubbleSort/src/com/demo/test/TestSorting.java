package com.demo.test;

import java.util.Arrays;

import com.demo.service.BubbleSort;

public class TestSorting {

	public static void main(String[] args) {
		int[]arr= {2,8,3,5,4,6,1,7};
		
		///bubble sort
		//System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr)));

		
		System.out.println(Arrays.toString(BubbleSort.improvedbubbleSort(arr)));

	}

}
