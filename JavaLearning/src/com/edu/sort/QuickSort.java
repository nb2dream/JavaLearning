package com.edu.sort;

public class QuickSort {
	 
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] array = { 78, 34, 12, 64, 5, 4, 62, 99, 98, 5, 18, 23, 34, 15, 51 };
        qs.sort(array);
         for(int a:array){
        	 System.out.print(a+" ");
         }

    }
 
    public void sort(int[] array) {
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
    public void quickSort(int[] array, int low, int high) {
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
    public int getMiddleIndex(int[] array, int i, int j) {
        int pivot = array[i]; // array[i] 就是 第一个坑
 
        while (i < j) {
            while (i < j && array[j] >= pivot) {
                j--; // 从右向左找出小于基准数pivot的数来填充array[i]
            }
 
            if (i < j) {
                array[i] = array[j]; // 将array[j]填充到array[i]中，array[j]就形成了一个新的坑
                i++;
            }
 
            while (i < j && array[i] <= pivot) {
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
