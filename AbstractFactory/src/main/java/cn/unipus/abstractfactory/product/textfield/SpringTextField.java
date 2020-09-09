package cn.unipus.abstractfactory.product.textfield;

import cn.unipus.abstractfactory.product.TextField;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/10 23:58
 */
public class SpringTextField implements TextField {
  public void display() {
    System.out.println("显示浅绿色文本框");
  }
}
