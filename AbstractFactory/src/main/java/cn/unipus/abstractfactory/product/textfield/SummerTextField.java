package cn.unipus.abstractfactory.product.textfield;

import cn.unipus.abstractfactory.product.TextField;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/10 23:59
 */
public class SummerTextField implements TextField {
  public void display() {
    System.out.println("显示浅蓝色文本框");
  }
}
