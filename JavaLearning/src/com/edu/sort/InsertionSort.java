package com.edu.sort;

import java.util.Arrays;
import java.util.stream.Collectors;
/**
 * 
* @ClassName: InsertionSort
* @Description: 假设待排序的数据是数组A[1….n]。初始时，A[1]自成1个有序区，
* 无序区为A[2….n]。在排序的过程中，依次将A[i] (i=2,3,….,n)从后往前插入到
* 前面已排好序的子数组A[1,…,i-1]中的适当位置，当所有的A[i] 插入完毕，数组A
* 中就包含了已排好序的输出序列
* @author nb2dream
* @date 2018年7月24日
*
 */
public class InsertionSort {

	public static void main(String[] args) {
		Object [] array={1,23,53,64,2,3,4,2,5,6,3,4,89};
		sort(array);
		System.out.println(Arrays.stream(array).map(x->x.toString()).collect(Collectors.joining(",","[","]")));
	}

	private static void sort(Object[] array) {
		int j, i;
		int index;
		for( i=1;i<array.length;i++){
			index=(int) array[i];//要插入的元素
			for(j=i-1;j>=0;j--){
				if((int)array[j]>index)
				{
					array[j+1]=array[j];//往后移动，空出前面需要插入元素的位置
				}else{
                    break;
                }
			}
			array[j+1]=index;
		}
	}
}
