package cn.unipus.design.strategy.impl;

import cn.unipus.design.strategy.Discount;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/18 21:28
 */
public class VIPDiscount implements Discount {

  private final double DISCOUNT = 0.5;

  public double calculate(double price) {
    System.out.println("VIP票");
    System.out.println("增加积分!");
    return price * DISCOUNT;
  }

}
