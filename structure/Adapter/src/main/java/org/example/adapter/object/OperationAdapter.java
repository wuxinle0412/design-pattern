package org.example.adapter.object;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/11 10:33
 */
public class OperationAdapter implements ScoreOperation {

  private QuickSort sortObj;  //定义适配者QuickSort对象
  private BinarySearch searchObj;  //定义适配者BinarySearch对象

  public OperationAdapter() {
    this.sortObj = new QuickSort();
    this.searchObj = new BinarySearch();
  }

  public int[] sort(int[] array) {
    return sortObj.quickSort(array);  //调用适配者类的quickSort方法完成快速排序功能
  }

  public int search(int[] array, int key) {
    return this.searchObj.binarySearch(array, key);  //调用适配者类的binarySearch方法完成二分查找功能
  }

}
