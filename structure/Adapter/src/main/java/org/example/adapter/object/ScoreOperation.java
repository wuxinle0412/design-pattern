package org.example.adapter.object;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/11 10:00
 */
public interface ScoreOperation {
  public int[] sort(int[] array);  //成绩排序
  public int search(int[] array, int key);  //成绩查找
}
