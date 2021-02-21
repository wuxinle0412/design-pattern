package org.example.abstractfactory.product.combobox;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 0:02
 * Description: Spring组合框类，充当具体产品
 */
public class SpringComboBox implements ComboBox {
  public void display() {
    System.out.println("显示绿色边框组合框");
  }
}
