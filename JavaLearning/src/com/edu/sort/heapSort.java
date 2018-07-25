package com.edu.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class heapSort {
	public static void main(String[] args) {
		Object [] array={1,23,53,64,2,3,4,2,5,6,3,4,89};
		sort(array);
		System.out.println(Arrays.stream(array).map(s->s.toString()).collect(Collectors.joining(",","[","]")));
	}

	private static void sort(Object[] array) {
		buildMaxHeap(array);
		for(int i=array.length-1;i>=1;i--){
			swap(array,0,i);
			maxHeap(array, i, 0);
		}
	}
	private static void buildMaxHeap(Object[] array) {
		 int cursor = array.length / 2;
	       for (int i = cursor; i >= 0; i--) { 
	            maxHeap(array, array.length, i);
	        }
	}

	private static void maxHeap(Object[] array, int i, int j) {
		    int left = j * 2 + 1; 
	        int right = j * 2 + 2; 
	        int maxValue = j; 
	        if(left<i && (int)array[left] > (int)array[maxValue])
	        	 maxValue = left;
	        if(right<i && (int)array[right] > (int)array[maxValue])
	         maxValue = right;
	        if (maxValue != j) {
	            swap(array, j, maxValue);
	            maxHeap(array, i, maxValue);
	        }
	}

	private static void swap(Object[] array, int i, int j) {
		Object temp;
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}

	

}

