package cn.unipus.design.strategy.impl;

import cn.unipus.design.strategy.Discount;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/18 21:26
 * Description: 儿童折扣类，充当具体策略类。
 */
public class ChildrenDiscount implements Discount {

  private final double DISCOUNT = 10;

  public double calculate(double price) {
    System.out.println("儿童票");
    if (price >= 20) {
      return price - DISCOUNT;
    } else {
      return price;
    }
  }

}
