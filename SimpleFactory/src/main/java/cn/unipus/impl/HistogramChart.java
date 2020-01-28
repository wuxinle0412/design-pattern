package cn.unipus.impl;

import cn.unipus.Chart;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/28 22:02
 * Description: 柱状图类，
 */
public class HistogramChart implements Chart {

  public HistogramChart() {
    System.out.println("创建柱状图");
  }

  public void display() {
    System.out.println("显示柱状图");
  }

}
