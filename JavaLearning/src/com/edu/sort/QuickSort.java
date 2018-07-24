package com.edu.sort;

import java.util.Arrays;
import java.util.stream.Collectors;
/**
* @ClassName: QuickSort
* @Description:基本思想：先找准基数，随意选择数组一个元素，作为基数，不过一般选择数组头或者尾作为基数，如果选择了其他的元素，也要首先交换到末尾或者头。
   			      分区过程：比基数大的放在右边，比基数小的放在左边。重复下去就可以排序了。 			      
* @author nb2dream
* @date 2018年7月24日
*
*/
public class QuickSort {
	 
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        Object [] array = { 78, 34, 12, 64, 5, 4, 62, 99, 98, 5, 18, 23, 34, 15, 51 };
        qs.sort(array);
        System.out.println(Arrays.stream(array).map(x -> x.toString()).collect(Collectors.joining(",", "[", "]")));

    }
    
    public void sort(Object [] array) {
        quickSort(array, 0, array.length - 1);
    }
 
    /**
     * 通过划分，基于分治思想，递归执行子任务排序最后合并
     * 
     * @param low
     *            数组首位索引
     * @param high
     *            数组末尾索引
     */
    public void quickSort(Object [] array, int low, int high) {
        int middleIndex;
        if (low < high) {
            middleIndex = getMiddleIndex(array, low, high);
            quickSort(array, low, middleIndex - 1);
            quickSort(array, middleIndex + 1, high);
        }
    }
 
    /**
     * 简单划分方法
     */
    
    public int getMiddleIndex(Object [] array, int i, int j) {
        int pivot = (int) array[i]; // array[i] 就是 第一个坑
 
        while (i < j) {
            while (i < j && (int)array[j] >= pivot) {
                j--; // 从右向左找出小于基准数pivot的数来填充array[i]
            }
 
            if (i < j) {
                array[i] = array[j]; // 将array[j]填充到array[i]中，array[j]就形成了一个新的坑
                i++;
            }
 
            while (i < j && (int)array[i] <= pivot) {
                i++; // 从左向右找出大于基准数pivot的数来填充array[j]
            }
 
            if (i < j) {
                array[j] = array[i]; // 将array[i]填充到array[j]中，array[i]就形成了一个新的坑
                j--;
            }
        }
        array[i] = pivot; // 退出时，i等于j。将pivot填到这个坑中。
        return i;
    }
}
