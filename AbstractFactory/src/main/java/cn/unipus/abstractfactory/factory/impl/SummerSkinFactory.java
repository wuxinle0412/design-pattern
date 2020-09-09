package cn.unipus.abstractfactory.factory.impl;

import cn.unipus.abstractfactory.factory.SkinFactory;
import cn.unipus.abstractfactory.product.Button;
import cn.unipus.abstractfactory.product.ComboBox;
import cn.unipus.abstractfactory.product.TextField;
import cn.unipus.abstractfactory.product.button.SummerButton;
import cn.unipus.abstractfactory.product.combobox.SummerComboBox;
import cn.unipus.abstractfactory.product.textfield.SummerTextField;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 0:07
 */
public class SummerSkinFactory implements SkinFactory {
  public Button createButton() {
    return new SummerButton();
  }

  public TextField createTextField() {
    return new SummerTextField();
  }

  public ComboBox createComboBox() {
    return new SummerComboBox();
  }
}
