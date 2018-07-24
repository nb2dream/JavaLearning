/**
* @Title: BubbleSort.java
* @Package com.edu.sort
* @Description: TODO(用一句话描述该文件做什么)
* @author nb2dream
* @date 2018年7月24日
* @version V1.0
*/
package com.edu.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
* @ClassName: BubbleSort
* @Description: 基本流程就是，自下而上比较相邻的两个元素进行比较，让大的元素往下面沉，较小的往上冒。按照排序规则进行比较，如果是跟排序的规则相反就需要调整互换。
* @author nb2dream
* @date 2018年7月24日
*
*/

public class BubbleSort {
	public static void main(String[] args) {
		Object [] array={1,23,53,64,2,3,4,2};
		sort(array);
		System.out.println(Arrays.stream(array).map(x -> x.toString()).collect(Collectors.joining(",", "[", "]")));
	}	
	public  static void sort(Object[] array) {
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-1-i;j++){
				if((int)array[j]>(int)array[j+1])
					swap(array,j,j+1);
			}
		}
		
	}
	public  static void swap(Object[] array,int a, int b) {
		Object temp;
		temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
}
