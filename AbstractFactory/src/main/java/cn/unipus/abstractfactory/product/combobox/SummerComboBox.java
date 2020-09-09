package cn.unipus.abstractfactory.product.combobox;

import cn.unipus.abstractfactory.product.ComboBox;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 0:03
 * Description: Summer组合框，充当具体产品
 */
public class SummerComboBox implements ComboBox {
  public void display() {
    System.out.println("显示蓝色边框组合框");
  }
}
