package cn.unipus.design.strategy.impl;

import cn.unipus.design.strategy.Discount;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/18 21:23
 * Description: 学生票折扣类，充当具体策略类
 */
public class StudentDiscount implements Discount {
  private final double DISCOUNT = 0.8;

  public double calculate(double price) {
    System.out.println("学生票" );
    return price * DISCOUNT;
  }

}
