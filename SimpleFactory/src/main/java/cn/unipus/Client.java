package cn.unipus;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/28 22:15
 * Description: 客户端测试类
 */
public class Client {
  public static void main(String[] args) {
    Chart chart = ChartFactory.getChart("histogram");
    chart.display();
  }
}
