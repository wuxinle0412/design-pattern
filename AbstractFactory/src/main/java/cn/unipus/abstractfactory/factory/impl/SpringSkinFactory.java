package cn.unipus.abstractfactory.factory.impl;

import cn.unipus.abstractfactory.factory.SkinFactory;
import cn.unipus.abstractfactory.product.Button;
import cn.unipus.abstractfactory.product.ComboBox;
import cn.unipus.abstractfactory.product.TextField;
import cn.unipus.abstractfactory.product.button.SpringButton;
import cn.unipus.abstractfactory.product.combobox.SpringComboBox;
import cn.unipus.abstractfactory.product.textfield.SpringTextField;

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
