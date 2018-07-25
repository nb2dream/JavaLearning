package com.edu.sort;

import java.util.Arrays;
import java.util.stream.Collectors;
/**
 * 
* @ClassName: ShellSort
* @Description:希尔排序是把记录按下标的一定增量分组，
* 对每组使用直接插入排序算法排序；随着增量逐渐减少，每组包含的关键词越来越多，
* 当增量减至1时，整个文件恰被分成一组，算法便终止。
* @author nb2dream
* @date 2018年7月24日
*
 */
public class ShellSort {

	public static void main(String[] args) {
		Object [] array={1,23,53,64,2,3,4,2,5,6,3,4,89};
		sort(array);
		System.out.println(Arrays.stream(array).map(x->x.toString()).collect(Collectors.joining(",","[","]")));
	}
	private static void sort(Object[] array) {
		int gap=array.length/2;
		int j;
		int index;
		while(gap>0){
			for(int i=gap;i<array.length-1;i+=gap){
				 index=(int) array[i];
				for( j=i-gap;j>=0&&(int)array[j]>index;j-=gap){
					array[j+gap]=array[j];
				}
				array[j+gap]=index;
			}
			gap/=2;
		}
	}
}
