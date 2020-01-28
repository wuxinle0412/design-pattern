package cn.unipus.impl;

import cn.unipus.Chart;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/28 22:09
 */
public class LineChart implements Chart {

  public LineChart() {
    System.out.println("创建折线图");
  }

  public void display() {
    System.out.println("显示折线图");
  }

}
