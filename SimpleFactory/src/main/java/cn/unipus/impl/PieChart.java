package cn.unipus.impl;

import cn.unipus.Chart;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/28 22:04
 * Description: 饼状图，充当具体产品类
 */
public class PieChart implements Chart {

  public PieChart() {
    System.out.println("创建饼状图");
  }

  public void display() {
    System.out.println("显示饼状图");
  }

}
