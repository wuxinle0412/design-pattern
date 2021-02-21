package org.example.simplefactory.factory;

import org.example.simplefactory.product.Chart;
import org.example.simplefactory.product.HistogramChart;
import org.example.simplefactory.product.LineChart;
import org.example.simplefactory.product.PieChart;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/28 22:10
 * Description: 图表工厂类，充当工厂类
 */
public class ChartFactory {
  // 静态工厂方法
  public static Chart getChart(String type) {
    Chart chart = null;
    if (type.equalsIgnoreCase("histogram")) {
      chart = new HistogramChart();
      System.out.println("初始化设置柱状图");
    } else if (type.equalsIgnoreCase("pie")) {
      chart = new PieChart();
      System.out.println("初始化设置饼状图");
    } else if (type.equalsIgnoreCase("line")) {
      chart = new LineChart();
      System.out.println("初始化设置折线图");
    }
    return chart;
  }
}
