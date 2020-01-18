package cn.unipus.design.strategy;

import cn.unipus.design.strategy.util.PropertiesUtil;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/18 21:44
 * Description: 客户端测试类
 */
public class Client {
  public static void main(String[] args) throws Exception {
    Discount discount = (Discount) PropertiesUtil.getBean();
    MovieTicket mt = new MovieTicket(discount);
    double originalPrice = 60.0;
    double currentPrice;

    mt.setPrice(originalPrice);
    System.out.println("原始价格为: " + originalPrice);
    System.out.println("----------------------------");

    currentPrice = mt.getPrice();
    System.out.println("折后价为: " + currentPrice);
  }
}
