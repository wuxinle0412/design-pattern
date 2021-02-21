package org.example.abstractfactory.product.button;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/10 23:53
 * Description: Spring按钮类，充当具体产品
 */
public class SpringButton implements Button {

  public void display() {
    System.out.println("显示浅绿色按钮");
  }
}
