package com.edu.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SelectSort {
	
	public static void main(String[] args) {
		Object [] array={1,23,53,64,2,3,4,2,5,6,3,4,89};
		sort(array);
		System.out.println(Arrays.stream(array).map(x->x.toString()).collect(Collectors.joining(",","[","]")));
	}

	private static void sort(Object[] array) {
		Object temp;
		for(int i=0;i<array.length-1;i++){
			int min=i;
			for(int j=i+1;j<array.length-1;j++){
				if((int)array[min]>(int)array[j]){
					min=j;
				}
			}
			 temp = array[min];  
			 array[min] = array[i];
			 array[i] = temp;
		}
	}
}
