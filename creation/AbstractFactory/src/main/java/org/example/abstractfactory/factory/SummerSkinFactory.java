package org.example.abstractfactory.factory;

import org.example.abstractfactory.product.button.Button;
import org.example.abstractfactory.product.combobox.ComboBox;
import org.example.abstractfactory.product.textfield.TextField;
import org.example.abstractfactory.product.button.SummerButton;
import org.example.abstractfactory.product.combobox.SummerComboBox;
import org.example.abstractfactory.product.textfield.SummerTextField;

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
