package com.demo.service;

public class BubbleSort {
	
	public static int[] bubbleSort(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
				int temp =arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
				System.out.println("iteration : "+ i +"---->"+j);
		}}
		return arr;
	}
	
	
	
	

	public static int[] improvedbubbleSort(int arr[]) {
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			flag=false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
				int temp =arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				flag=true;
			}
				System.out.println("iteration : "+ i +"---->"+j);
		}
		if(!flag) {
			break;
		}
		}
		return arr;
	}

}
