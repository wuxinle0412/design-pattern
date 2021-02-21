package org.example.abstractfactory.product.button;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/10 23:54
 * Description: Summer按钮类，充当具体按钮类
 */
public class SummerButton implements Button {
  public void display() {
    System.out.println("显示浅蓝色按钮");
  }
}
