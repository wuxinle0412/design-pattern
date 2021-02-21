package org.example.abstractfactory.factory;

import org.example.abstractfactory.product.button.Button;
import org.example.abstractfactory.product.combobox.ComboBox;
import org.example.abstractfactory.product.textfield.TextField;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 0:01
 * Description: 界面皮肤工厂接口，充当抽象工厂
 */
public interface SkinFactory {
  Button createButton();
  TextField createTextField();
  ComboBox createComboBox();
}
