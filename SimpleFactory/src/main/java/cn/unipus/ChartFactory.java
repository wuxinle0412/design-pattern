package cn.unipus;

import cn.unipus.impl.HistogramChart;
import cn.unipus.impl.LineChart;
import cn.unipus.impl.PieChart;

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
