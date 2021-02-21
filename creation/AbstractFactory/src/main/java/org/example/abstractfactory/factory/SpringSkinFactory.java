package org.example.abstractfactory.factory;

import org.example.abstractfactory.product.button.Button;
import org.example.abstractfactory.product.combobox.ComboBox;
import org.example.abstractfactory.product.textfield.TextField;
import org.example.abstractfactory.product.button.SpringButton;
import org.example.abstractfactory.product.combobox.SpringComboBox;
import org.example.abstractfactory.product.textfield.SpringTextField;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 0:06
 */
public class SpringSkinFactory implements SkinFactory {
  public Button createButton() {
    return new SpringButton();
  }

  public TextField createTextField() {
    return new SpringTextField();
  }

  public ComboBox createComboBox() {
    return new SpringComboBox();
  }
}
